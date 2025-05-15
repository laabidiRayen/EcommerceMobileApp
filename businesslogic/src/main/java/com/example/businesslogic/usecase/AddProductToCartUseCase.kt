package com.example.businesslogic.usecase

import com.example.businesslogic.model.Product
import com.example.businesslogic.repository.CartRepository

class AddProductToCartUseCase(private val repository: CartRepository) {
    suspend fun execute(product: Product, userId:Int) = repository.addProductToCart(product, userId)
}