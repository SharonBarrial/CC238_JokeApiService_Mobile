package com.example.networking

import com.google.gson.annotations.SerializedName

//esta clase es un modelo de datos que representa una broma
class Joke (
    //Serializamos el campo "joke" para que Gson pueda convertirlo a JSON
    @SerializedName("joke")
    var joke: String
)