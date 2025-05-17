package com.example.businesslogic.usecase

import com.example.businesslogic.repository.UserRepository

class RegisterUseCase(private val userRepository: UserRepository) {
    suspend fun execute(username: String, password: String, name: String) =
        userRepository.register(username, password, name)
}