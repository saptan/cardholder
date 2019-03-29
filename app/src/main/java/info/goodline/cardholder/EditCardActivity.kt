package com.example.cardholderlocal

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_edit_card.*

class EditCardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_card)
        setSupportActionBar(toolbarEditActivity)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        toolbarEditActivity.title = "Добавить карту"


    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == android.R.id.home) finish()
        return super.onOptionsItemSelected(item)
    }

    fun onSaveClick (view: View) {
        val cardName = etCardName.text.toString()
        val cardCategory = etCardCategory.text.toString()
        val cardPercent = etCardPercent.text.toString()
        val card = Card(cardName, cardCategory, cardPercent.toInt())

        val intent = Intent(this, CardListActivity::class.java)
        intent.putExtra(Card::class.java.simpleName, card)
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}
