package com.denis.cryptocurrenceapp.domain.repository

import com.denis.cryptocurrenceapp.data.remote.dto.CoinDetailDto
import com.denis.cryptocurrenceapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}