package com.example.swalismarket.models

import com.google.gson.annotations.SerializedName
import java.util.*

data class Client(
    @SerializedName("idClient") var idClient:Long?=null,
    @SerializedName("nomClient") var nomClient :String? = null,
    @SerializedName("prenomClient") var prenomClient :String? = null,
    @SerializedName("mailClient")  var mailClient :String? = null,
    @SerializedName("numClient")  var numClient :String? = null,
    @SerializedName("adresseClient") var adresseClient : String? = null,
    @SerializedName("photoClient")  var photoClient : String? = null,
    @SerializedName("dateNaissanceClient") var dateNaissanceClient :Date? = null
)
