package com.example.form

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FormConfiguration {

    @Bean
    fun dbInitializer(repository: Repository) = ApplicationRunner {
        val test = repository.save(User(
            id = 1,
            firstName = "Test",
            lastName = "Testmore",
            phoneNumber = "111-111-1111",
            email = "Test.Testmore@gmail.com",
            zipCode = "10111"
        ))
    }
}