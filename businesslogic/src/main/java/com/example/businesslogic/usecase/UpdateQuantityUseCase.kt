package com.example.businesslogic.usecase

import com.example.businesslogic.model.CartItem
import com.example.businesslogic.repository.CartRepository

class UpdateQuantityUseCase(private val repository: CartRepository) {
    suspend fun execute(cartItem: CartItem, userId: Int) = repository.updateQuantity(cartItem, userId)
}