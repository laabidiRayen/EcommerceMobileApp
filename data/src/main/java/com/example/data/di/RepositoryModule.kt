package com.example.data.di

import com.example.businesslogic.repository.ProductRepository
import com.example.data.di.repository.ProductRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<ProductRepository> { ProductRepositoryImpl(get()) }
}