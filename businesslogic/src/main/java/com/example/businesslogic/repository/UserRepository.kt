package com.example.businesslogic.repository

import com.example.businesslogic.model.UserDomainModel
import com.example.businesslogic.network.ResultWrapper

interface UserRepository {
    suspend fun login(email: String, password: String): ResultWrapper<UserDomainModel>
    suspend fun register(
        email: String,
        password: String,
        name: String
    ): ResultWrapper<UserDomainModel>
}