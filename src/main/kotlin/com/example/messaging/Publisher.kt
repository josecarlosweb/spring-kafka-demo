package com.example.messaging

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component
import java.util.*

@Component
class Publisher(
    private val kafkaTemplate: KafkaTemplate<String, String>
) {

    fun publishMessage(message: String){
        val newMessage = "$message - ${Date().time}"
        kafkaTemplate.send("kafka-example-sd", newMessage)
    }

}