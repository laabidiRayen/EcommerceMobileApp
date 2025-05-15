package com.example.businesslogic.usecase

import com.example.businesslogic.repository.CartRepository

class CartSummaryUseCase (private val repository: CartRepository) {
    suspend fun execute(userId: Int) = repository.getCartSummary(userId)
}