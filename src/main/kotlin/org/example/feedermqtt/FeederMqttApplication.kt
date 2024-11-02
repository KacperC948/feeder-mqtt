package org.example.feedermqtt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FeederMqttApplication

fun main(args: Array<String>) {
	runApplication<FeederMqttApplication>(*args)
}
