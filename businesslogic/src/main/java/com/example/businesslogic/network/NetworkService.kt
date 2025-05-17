package com.example.businesslogic.network

import com.example.businesslogic.model.AddressDomainModel
import com.example.businesslogic.model.CartItemModel
import com.example.businesslogic.model.CartModel
import com.example.businesslogic.model.CartSummary
import com.example.businesslogic.model.CategoriesListModel
import com.example.businesslogic.model.OrdersListModel
import com.example.businesslogic.model.ProductListModel
import com.example.businesslogic.model.request.AddCartRequestModel

interface NetworkService {
    suspend fun getProducts(category: Int?): ResultWrapper<ProductListModel>
    suspend fun getCategories(): ResultWrapper<CategoriesListModel>

    suspend fun addProductToCart(
        request: AddCartRequestModel
    ): ResultWrapper<CartModel>

    suspend fun getCart(): ResultWrapper<CartModel>
    suspend fun updateQuantity(cartItemModel: CartItemModel): ResultWrapper<CartModel>
    suspend fun deleteItem(cartItemId: Int, userId: Int): ResultWrapper<CartModel>
    suspend fun getCartSummary(userId: Int): ResultWrapper<CartSummary>
    suspend fun placeOrder(address: AddressDomainModel, userId: Int): ResultWrapper<Long>
    suspend fun getOrderList(): ResultWrapper<OrdersListModel>
}

sealed class ResultWrapper<out T> {
    data class Success<out T>(val value: T) : ResultWrapper<T>()
    data class Failure(val exception: Exception) : ResultWrapper<Nothing>()
}