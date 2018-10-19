package info.goodline.cardholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_card);

        final TextView tvID = findViewById(R.id.tvID);
        final TextView tvTitle = findViewById(R.id.tvTitle);
        final TextView tvPhoto = findViewById(R.id.tvPhoto);

        Bundle arguments = getIntent().getExtras();
        if (arguments == null) {
            return;
        }

        Card c = (Card)arguments.getSerializable(Card.class.getSimpleName());
        if (c == null)
        {
            return;
        }

        String id = c.getID();
        String title = c.getTitle();
        String photo = c.getPhoto();
        tvID.setText(id);
        tvTitle.setText(title);
        tvPhoto.setText(photo);

    }
}
