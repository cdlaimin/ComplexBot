package com.kenvix.complexbot.feature.middleware

import com.kenvix.complexbot.BotMiddleware
import com.kenvix.complexbot.isBotSystemAdministrator
import net.mamoe.mirai.contact.Member
import net.mamoe.mirai.contact.isAdministrator
import net.mamoe.mirai.event.events.MessageEvent

object AdminPermissionRequired : BotMiddleware {
    override suspend fun onMessage(msg: MessageEvent, command: String?): Boolean {
        if (isBotSystemAdministrator(msg.sender.id))
            return true

        if (msg.sender !is Member)
            return false

        if ((msg.sender as Member).isAdministrator()) {
            return true
        }

        msg.reply("权限不足：只有管理员可以执行此指令")
        return false
    }
}