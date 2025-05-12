package com.example.ecommerceshop

import android.app.Application
import com.example.data.di.dataModule
import com.example.businesslogic.di.businesslogicModule
import com.example.ecommerceshop.di.UIModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ShoppingApp: Application() {

    override fun onCreate(){
        super.onCreate()
        startKoin {
            androidContext(this@ShoppingApp)
            modules(listOf(
                UIModule,
                dataModule,
                businesslogicModule
            ))
        }
    }
}