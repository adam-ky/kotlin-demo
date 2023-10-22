package com.example.kotlindemo.resolver

import com.example.kotlindemo.dto.CreateTaskInput
import com.example.kotlindemo.dto.UpdateTaskInput
import com.example.kotlindemo.model.Author
import com.example.kotlindemo.model.Task
import com.example.kotlindemo.service.AuthorService
import com.example.kotlindemo.service.TaskService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller

@Controller
class TaskResolver {
    @Autowired
    private lateinit var taskService: TaskService

    @Autowired
    private lateinit var authorService: AuthorService

    @QueryMapping
    fun taskById(@Argument id: String): Task? {
        return taskService.findById(id)
    }

    @QueryMapping
    fun tasks(): List<Task> {
        return taskService.findAll()
    }

    @MutationMapping
    fun addTask(@Argument input: CreateTaskInput): Task {
        return taskService.createTask(input)
    }

    @MutationMapping
    fun updateTask(@Argument id: String, @Argument input: UpdateTaskInput): Task? {
        return taskService.updateTask(id, input)
    }

    @MutationMapping
    fun removeTask(@Argument id: String): Task? {
        return taskService.deleteTask(id)
    }

    @SchemaMapping
    fun author(task: Task): Author? {
        val authorId = task.authorId ?: return null
        return authorService.findById(authorId)
    }
}