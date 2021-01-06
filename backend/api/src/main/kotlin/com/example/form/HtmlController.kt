package com.example.form

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/form")
class HtmlController(private val repository: Repository) {

    @PostMapping("/save")
    fun save(user: User){
        repository.save(user)
    }

    fun User.render() = RenderedUser(
        id,
        firstName,
        lastName,
        phoneNumber,
        email,
        zipCode
    )

    data class RenderedUser(
        val id: Long?,
        val firstName : String,
        val lastName: String,
        val phoneNumber: String,
        val email: String,
        val zipCode: String
    )

}