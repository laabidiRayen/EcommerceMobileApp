package com.example.data.di.repository

import com.example.businesslogic.model.response.CategoryResponse
import com.example.businesslogic.network.NetworkService
import com.example.businesslogic.network.ResultWrapper
import com.example.businesslogic.repository.CategoryRepository

class CategoryRepositoryImpl(private val networkService: NetworkService) : CategoryRepository {
    override suspend fun getCategories(): ResultWrapper<CategoryResponse> {
        return networkService.getCategories()
    }
}