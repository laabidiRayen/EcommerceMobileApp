package com.example.data.di.model.response

import com.example.data.di.model.DataProductModel
import kotlinx.serialization.Serializable

@Serializable
data class ProductListResponse(
    val `data`: List<DataProductModel>,
    val msg: String
) {
    fun toProductList() = com.example.businesslogic.model.ProductListModel(
        products = `data`.map { it.toProduct() },
        msg = msg
    )
}