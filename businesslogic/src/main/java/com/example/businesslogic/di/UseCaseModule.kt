package com.example.businesslogic.di

import com.example.businesslogic.usecase.GetProductUseCase
import org.koin.dsl.module

val UseCaseModule = module {
    factory { GetProductUseCase(get()) }   // factory will help us to get this only one time and not to be kept everytime
}