package com.deekay02.cryptotracker.core.data.networking

import com.deekay02.cryptotracker.BuildConfig

fun constructUrl(url: String): String {
    return when {
        url.contains(BuildConfig.BASE_URL) -> url + "?apiKey=${BuildConfig.API_KEY}"
        url.startsWith("/") -> BuildConfig.BASE_URL + url.drop(1) + "?apiKey=${BuildConfig.API_KEY}"
        else -> "${BuildConfig.BASE_URL}$url?apiKey=${BuildConfig.API_KEY}"
    }
}