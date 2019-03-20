package com.example.homework_1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class CardListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_list)
        setTitle("Card Holder")
    }

    val card1 : Card = Card("Лента", 1, "https://goo.gl/eQRqVq")
    val card2 : Card = Card("Доминго", 2, "https://goo.gl/65NeMq")

    fun btn1Click(view: View)
    {
        val info = card1.cardInfo
        val intent1 = Intent(this, EditCardActivty::class.java)

        intent1.putExtra(EditCardActivty.cardinfo, info)
        startActivity(intent1)
    }

    fun btn2Click(view: View)
    {
        val info = card2.cardInfo
        val intent2 = Intent(this, EditCardActivty::class.java)

        intent2.putExtra(EditCardActivty.cardinfo, info)
        startActivity(intent2)
    }

}
