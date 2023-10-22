package com.example.kotlindemo.repository

import com.example.kotlindemo.model.Task
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskRepository: JpaRepository<Task, String> {}