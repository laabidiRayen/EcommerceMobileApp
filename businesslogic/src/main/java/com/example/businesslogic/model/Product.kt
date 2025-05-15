package com.example.businesslogic.model

import android.os.Parcelable
import kotlinx.serialization.Serializable
import kotlinx.parcelize.Parcelize


@Serializable
@Parcelize
data class Product(
    val id: Long,
    val title: String,
    val price: Double,
    val categoryId: Int?,
    val description: String,
    val image: String
) : Parcelable {
    val priceString: String
        get() = "$$price"
}