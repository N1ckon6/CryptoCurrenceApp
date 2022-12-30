package com.denis.cryptocurrenceapp.presentation.coin_list

import com.denis.cryptocurrenceapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
