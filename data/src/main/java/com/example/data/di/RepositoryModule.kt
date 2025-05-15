package com.example.data.di

import com.example.businesslogic.repository.CartRepository
import com.example.businesslogic.repository.CategoryRepository
import com.example.businesslogic.repository.ProductRepository
import com.example.data.di.repository.CategoryRepositoryImpl
import com.example.data.di.repository.ProductRepositoryImpl
import com.example.data.di.repository.CartRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<ProductRepository> { ProductRepositoryImpl(get()) }
    single<CategoryRepository> { CategoryRepositoryImpl(get()) }
    single<CartRepository> { CartRepositoryImpl(get()) }
}