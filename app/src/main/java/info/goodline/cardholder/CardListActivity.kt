package info.goodline.cardholder

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_card_list_activty.*

class CardListActivity : AppCompatActivity() {

    lateinit var card1 : Card
    lateinit var card2 : Card

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_list_activty)

        ////
        card1 = Card(1, "Карта \"Лента\"", "https://goo.gl/eQRqVq")
        card2 = Card(2, "Карта \"Доминго\"", "https://goo.gl/65NeMq")

        title1.setText(card1.title)
        title2.setText(card2.title)
    }

    fun onClick1 (view : View){
        val intent = Intent(this, EditCardActivity::class.java)
        intent.putExtra(Card::class.java.simpleName, card1)
        startActivity(intent)
    }

    fun onClick2 (view : View){
        val intent = Intent(this, EditCardActivity::class.java)
        intent.putExtra(Card::class.java.simpleName, card2)
        startActivity(intent)
    }

}