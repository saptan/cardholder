package com.example.homework_1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

class Card(var _name: String, var  _category:String, var _percent:Int)
    : Parcelable {
    var name: String = "Карта"
    var category: String = "Супермаркеты"
    var percent: Int = 10

    init
    {
        this.name = _name
        this.category = _category
        this.percent = _percent
    }



}