package info.goodline.cardholder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CardListActivty extends AppCompatActivity {

    Card lenta = new Card();
    Card domingo = new Card();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list_activty);

        lenta.setId(1);
        lenta.setTitle("Лента");
        lenta.setPhoto("https://goo.gl/eQRqVq");

        domingo.setId(2);
        domingo.setTitle("Доминго");
        domingo.setPhoto("https://goo.gl/65NeMq");
    }

    public void btnLentaClick(View view) {
        Intent intent = new Intent(this, EditCardActivty.class);
        intent.putExtra(Card.class.getSimpleName(), lenta);
        startActivity(intent);
    }

    public void btnDomingoClick(View view) {
        Intent intent = new Intent(this, EditCardActivty.class);
        intent.putExtra(Card.class.getSimpleName(), domingo);
        startActivity(intent);
    }
}
