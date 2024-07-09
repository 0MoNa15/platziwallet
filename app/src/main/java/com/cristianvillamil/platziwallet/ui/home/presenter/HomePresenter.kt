package com.cristianvillamil.platziwallet.ui.home.presenter

import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.model.HomeContract
import com.cristianvillamil.platziwallet.ui.home.model.HomeInteractor

class HomePresenter(private val view : HomeContract.View) : HomeContract.Presenter{

    private val homeInteractor = HomeInteractor()

    override fun retrieveFavoriteTransfers() {
        view.showLoader()
        homeInteractor.retrieveFavoriteTransferFromCache(object : HomeContract.OnResponseCallback {
            override fun onResponse(favoriteList: List<FavoriteTransfer>) {
                view.hideLoader()
                view.showFavoriteTransfer(favoriteList)
            }
        })
    }
}