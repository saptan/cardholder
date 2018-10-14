package com.example.ilina_ka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CardListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list2);

        final TextView tvTitle = findViewById(R.id.textView5);
        final TextView tvId = findViewById(R.id.textView3);
        final TextView tvPhoto = findViewById(R.id.textView4);

        Bundle argument = getIntent().getExtras();
        if (argument == null){
           return;
        }

        Card card = (Card) argument.getSerializable(Card.class.getSimpleName());
        if (card == null){
           return;
        }

        tvTitle.setText(card.getTitle());
        tvId.setText(card.getId());
        tvPhoto.setText(card.getPhoto());
    }
}
