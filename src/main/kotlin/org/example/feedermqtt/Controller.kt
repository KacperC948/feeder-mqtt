package org.example.feedermqtt

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

//@CrossOrigin(origins = ["http://localhost:3000"])
@RestController
class Controller {

    @Autowired
    lateinit var testService: TestService

    @GetMapping("/test")
    fun blog(): String {
        testService.publishManually("Hello, World!".toByteArray())
        return "blog"
    }

//    @CrossOrigin(origins = ["http://localhost:3000"])
    @PostMapping("/post")
    fun postMessage(@RequestBody message: String): String {
        testService.publishManually(message.toByteArray())
        return "Message published"
    }

//    @CrossOrigin(origins = ["http://localhost:3000"])
    @PostMapping("/times")
    fun postTimes(@RequestBody message: String): String {
        testService.publishManually(message.toByteArray())
        return "Message published"
    }

}