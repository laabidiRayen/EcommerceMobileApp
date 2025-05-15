package com.example.data.di.repository

import com.example.businesslogic.model.Product
import com.example.businesslogic.model.response.ProductResponse
import com.example.businesslogic.network.NetworkService
import com.example.businesslogic.network.ResultWrapper
import com.example.businesslogic.repository.ProductRepository

class ProductRepositoryImpl(private val networkService: NetworkService) : ProductRepository {
    override suspend fun getProducts(category: Int?): ResultWrapper<ProductResponse> {
        return networkService.getProducts(category)
    }
}