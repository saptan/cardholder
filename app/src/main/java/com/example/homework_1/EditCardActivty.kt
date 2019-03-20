package com.example.homework_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_card_list.*


class EditCardActivty : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_card_activty)
        setTitle("Card Holder")
        val info = intent.getStringExtra(cardinfo)
        textView.text = info
    }

    companion object {

        const val cardinfo = "card_info"
    }
}
