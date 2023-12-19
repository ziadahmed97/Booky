package com.example.booky.data

import android.health.connect.datatypes.units.Percentage

data class product(
    val id:String,
    val name:String,
    val price:Float,
    val description:String?=null,
    val images:List<String>,


) {
}