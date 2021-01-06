package com.example.form

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/form")
class HttpController(private val repository: Repository) {

    @PostMapping("/save")
    fun save(@RequestBody user: User){
        repository.save(user)
        println("Tmp Logging!")
    }

}