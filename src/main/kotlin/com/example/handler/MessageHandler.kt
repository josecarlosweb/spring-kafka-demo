package com.example.handler

import com.example.messaging.Publisher
import org.springframework.stereotype.Component

@Component
class MessageHandler(
    private val publisher: Publisher
) {

    fun publish(message: String): String {
        publisher.publishMessage(message)
        return message
    }

}