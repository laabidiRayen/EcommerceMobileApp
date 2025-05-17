package com.example.businesslogic.usecase

import com.example.businesslogic.model.CartItemModel
import com.example.businesslogic.repository.CartRepository

class UpdateQuantityUseCase(private val cartRepository: CartRepository) {
    suspend fun execute(cartItemModel: CartItemModel, userId: Long) =
        cartRepository.updateQuantity(cartItemModel, userId)
}