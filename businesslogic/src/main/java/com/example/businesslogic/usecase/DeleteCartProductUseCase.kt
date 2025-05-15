package com.example.businesslogic.usecase

import com.example.businesslogic.repository.CartRepository

class DeleteCartProductUseCase(private val repository: CartRepository) {
    suspend fun execute(cartItemID: Int, userId: Int) = repository.removeProductFromCart(cartItemID, userId)
}