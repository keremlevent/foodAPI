package com.example.besinprojesi.service

import com.example.besinprojesi.model.Besin
import retrofit2.http.GET

interface BesinAPI {
    //https://raw.githubusercontent.com/atilsamancioglu/BTK20-JSONVeriSeti/master/besinler.json

    @GET("atilsamancioglu/BTK20-JSONVeriSeti/master/besinler.json")
    suspend fun getBesin() : List<Besin>
}