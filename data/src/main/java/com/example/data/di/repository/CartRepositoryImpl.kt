package com.example.data.di.repository

import com.example.businesslogic.model.CartItemModel
import com.example.businesslogic.model.CartModel
import com.example.businesslogic.model.CartSummary
import com.example.businesslogic.model.request.AddCartRequestModel
import com.example.businesslogic.network.NetworkService
import com.example.businesslogic.network.ResultWrapper
import com.example.businesslogic.repository.CartRepository

class CartRepositoryImpl(val networkService: NetworkService) : CartRepository {
    override suspend fun addProductToCart(request: AddCartRequestModel): ResultWrapper<CartModel> {
        return networkService.addProductToCart(request)
    }

    override suspend fun getCart(): ResultWrapper<CartModel> {
        return networkService.getCart()
    }

    override suspend fun updateQuantity(cartItemModel: CartItemModel): ResultWrapper<CartModel> {
        return networkService.updateQuantity(cartItemModel)
    }

    override suspend fun deleteItem(cartItemId: Int, userId: Int): ResultWrapper<CartModel> {
        return networkService.deleteItem(cartItemId, userId)
    }

    override suspend fun getCartSummary(userId: Int): ResultWrapper<CartSummary> {
        return networkService.getCartSummary(userId)
    }
}