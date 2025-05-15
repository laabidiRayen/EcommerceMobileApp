package com.example.businesslogic.usecase

import com.example.businesslogic.repository.CartRepository

class GetCartUseCase(private val repository: CartRepository) {
    suspend fun execute(userId:Int) = repository.getCartItems(userId)
}