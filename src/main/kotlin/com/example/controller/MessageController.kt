package com.example.controller

import com.example.handler.MessageHandler
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/Message")
class MessageController(
    private val messageHandler: MessageHandler
) {

    @PostMapping
    fun publish(@RequestBody message: String): Mono<String> {
        return Mono.just(messageHandler.publish(message))
    }

}