package info.goodline.cardholder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CardListActivty extends AppCompatActivity {

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list_activty);
    }

    public void onClick(View view) {
            Card card = new Card();
            card.setId(1);
            card.setTitle("Лента");
            card.setPhoto("https://goo.gl/eQRqVq");
        Intent intent = new Intent(this, EditCardActivty.class);
        intent.putExtra(Card.class.getSimpleName(), card);
        startActivity(intent);
    }

    public void onClick1(View view) {
        Card card = new Card();
        card.setId(2);
        card.setTitle("Доминго");
        card.setPhoto("https://goo.gl/65NeMq");
        Intent intent = new Intent(this, EditCardActivty.class);
        intent.putExtra(Card.class.getSimpleName(), card);
        startActivity(intent);
    }
}
