package com.example.kotlindemo.resolver

import com.example.kotlindemo.dto.CreateAuthorInput
import com.example.kotlindemo.model.Author
import com.example.kotlindemo.service.AuthorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class AuthorResolver {
    @Autowired
    private lateinit var authorService: AuthorService

    @QueryMapping
    fun authors(): List<Author> {
        return authorService.findAll()
    }

    @MutationMapping
    fun addAuthor(@Argument input: CreateAuthorInput): Author {
        return authorService.createAuthor(input)
    }

    @MutationMapping
    fun removeAuthor(@Argument id: String): Author? {
        return authorService.deleteAuthor(id)
    }
}