package com.example.ecommerceshop.di

import org.koin.dsl.module

val UIModule = module{
    includes(viewModelModule)

}