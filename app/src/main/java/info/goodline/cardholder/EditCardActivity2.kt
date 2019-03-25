package info.goodline.cardholder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class EditCardActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_card2)

        //val nTitle = findViewById(R.id.nTitle)
        //val nID = findViewById(R.id.nID)
        //val nPhoto = findViewById(R.id.nPhoto)

        val arguments = intent.extras ?: return

        val card = arguments.getParcelable<Card2>(Card2::class.java.simpleName) ?: return

        val title = card.title
        val id = "" + card.id
        val photo = card.photo

        //nTitle.setText(title)
        //nID.setText(id)
        //nPhoto.setText(photo)
    }
}