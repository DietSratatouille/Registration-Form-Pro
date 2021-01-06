package com.example.form

import java.io.File
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User(
    var firstName: String,
    var lastName: String,
    var phoneNumber: String,
    var email: String,
    var zipCode: String,
    //var resumeFile: File
    @Id @GeneratedValue var id: Long? = null
)