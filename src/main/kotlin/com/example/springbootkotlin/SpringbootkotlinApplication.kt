package com.example.springbootkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class SpringbootkotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringbootkotlinApplication>(*args)

    @GetMapping
    fun sayHello(): String {
        return "Hello World"
    }
}
