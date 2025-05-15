package com.example.data.di.repository

import com.example.data.di.model.CategoryDataModel
import com.example.businesslogic.model.CategoriesListModel
import com.example.businesslogic.network.NetworkService
import com.example.businesslogic.network.ResultWrapper
import com.example.businesslogic.repository.CategoryRepository

class CategoryRepositoryImpl(val networkService: NetworkService) : CategoryRepository {
    override suspend fun getCategories(): ResultWrapper<CategoriesListModel> {
        return networkService.getCategories()
    }
}