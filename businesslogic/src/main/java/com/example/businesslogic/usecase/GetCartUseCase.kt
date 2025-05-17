package com.example.businesslogic.usecase

import com.example.businesslogic.repository.CartRepository

class GetCartUseCase(val cartRepository: CartRepository) {
    suspend fun execute(userId: Long) = cartRepository.getCart(userId)
}