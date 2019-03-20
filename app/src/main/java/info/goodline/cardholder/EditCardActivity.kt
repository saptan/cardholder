package com.example.cardholderlocal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_card.*

class EditCardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_card)

        val arguments: Bundle = intent.extras ?: return
        val card = arguments.getParcelable<Card>(Card::class.java.simpleName) ?: return

        textViewTitle.text = "карта \"${card.title}\""
        textViewId.text = "id: " + Integer.toString(card.id)
        textViewPhoto.text = "фото: " + card.photo
    }
}
