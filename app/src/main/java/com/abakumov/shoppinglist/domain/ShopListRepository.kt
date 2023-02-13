package com.abakumov.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItemList(): LiveData<List<ShopItem>>

    fun getShopItem(shopItemId: Int): ShopItem
}

