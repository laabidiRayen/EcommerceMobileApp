package com.example.ecommerceshop.ui.feature.product_details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.businesslogic.model.request.AddCartRequestModel
import com.example.businesslogic.usecase.AddToCartUseCase
import com.example.ecommerceshop.model.UiProductModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProductDetailsViewModel(val useCase: AddToCartUseCase) : ViewModel() {

    private val _state = MutableStateFlow<ProductDetailsEvent>(ProductDetailsEvent.Nothing)
    val state = _state.asStateFlow()
    val userDomainModel = com.example.ecommerceshop.ShopperSession.getUser()
    fun addProductToCart(product: UiProductModel) {
        viewModelScope.launch {
            _state.value = ProductDetailsEvent.Loading
            val result = useCase.execute(
                AddCartRequestModel(
                    product.id,
                    product.title,
                    product.price,
                    1,
                    userDomainModel!!.id!!
                ),
                userDomainModel.id!!.toLong()
            )
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