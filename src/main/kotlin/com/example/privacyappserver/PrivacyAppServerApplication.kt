package com.example.privacyappserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

const val hostName = "localhost"
const val port = 6379

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class PrivacyAppServerApplication


fun main(args: Array<String>) {
    runApplication<PrivacyAppServerApplication>(*args)
}
