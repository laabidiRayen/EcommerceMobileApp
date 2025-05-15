package com.example.businesslogic.model.response

import com.example.businesslogic.model.CategoryModel
import kotlinx.serialization.Serializable

@Serializable
data class CategoryResponse(
    val data: List<CategoryModel>,
    val msg: String
)