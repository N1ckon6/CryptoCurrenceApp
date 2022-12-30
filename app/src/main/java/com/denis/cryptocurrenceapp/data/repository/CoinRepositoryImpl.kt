package com.plcoding.cryptocurrencyapp.data.repository

import com.denis.cryptocurrenceapp.data.remote.CoinPaprikaApi
import com.denis.cryptocurrenceapp.data.remote.dto.CoinDetailDto
import com.denis.cryptocurrenceapp.data.remote.dto.CoinDto
import com.denis.cryptocurrenceapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}