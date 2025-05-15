package com.example.businesslogic.repository

import com.example.businesslogic.model.CategoriesListModel
import com.example.businesslogic.network.ResultWrapper

interface CategoryRepository {
    suspend fun getCategories(): ResultWrapper<CategoriesListModel>
}