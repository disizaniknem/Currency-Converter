package com.disizaniknem.currencyconverter.main

import com.disizaniknem.currencyconverter.data.models.CurrencyResponse
import com.disizaniknem.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}