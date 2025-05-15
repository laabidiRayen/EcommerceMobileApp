package com.example.businesslogic.repository

import com.example.businesslogic.model.Product
import com.example.businesslogic.model.response.ProductResponse
import com.example.businesslogic.network.ResultWrapper

interface ProductRepository {
    suspend fun getProducts(category:Int?): ResultWrapper<ProductResponse>
}