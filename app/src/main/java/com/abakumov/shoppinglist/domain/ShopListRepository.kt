package com.abakumov.shoppinglist.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItemList(): List<ShopItem>

    fun getShopItem(shopItemId: Int): ShopItem
}

