package com.example.businesslogic.di

import org.koin.dsl.module

val businesslogicModule = module{
    includes(UseCaseModule)
}