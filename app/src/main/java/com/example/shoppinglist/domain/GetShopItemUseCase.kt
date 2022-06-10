package com.example.shoppinglist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItemUseCase(shopItemId: Int){
        return shopListRepository.getShopItem(shopItemId)
    }
}