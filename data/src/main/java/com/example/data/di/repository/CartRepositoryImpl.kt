package com.example.data.di.repository

import android.util.Log
import com.example.businesslogic.model.CartItem
import com.example.businesslogic.model.Product
import com.example.businesslogic.model.response.CartResponse
import com.example.businesslogic.model.response.CategoryResponse
import com.example.businesslogic.network.NetworkService
import com.example.businesslogic.network.ResultWrapper
import com.example.businesslogic.repository.CartRepository
import com.example.businesslogic.repository.CategoryRepository


class CartRepositoryImpl(private val networkService: NetworkService) : CartRepository {
    override suspend fun getCartItems(userId: Int): ResultWrapper<CartResponse> {
        return networkService.getCart(userId)
    }

    override suspend fun addProductToCart(
        product: Product, userId: Int
    ): ResultWrapper<CartResponse> {
        return networkService.addProductToCart(product, userId)
    }

    override suspend fun removeProductFromCart(
        cartItemId: Int,
        userId: Int
    ): ResultWrapper<CartResponse> {
        return networkService.removeProductFromCart(cartItemId, userId)
    }

    override suspend fun updateQuantity(
        cartItem: CartItem, userId: Int
    ): ResultWrapper<CartResponse> {
        Log.d("CartRepositoryImpl", "updateQuantity: $cartItem")
        return networkService.updateQuantity(cartItem, userId)
    }
}