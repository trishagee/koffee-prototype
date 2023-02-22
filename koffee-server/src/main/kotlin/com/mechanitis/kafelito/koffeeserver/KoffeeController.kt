package com.mechanitis.kafelito.koffeeserver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KoffeeController {

    @GetMapping("/coffeeshop")
    fun index(): List<String> = listOf(
        "Coffee!"
    )
}