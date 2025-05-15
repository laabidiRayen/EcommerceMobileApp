package com.example.ecommerceshop.ui.feature.product_details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.businesslogic.model.Product
import com.example.businesslogic.usecase.AddProductToCartUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProductDetailsViewModel(val useCase: AddProductToCartUseCase) : ViewModel() {

    private val _state = MutableStateFlow<ProductDetailsEvent>(ProductDetailsEvent.Nothing)
    val state = _state.asStateFlow()
    fun addProductToCart(product: Product) {
        viewModelScope.launch {
            _state.value = ProductDetailsEvent.Loading
            val result = useCase.execute(product, 1)
            when (result) {
                is com.example.businesslogic.network.ResultWrapper.Success -> {
                    _state.value = ProductDetailsEvent.Success("Product added to cart")
                }

                is com.example.businesslogic.network.ResultWrapper.Failure -> {
                    _state.value = ProductDetailsEvent.Error("Something went wrong!")
                }
            }
        }
    }
}

sealed class ProductDetailsEvent {
    data object Loading : ProductDetailsEvent()
    data object Nothing : ProductDetailsEvent()
    data class Success(val message: String) : ProductDetailsEvent()
    data class Error(val message: String) : ProductDetailsEvent()
}