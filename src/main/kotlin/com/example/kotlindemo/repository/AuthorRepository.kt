package com.example.kotlindemo.repository

import com.example.kotlindemo.model.Author
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository: JpaRepository<Author, String> {}