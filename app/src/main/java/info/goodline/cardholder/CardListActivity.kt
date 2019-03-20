package com.example.cardholderlocal

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CardListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_list)

    }

    val card1 = Card("Лента", 1, "https://goo.gl/eQRqVq")
    val card2 = Card("Доминго", 2, "https://goo.gl/65NeMq")

    fun onClick(view: View) {
        val card = card1

        val intent = Intent(this, EditCardActivity::class.java)
        intent.putExtra(Card::class.java.simpleName, card)
        startActivity(intent)
    }

    fun onClick2(view: View){
        val card = card2

        val intent = Intent(this, EditCardActivity::class.java)
        intent.putExtra(Card::class.java.simpleName, card)
        startActivity(intent)
    }


}
