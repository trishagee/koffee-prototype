package com.mechanitis.kafelito.koffeeserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KoffeeServerApplication

fun main(args: Array<String>) {
    runApplication<KoffeeServerApplication>(*args)
}
