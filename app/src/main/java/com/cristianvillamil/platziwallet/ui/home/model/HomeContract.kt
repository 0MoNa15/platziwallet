package com.cristianvillamil.platziwallet.ui.home.model

import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer

interface HomeContract {
    interface View {
        fun showLoader()
        fun hideLoader()
        fun showFavoriteTransfer(listFavoriteTransfer: List<FavoriteTransfer>)
    }

    interface Presenter {
        fun retrieveFavoriteTransfers()
    }

    interface OnResponseCallback {
        fun onResponse(favoriteList: List<FavoriteTransfer>)
    }
}