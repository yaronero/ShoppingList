package com.example.shoppinglist.presentation

import android.app.Application
import com.example.shoppinglist.di.DaggerAppComponent

class ShopListApplication : Application() {

    val component by lazy {
        DaggerAppComponent.factory().create(this)
    }
}