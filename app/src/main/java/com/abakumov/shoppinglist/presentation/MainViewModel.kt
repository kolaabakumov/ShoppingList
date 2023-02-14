package com.abakumov.shoppinglist.presentation

import androidx.lifecycle.ViewModel
import com.abakumov.shoppinglist.data.ShopListRepositoryImpl
import com.abakumov.shoppinglist.domain.DeleteShopItemUseCase
import com.abakumov.shoppinglist.domain.EditShopItemUseCase
import com.abakumov.shoppinglist.domain.GetShopItemListUseCase
import com.abakumov.shoppinglist.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopItemListUseCase = GetShopItemListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopItemListUseCase.getShopItemList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnabledState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }

}
