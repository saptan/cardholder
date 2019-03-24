package info.goodline.cardholder

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_edit_card.*

class EditCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_card)

        var arguments : Bundle  = getIntent().getExtras()
        if (arguments == null) {
            return;
        }

        var c = arguments.getParcelable<Card>(Card::class.java.simpleName)

        if (c == null)
        {
            return;
        }

        tvID.setText(""+c.id)
        tvTitle.setText(""+c.title)
        tvPhoto.setText(""+c.photo)

    }
}