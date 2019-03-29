package com.example.homework_1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_card_list.*
import kotlinx.android.synthetic.main.activity_edit_card_activty.*


class EditCardActivty : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_card_activty)

       // val info = intent.getStringExtra(cardinfo)

    }



    fun backClick(view: View)
    {
        val intent2 = Intent(this, CardListActivity::class.java)

        startActivity(intent2)
    }

    fun saveClick(view: View)
    {

        var card1 = Card(InputText1.text.toString(), InputText2.text.toString(), InputText3.text.toString().toInt())
        val intent3 = Intent(this, CardListActivity::class.java)
        intent3.putExtra(Card::class.java.simpleName,card1)


        startActivity(intent3)
    }
}
