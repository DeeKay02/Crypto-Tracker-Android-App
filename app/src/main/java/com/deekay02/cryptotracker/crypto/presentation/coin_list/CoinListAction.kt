package com.deekay02.cryptotracker.crypto.presentation.coin_list

import com.deekay02.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinCLick(val coinUi: CoinUi): CoinListAction
}