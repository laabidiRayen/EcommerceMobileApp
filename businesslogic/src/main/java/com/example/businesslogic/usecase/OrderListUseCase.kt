package com.example.businesslogic.usecase

import com.example.businesslogic.model.OrdersListModel
import com.example.businesslogic.repository.OrderRepository

class OrderListUseCase(
    private val repository: OrderRepository
) {
    suspend fun execute(userId: Long) = repository.getOrderList(userId)
}