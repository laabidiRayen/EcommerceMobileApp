package com.example.businesslogic.repository

import com.example.businesslogic.model.CartItemModel
import com.example.businesslogic.model.CartModel
import com.example.businesslogic.model.CartSummary
import com.example.businesslogic.model.request.AddCartRequestModel
import com.example.businesslogic.network.ResultWrapper

interface CartRepository {
    suspend fun addProductToCart(
        request: AddCartRequestModel, userId: Long
    ): ResultWrapper<CartModel>

    suspend fun getCart(userId: Long): ResultWrapper<CartModel>
    suspend fun updateQuantity(cartItemModel: CartItemModel, userId: Long): ResultWrapper<CartModel>
    suspend fun deleteItem(cartItemId: Int, userId: Long): ResultWrapper<CartModel>
    suspend fun getCartSummary(userId: Long): ResultWrapper<CartSummary>
}