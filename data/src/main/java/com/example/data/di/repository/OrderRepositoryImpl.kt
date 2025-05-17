package com.example.data.di.repository

import com.example.businesslogic.model.AddressDomainModel
import com.example.businesslogic.model.OrdersListModel
import com.example.businesslogic.network.NetworkService
import com.example.businesslogic.network.ResultWrapper
import com.example.businesslogic.repository.OrderRepository

class OrderRepositoryImpl(private val networkService: NetworkService): OrderRepository {
    override suspend fun placeOrder(addressDomainModel: AddressDomainModel): ResultWrapper<Long> {
        return networkService.placeOrder(addressDomainModel, 1)
    }

    override suspend fun getOrderList(): ResultWrapper<OrdersListModel> {
        return networkService.getOrderList()
    }
}