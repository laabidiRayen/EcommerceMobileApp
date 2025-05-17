package com.example.businesslogic.usecase

import com.example.businesslogic.repository.UserRepository

class LoginUseCase(private val userRepository: UserRepository) {
    suspend fun execute(username: String, password: String) =
        userRepository.login(username, password)
}