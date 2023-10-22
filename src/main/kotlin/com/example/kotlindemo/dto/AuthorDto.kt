package com.example.kotlindemo.dto

data class CreateAuthorInput(
    val firstName: String,
    val lastName: String,
    val email: String?
)
