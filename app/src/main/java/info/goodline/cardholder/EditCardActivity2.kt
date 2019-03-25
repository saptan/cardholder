package info.goodline.cardholder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_card2.*

class EditCardActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_card2)

 //       vall nTitle = findViewById(R.id.nTitle)
        //val nID = findViewById(R.id.nID)
        //val nPhoto = findViewById(R.id.nPhoto)

        val arguments = intent.extras ?: return

        val card = arguments.getParcelable<Card2>(Card2::class.java.simpleName) ?: return

        //val title = card.title

        //val photo = card.photo

        val idStr: String = card.id.toString()

        textView13.text = card.title
        textView14.text = idStr
        textView15.text = card.photo



    }
}