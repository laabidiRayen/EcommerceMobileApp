package com.example.businesslogic.repository

import com.example.businesslogic.model.AddressDomainModel
import com.example.businesslogic.model.OrdersListModel
import com.example.businesslogic.network.ResultWrapper

interface OrderRepository {
    suspend fun placeOrder(addressDomainModel: AddressDomainModel): ResultWrapper<Long>
    suspend fun getOrderList(): ResultWrapper<OrdersListModel>
}