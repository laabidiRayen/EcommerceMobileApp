package com.example.ecommerceshop.navigation

import android.os.Parcelable
import com.example.ecommerceshop.model.UserAddress
import kotlinx.serialization.Serializable
import kotlinx.parcelize.Parcelize

@Serializable
@Parcelize
data class UserAddressRouteWrapper(
    val userAddress: UserAddress?
) : Parcelable
