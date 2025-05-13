package com.example.businesslogic.usecase

import com.example.businesslogic.repository.ProductRepository

class GetProductUseCase(private val repository: ProductRepository) {
    suspend fun execute(category:String?) = repository.getProducts(category)
}