package com.example.homework_1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_card_list.*


class CardListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_list)
        tvCardName.visibility = View.INVISIBLE
        tvCategory.visibility = View.INVISIBLE
        tvPercent.visibility = View.INVISIBLE
        imageView.visibility = View.INVISIBLE

    }


    companion object {
        const val REQUEST_CODE = 1
    }


    fun AddNewCard_Click(view: View) {

        val intent1 = Intent(this, EditCardActivty::class.java)
        startActivityForResult(intent1, REQUEST_CODE)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK) {
            //var arguments = intent.extras
            var card = data?.getParcelableExtra(Card::class.java.simpleName) as Card

            tvCardName.text = card.name
            tvCategory.text = card.category
            tvPercent.text = "Скидка ${card.percent}%"
            tvNoCard.visibility = View.INVISIBLE
            tvStartInfo.visibility = View.INVISIBLE
            tvCardName.visibility = View.VISIBLE
            tvCategory.visibility = View.VISIBLE
            tvPercent.visibility = View.VISIBLE
            imageView.visibility = View.VISIBLE

        }


    }


}

