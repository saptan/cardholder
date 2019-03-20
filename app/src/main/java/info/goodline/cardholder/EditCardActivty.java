
package info.goodline.cardholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditCardActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_card_activty);

        final TextView nTitle = findViewById(R.id.nTitle);
        final TextView nID = findViewById(R.id.nID);
        final TextView nPhoto = findViewById(R.id.nPhoto);

        Bundle arguments = getIntent().getExtras();
        if (arguments == null) {
            return;
        }
        Card card=arguments.getParcelable(Card.class.getSimpleName());
        if(card==null){
            return;
        }
        String title=card.getTitle();
        String id = "" + card.getId();
        String photo = card.getPhoto();

        nTitle.setText(title);
        nID.setText(id);
        nPhoto.setText(photo);
    }
}