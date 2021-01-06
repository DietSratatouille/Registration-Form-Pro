package com.example.form

import org.springframework.data.repository.CrudRepository

interface Repository: CrudRepository<User, Long> {
    //fun customSave(user: User)
    fun getByEmail(email: String): User?
}