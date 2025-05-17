package com.example.businesslogic.repository

import com.example.businesslogic.model.AddressDomainModel
import com.example.businesslogic.model.OrdersListModel
import com.example.businesslogic.network.ResultWrapper

interface OrderRepository {
    suspend fun placeOrder(addressDomainModel: AddressDomainModel, userId: Long): ResultWrapper<Long>
    suspend fun getOrderList(userId: Long): ResultWrapper<OrdersListModel>
}