package com.deekay02.cryptotracker.crypto.domain

import com.deekay02.cryptotracker.core.domain.util.NetworkError
import com.deekay02.cryptotracker.core.domain.util.Result

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}