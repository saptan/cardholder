package info.goodline.cardholder

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class CardListActivity2 : AppCompatActivity() {

    val lenta = Card2("Лента", 1, "https://goo.gl/eQRqVq")
    val domingo = Card2("Доминго", 2, "https://goo.gl/65NeMq")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_list2)

    }

    fun btnLenta(view: View) {
        val intent = Intent(this, EditCardActivity2::class.java)
        intent.putExtra(Card2::class.java.simpleName, lenta)
        startActivity(intent)
    }

    fun btnDomingo(view: View) {
        val intent = Intent(this, EditCardActivity2::class.java)
        intent.putExtra(Card2::class.java.simpleName, domingo)
        startActivity(intent)
    }

}