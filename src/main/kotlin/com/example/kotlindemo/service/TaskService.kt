package com.example.kotlindemo.service

import com.example.kotlindemo.dto.CreateTaskInput
import com.example.kotlindemo.dto.UpdateTaskInput
import com.example.kotlindemo.model.Task
import com.example.kotlindemo.repository.TaskRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TaskService() {
    @Autowired
    private lateinit var taskRepository: TaskRepository

    fun findById(id: String): Task? {
        return taskRepository.findById(id).orElse(null)
    }

    fun findAll(): List<Task> {
        return taskRepository.findAll()
    }

    fun createTask(input: CreateTaskInput): Task {
        val (title, description, authorId) = input
        val newTask = Task(
            id = 0,
            title = title,
            description = description,
            isComplete = false,
            authorId = authorId
        )
        return taskRepository.save(newTask)
    }

    fun updateTask(id: String, input: UpdateTaskInput): Task? {
        val taskToUpdate = taskRepository.findById(id)

        if (taskToUpdate.isEmpty) {
            return null
        }

        val task = taskToUpdate.get()
        val (title, description, isComplete, authorId) = input

        if (title != null) {
            task.title = title
        }

        if (description != null) {
            task.description = description
        }

        if (isComplete != null) {
            task.isComplete = isComplete
        }

        if (authorId != null) {
            task.authorId = authorId
        }

        return taskRepository.save(task)
    }

    fun deleteTask(id: String): Task? {
        val taskToDelete = taskRepository.findById(id)

        if (taskToDelete.isEmpty) {
            return null
        }

        val deletedTask = taskToDelete.get()
        taskRepository.deleteById(id)

        return deletedTask
    }
}