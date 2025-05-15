package com.example.businesslogic.model.response

import com.example.businesslogic.model.CartItem
import kotlinx.serialization.Serializable

@Serializable
data class CartResponse(
    val data: List<CartItem>,
    val msg: String
)