package com.example.businesslogic.repository

import com.example.businesslogic.model.response.CategoryResponse
import com.example.businesslogic.network.ResultWrapper

interface CategoryRepository {
    suspend fun getCategories(): ResultWrapper<CategoryResponse>
}