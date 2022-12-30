package com.denis.cryptocurrenceapp.presentation.coin_detail

import com.denis.cryptocurrenceapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
