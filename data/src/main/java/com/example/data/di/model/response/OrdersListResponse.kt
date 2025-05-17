package com.example.data.di.model.response

import kotlinx.serialization.Serializable


@Serializable
data class OrdersListResponse(
    val `data`: List<OrderListData>,
    val msg: String
) {
    fun toDomainResponse(): com.example.businesslogic.model.OrdersListModel {
        return com.example.businesslogic.model.OrdersListModel(
            `data` = `data`.map { it.toDomainResponse() },
            msg = msg
        )
    }
}