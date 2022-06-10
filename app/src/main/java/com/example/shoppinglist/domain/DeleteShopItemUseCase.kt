package com.example.shoppinglist.domain

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItemUseCase(shopItem: ShopItem){
        shopListRepository.deleteShopItem(shopItem)
    }
}