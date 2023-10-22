package com.example.kotlindemo.dto

data class CreateTaskInput(
    val title: String,
    val description: String,
    val authorId: String?
)

data class UpdateTaskInput(
    val title: String?,
    val description: String?,
    val isComplete: Boolean?,
    val authorId: String?
)
