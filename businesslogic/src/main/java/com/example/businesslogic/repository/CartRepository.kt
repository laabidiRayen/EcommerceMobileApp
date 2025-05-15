package com.example.businesslogic.repository

import com.example.businesslogic.model.CartItem
import com.example.businesslogic.model.Product
import com.example.businesslogic.model.response.CartResponse
import com.example.businesslogic.network.ResultWrapper

interface CartRepository {
    suspend fun getCartItems(userId: Int): ResultWrapper<CartResponse>
    suspend fun addProductToCart(product: Product, userId: Int): ResultWrapper<CartResponse>
    suspend fun removeProductFromCart(cartItemId: Int, userId: Int): ResultWrapper<CartResponse>
    suspend fun updateQuantity(product: CartItem, userId: Int): ResultWrapper<CartResponse>
}