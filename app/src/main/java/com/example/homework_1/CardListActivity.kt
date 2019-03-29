package com.example.homework_1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class CardListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_list)

    }

    companion object {

          var card: Card = Card("","",1)
    }

    fun AddNewCard_Click(view: View)
    {
        //val info = card1.cardInfo
        val intent1 = Intent(this, EditCardActivty::class.java)

        //intent1.putExtra(EditCardActivty.cardinfo)
        startActivity(intent1)
    }



}
