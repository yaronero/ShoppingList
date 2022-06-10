package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopListUseCase(): LiveData<List<ShopItem>>{
        return shopListRepository.getShopList()
    }
}