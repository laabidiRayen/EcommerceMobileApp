package com.example.data.di.model

import kotlinx.serialization.Serializable

@Serializable
data class CategoryDataModel(
    val id: Int,
    val image: String,
    val title: String
) {
    fun toCategory() = com.example.businesslogic.model.Category(
        id = id,
        image = image,
        title = title
    )
}