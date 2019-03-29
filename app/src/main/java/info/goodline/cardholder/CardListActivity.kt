package com.example.cardholderlocal

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import kotlinx.android.synthetic.main.activity_card_list.*

class CardListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_list)
        setSupportActionBar(toolbarMainActivity)
        tvCardName.visibility = View.INVISIBLE
        tvCardCategory.visibility = View.INVISIBLE
        tvCardPercent.visibility = View.INVISIBLE
        cardView.visibility = View.INVISIBLE

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.card_list_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


    fun onClick(view: View) {


        val intent = Intent(this, EditCardActivity::class.java)

        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        tvNoCard.visibility = View.INVISIBLE
        tvPressPlus.visibility = View.INVISIBLE
        //val arguments = intent.extras ?: return
        val card: Card = data?.getParcelableExtra(Card::class.java.simpleName) ?: return

        tvCardName.text = card.cardName
        tvCardCategory.text = card.cardCategory
        tvCardPercent.text = card.cardPercent.toString()

        tvCardName.visibility = View.VISIBLE
        tvCardCategory.visibility = View.VISIBLE
        tvCardPercent.visibility = View.VISIBLE
        cardView.visibility = View.VISIBLE

    }




}
