package com.example.shoppinglist.di

import android.app.Application
import android.content.Context
import com.example.shoppinglist.presentation.MainActivity
import com.example.shoppinglist.presentation.ShopItemFragment
import dagger.Binds
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [
    DataModule::class,
    ViewModelModule::class
])
interface AppComponent {

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance application: Application
        ): AppComponent
    }
    fun inject(activity: MainActivity)
    fun inject(fragment: ShopItemFragment)
}