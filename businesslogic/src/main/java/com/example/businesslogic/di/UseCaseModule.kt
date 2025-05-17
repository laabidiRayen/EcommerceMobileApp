package com.example.businesslogic.di

import com.example.businesslogic.usecase.AddToCartUseCase
import com.example.businesslogic.usecase.CartSummaryUseCase
import com.example.businesslogic.usecase.DeleteProductUseCase
import com.example.businesslogic.usecase.GetCartUseCase
import com.example.businesslogic.usecase.GetCategoriesUseCase
import com.example.businesslogic.usecase.GetProductUseCase
import com.example.businesslogic.usecase.OrderListUseCase
import com.example.businesslogic.usecase.PlaceOrderUseCase
import com.example.businesslogic.usecase.UpdateQuantityUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory { GetProductUseCase(get()) }
    factory { GetCategoriesUseCase(get()) }
    factory { AddToCartUseCase(get()) }
    factory { GetCartUseCase(get()) }
    factory { UpdateQuantityUseCase(get()) }
    factory { DeleteProductUseCase(get()) }
    factory { CartSummaryUseCase(get()) }
    factory { PlaceOrderUseCase(get()) }
    factory { OrderListUseCase(get()) }
}