package com.example.businesslogic.usecase

import com.example.businesslogic.repository.CategoryRepository

class GetCategoriesUseCase (private val repository: CategoryRepository) {
    suspend fun execute() = repository.getCategories()
}