package com.example.data.di.model.response

import kotlinx.serialization.Serializable

@Serializable
data class CartResponse(
    val data: List<CartItem>,
    val msg: String
) {
    fun toCartModel(): com.example.businesslogic.model.CartModel {
        return com.example.businesslogic.model.CartModel(
            data = data.map { it.toCartItemModel() },
            msg = msg
        )
    }
}