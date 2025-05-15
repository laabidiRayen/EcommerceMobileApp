package com.example.businesslogic.di

import com.example.businesslogic.usecase.GetCategoriesUseCase
import com.example.businesslogic.usecase.GetProductUseCase
import com.example.businesslogic.usecase.AddProductToCartUseCase
import com.example.businesslogic.usecase.DeleteCartProductUseCase
import com.example.businesslogic.usecase.GetCartUseCase
import com.example.businesslogic.usecase.UpdateQuantityUseCase
import org.koin.dsl.module

val UseCaseModule = module {
    factory { GetProductUseCase(get()) }
    factory { GetCategoriesUseCase(get()) }
    factory { AddProductToCartUseCase(get()) }
    factory { GetCartUseCase(get()) }
    factory { UpdateQuantityUseCase(get()) }
    factory { DeleteCartProductUseCase(get()) }
}