package com.example.kotlindemo.service

import com.example.kotlindemo.dto.CreateAuthorInput
import com.example.kotlindemo.model.Author
import com.example.kotlindemo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class AuthorService() {
    @Autowired
    private lateinit var authorRepository: AuthorRepository

    fun findById(id: String): Author? {
        return authorRepository.findById(id).orElse(null)
    }

    fun findAll(): List<Author> {
        return authorRepository.findAll()
    }

    fun createAuthor(input: CreateAuthorInput): Author {
        val (firstName, lastName, email) = input
        val newAuthor = Author(
            id = 0,
            firstName = firstName,
            lastName = lastName,
            email = email
        )
        return authorRepository.save(newAuthor)
    }

    fun deleteAuthor(id: String): Author? {
        val authorToDelete = authorRepository.findById(id)

        if (authorToDelete.isEmpty) {
            return null
        }

        val deletedAuthor = authorToDelete.get()
        authorRepository.deleteById(id)

        return deletedAuthor
    }
}
