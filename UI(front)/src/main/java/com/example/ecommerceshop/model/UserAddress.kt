package com.example.ecommerceshop.model

import android.os.Parcelable
import com.example.businesslogic.model.AddressDomainModel
import kotlinx.serialization.Serializable
import kotlinx.parcelize.Parcelize

@Serializable
@Parcelize
data class UserAddress (
    val addressLine: String,
    val city: String,
    val state: String,
    val postalCode: String,
    val country: String
): Parcelable {
    override fun toString(): String {
        return "$addressLine, $city, $state, $postalCode, $country"
    }

    fun toAddressDataModel() = AddressDomainModel(
        addressLine,
        city,
        state,
        postalCode,
        country
    )
}