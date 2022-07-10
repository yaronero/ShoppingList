package com.example.shoppinglist.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shop_items")
class ShopItemDbModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    var name: String,
    var count: Int,
    var enabled: Boolean
)