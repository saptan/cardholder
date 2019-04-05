package com.example.homework_1

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
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

        setResult(Activity.RESULT_OK, intent2)
        finish()

    }

    fun saveClick(view: View)
    {

        var card1 = Card(NameIT.text.toString(), CategoryIT.text.toString(), PercentIT.text.toString().toInt())
        var name = NameIT.text.toString()
        var category = CategoryIT.text.toString()
        var percent = PercentIT.text.toString().toInt()
        if (percent>100)
        {
          Toast.makeText(this,"Скидка не может быть больше 100%!", LENGTH_SHORT ).show()
            return
        }
        val intent3 = Intent(this, CardListActivity::class.java)
        intent3.putExtra(Card::class.java.simpleName,card1)


        setResult(Activity.RESULT_OK, intent3)
        finish()
    }
}
