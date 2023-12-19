package com.example.booky.data

data class User(
    val firstName:String,
    val secondName  :String,
    val email:String,
    val imagePath:String="",

){
    constructor():this("","","","")

}
