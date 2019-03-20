package com.example.homework_1

class Card(_name: String, _id: Int, _ref: String)
{
    var name: String = "Карта"
    var id: Int = 1
    var ref: String = "https://"
    val cardInfo: String
    get() {return " Карта \"$name\"  \n\n id:  $id  \n\n Фото: $ref"}

    init
    {
        this.name = _name
        this.id = _id
        this.ref = _ref
    }



}