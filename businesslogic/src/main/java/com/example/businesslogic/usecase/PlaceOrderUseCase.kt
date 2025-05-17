package com.example.businesslogic.usecase

import com.example.businesslogic.model.AddressDomainModel
import com.example.businesslogic.repository.OrderRepository

class PlaceOrderUseCase(val orderRepository: OrderRepository) {
    suspend fun execute(addressDomainModel: AddressDomainModel) =
        orderRepository.placeOrder(addressDomainModel)
}