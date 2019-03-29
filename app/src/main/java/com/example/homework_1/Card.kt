package com.example.homework_1

class Card(_name: String, _category: String, _percent: Int)
{
    var name: String = "Карта"
    var category: String = "Супермаркеты"
    var percent: Int = 10
    val cardInfo: String
    get() {return " Карта \"$name\"  \n\n id:  $category  \n\n Фото: $percent"}

    init
    {
        this.name = _name
        this.category = _category
        this.percent = _percent
    }



}