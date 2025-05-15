package com.example.data.di.model.response

import kotlinx.serialization.Serializable

@Serializable
data class CartSummaryResponse(
    val `data`: Summary,
    val msg: String
) {
    fun toCartSummary() = com.example.businesslogic.model.CartSummary(
        data = `data`.toSummaryData(),
        msg = msg
    )
}