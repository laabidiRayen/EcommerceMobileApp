package com.example.data.di.model.response

import com.example.data.di.model.CategoryDataModel
import kotlinx.serialization.Serializable

@Serializable
data class CategoriesListResponse(
    val `data`: List<CategoryDataModel>,
    val msg: String
) {
    fun toCategoriesList() = com.example.businesslogic.model.CategoriesListModel(
        categories = `data`.map { it.toCategory() },
        msg = msg
    )
}