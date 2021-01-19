package com.example.messaging

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import java.util.*

@Component
class Subscriber {

    private val log = LoggerFactory.getLogger(Subscriber::class.java)

    @KafkaListener(
        topics = ["kafka-example-sd"],
        groupId = "kafka-example-group"
    )
    fun subscribeMessage(message: String){
        log.info("Message received: {}. At: {}", message, Date().time)
    }

}