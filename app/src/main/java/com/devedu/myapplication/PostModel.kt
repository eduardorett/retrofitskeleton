package com.devedu.myapplication

import com.google.gson.annotations.SerializedName

class PostModel {

    // aqui recebemos os valores para saber oque usar do http

    // isso pode ser uma lista no call do service

    @SerializedName("id")
    var id:Int = 0
    @SerializedName("userId")
    var userId:Int = 0
    @SerializedName("title")
    var title:String = ""
    @SerializedName("body")
    var body:String = ""

}