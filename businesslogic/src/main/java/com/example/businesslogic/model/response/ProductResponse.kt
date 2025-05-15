package com.example.businesslogic.model.response

import com.example.businesslogic.model.Product
import kotlinx.serialization.Serializable

@Serializable
data class ProductResponse(
    val data: List<Product>,
    val msg: String
)