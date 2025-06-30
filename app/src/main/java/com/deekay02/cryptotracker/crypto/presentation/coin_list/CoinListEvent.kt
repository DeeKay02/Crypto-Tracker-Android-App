package com.deekay02.cryptotracker.crypto.presentation.coin_list

import com.deekay02.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError) : CoinListEvent
}