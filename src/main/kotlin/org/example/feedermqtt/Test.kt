package org.example.feedermqtt

import com.hivemq.client.mqtt.mqtt3.Mqtt3Client
import com.hivemq.client.mqtt.mqtt3.message.publish.Mqtt3Publish
import org.springframework.stereotype.Service
import java.util.concurrent.CompletableFuture

@Service
class TestService(private val mqttClient: Mqtt3Client) {

    fun publishManually(payload: ByteArray): CompletableFuture<Mqtt3Publish> {
        return mqttClient.toAsync()
            .publish(
                Mqtt3Publish.builder()
                    .topic("twoj/topic")
                    .payload(payload)
                    .build()
            )
    }
}