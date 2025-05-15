package com.example.data.di.model

import kotlinx.serialization.Serializable

@Serializable
class DataProductModel(
    val id: Long,
    val title: String,
    val price: Double,
    val category: Int?,
    val description: String,
    val image: String
) {

    fun toProduct() = com.example.businesslogic.model.Product(
        id = id,
        title = title,
        price = price,
        categoryId = category,
        description = description,
        image = image
    )
}