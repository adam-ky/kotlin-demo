package com.example.kotlindemo.model

import jakarta.persistence.*

@Entity
@Table(name = "author", schema = "public")
class Author (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    var firstName: String,
    var lastName: String,
    var email: String?
)
