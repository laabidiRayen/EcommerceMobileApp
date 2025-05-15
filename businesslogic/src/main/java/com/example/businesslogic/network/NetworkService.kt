package com.example.businesslogic.network

import com.example.businesslogic.model.CartItem
import com.example.businesslogic.model.Product
import com.example.businesslogic.model.response.CartResponse
import com.example.businesslogic.model.response.CategoryResponse
import com.example.businesslogic.model.response.ProductResponse

interface NetworkService {
    suspend fun getProducts(category: Int?): ResultWrapper<ProductResponse>
    suspend fun getCategories(): ResultWrapper<CategoryResponse>
    suspend fun addProductToCart(product: Product, userId: Int): ResultWrapper<CartResponse>
    suspend fun getCart(userId: Int): ResultWrapper<CartResponse>
    suspend fun updateQuantity(cartItem: CartItem, userId: Int): ResultWrapper<CartResponse>
    suspend fun removeProductFromCart(cartItemId: Int, userId: Int): ResultWrapper<CartResponse>
}

sealed class ResultWrapper<out T> {
    data class Success<out T>(val value: T) : ResultWrapper<T>()
    data class Failure(val exception: Exception) : ResultWrapper<Nothing>()
}