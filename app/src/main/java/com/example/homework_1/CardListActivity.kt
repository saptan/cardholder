package com.example.homework_1

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_card_list.*


class CardListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_list)
        textView3.visibility = View.INVISIBLE
        textView4.visibility = View.INVISIBLE
        textView5.visibility = View.INVISIBLE
        imageView.visibility = View.INVISIBLE





    }



    fun AddNewCard_Click(view: View) {

        val intent1 = Intent(this, EditCardActivty::class.java)
        startActivity(intent1)
    }




    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

       // if (resultCode == Activity.RESULT_OK) {
            var arguments = intent.extras
            var card: Card

                card = arguments.getParcelable(Card::class.java.simpleName) as Card

                textView3.text = card.name
                textView4.text = card.category
                textView5.text = "Скидка " + card.percent.toString() + "%"
                textView.visibility = View.INVISIBLE
                textView2.visibility = View.INVISIBLE
                textView3.visibility = View.VISIBLE
                textView4.visibility = View.VISIBLE
                textView5.visibility = View.VISIBLE
                imageView.visibility = View.VISIBLE

       // }


    }



}
