package info.goodline.cardholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditCardActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_card_activty);

        final TextView tvTitle = findViewById(R.id.tvTitle);
        final TextView tvID = findViewById(R.id.tvID);
        final TextView tvPhoto = findViewById(R.id.tvPhoto);

        Bundle arguments = getIntent().getExtras();
        if (arguments == null) {
            return;
        }
        Card card=(Card) arguments.getParcelable(Card.class.getSimpleName());
        if(card==null){
            return;
        }
        String title="Карта "+ card.getTitle();
        String id = "ID: "+card.getId();
        String photo = "Фото: "+(char) 34+ card.getPhoto()+(char) 34;

        tvTitle.setText(title);
        tvID.setText(id);
        tvPhoto.setText(photo);
    }
}
