package com.deekay02.cryptotracker.crypto.data.mappers

import com.deekay02.cryptotracker.crypto.data.networking.dto.CoinDto
import com.deekay02.cryptotracker.crypto.domain.Coin

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        symbol = symbol,
        name = name,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}