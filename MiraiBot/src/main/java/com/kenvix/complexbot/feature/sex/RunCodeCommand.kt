package com.kenvix.complexbot.feature.sex

import com.kenvix.complexbot.BotCommandFeature
import net.mamoe.mirai.event.events.MessageEvent

object RunCodeCommand : BotCommandFeature {
    override val description: String
        get() = "在线运行代码"

    override suspend fun onMessage(msg: MessageEvent) {

    }

    fun getSessionKey(groupId: Long) {

    }
}