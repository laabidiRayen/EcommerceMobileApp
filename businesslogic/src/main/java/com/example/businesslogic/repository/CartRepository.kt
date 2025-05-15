package com.example.businesslogic.repository

import com.example.businesslogic.model.CartItemModel
import com.example.businesslogic.model.CartModel
import com.example.businesslogic.model.CartSummary
import com.example.businesslogic.model.request.AddCartRequestModel
import com.example.businesslogic.network.ResultWrapper

interface CartRepository {
    suspend fun addProductToCart(
        request: AddCartRequestModel
    ): ResultWrapper<CartModel>

    suspend fun getCart(): ResultWrapper<CartModel>
    suspend fun updateQuantity(cartItemModel: CartItemModel): ResultWrapper<CartModel>
    suspend fun deleteItem(cartItemId: Int, userId: Int): ResultWrapper<CartModel>
    suspend fun getCartSummary(userId: Int): ResultWrapper<CartSummary>
}