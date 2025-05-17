package com.example.data.di.model.response

import kotlinx.serialization.Serializable

@Serializable
data class UserResponse(
    val id: Int?,
    val username: String,
    val email: String,
    val name: String
) {
    fun toDomainModel() = com.example.businesslogic.model.UserDomainModel(
        id = id,
        username = username,
        email = email,
        name = name
    )
}