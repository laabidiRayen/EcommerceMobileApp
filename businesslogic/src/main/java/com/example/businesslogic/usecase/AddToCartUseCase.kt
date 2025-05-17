package com.example.businesslogic.usecase

import com.example.businesslogic.model.request.AddCartRequestModel
import com.example.businesslogic.repository.CartRepository

class AddToCartUseCase(private val cartRepository: CartRepository) {
    suspend fun execute(request: AddCartRequestModel, userId: Long) = cartRepository.addProductToCart(request,userId)
}