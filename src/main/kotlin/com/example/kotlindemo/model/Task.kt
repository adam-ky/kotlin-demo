package com.example.kotlindemo.model

import jakarta.persistence.*

@Entity
@Table(name = "task", schema = "public")
class Task(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        var title: String,
        var description: String,
        var isComplete: Boolean,
        var authorId: String?
)
