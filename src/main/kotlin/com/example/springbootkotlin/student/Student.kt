package com.example.springbootkotlin.student

import java.time.LocalDate

data class Student @JvmOverloads constructor (val id: Double? = null, val name: String, val age: Int? = null, val dateOfBirth: LocalDate, val email: String = ""){

}