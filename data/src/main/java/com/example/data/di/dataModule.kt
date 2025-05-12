package com.example.data.di

import org.koin.dsl.module

val dataModule = module{
    includes(networkModule, repositoryModule)   // basically when the app runs this modules will be created
}