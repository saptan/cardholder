package info.goodline.cardholder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CardListActivty extends AppCompatActivity {
 Card card1 = new Card();
 Card card2 = new Card();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list_activty);

        card1.setID("1");
        card1.setTitle("Карта 'Лента'");
        card1.setPhoto("https://goo.gl/eQRqVq");

        card2.setID("2");
        card2.setTitle("Карта 'Доминго'");
        card2.setPhoto("https://goo.gl/65NeMq");

        TextView titleCARD1 = findViewById(R.id.title1);
        TextView titleCARD2 = findViewById(R.id.title2);


        titleCARD1.setText("Лента");
        titleCARD2.setText("Доминго");


    }


    public void onClick1(View view) {
            Intent intent = new Intent(this, EditCardActivity.class);
            intent.putExtra(Card.class.getSimpleName(), card1);
            startActivity(intent);
    }

    public void onClick2(View view) {
        Intent intent = new Intent(this, EditCardActivity.class);
        intent.putExtra(Card.class.getSimpleName(), card2);
        startActivity(intent);
    }
}
