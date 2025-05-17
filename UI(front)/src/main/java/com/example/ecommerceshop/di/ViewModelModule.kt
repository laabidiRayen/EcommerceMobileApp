package com.example.ecommerceshop.di

import com.example.ecommerceshop.ui.feature.cart.CartViewModel
import com.example.ecommerceshop.ui.feature.home.HomeViewModel
import com.example.ecommerceshop.ui.feature.orders.OrdersViewModel
import com.example.ecommerceshop.ui.feature.product_details.ProductDetailsViewModel
import com.example.ecommerceshop.ui.feature.summary.CartSummaryViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        HomeViewModel(get(), get())
    }
    viewModel {
        ProductDetailsViewModel(get())
    }
    viewModel {
        CartViewModel(get(),get(),get())
    }
    viewModel {
        CartSummaryViewModel(get(), get())
    }
    viewModel {
        OrdersViewModel(get())
    }
}