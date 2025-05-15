package com.example.data.di.repository

import com.example.businesslogic.model.Product
import com.example.businesslogic.model.ProductListModel
import com.example.businesslogic.network.NetworkService
import com.example.businesslogic.network.ResultWrapper
import com.example.businesslogic.repository.ProductRepository

class ProductRepositoryImpl(private val networkService: NetworkService) : ProductRepository {
    override suspend fun getProducts(category: Int?): ResultWrapper<ProductListModel> {
        return networkService.getProducts(category)
    }
}