package com.example.ilina_ka;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onCLick(View view) {
        Card card=new Card();
        card.setTitle("Лента");
        card.setId("id=1");
        card.setPhoto("https://goo.gl/eQRqVq");

        Intent instant= new Intent(this, CardListActivity.class);
        instant.putExtra(Card.class.getSimpleName(),card);
        startActivity(instant);
    }

    public void onClick(View view) {
        Card card = new Card();
        card.setTitle("DOMINGO");
        card.setId("id=2");
        card.setPhoto("https://goo.gl/65NeMq");

        Intent instant = new Intent(this, CardListActivity.class);
        instant.putExtra(Card.class.getSimpleName(),card);
        startActivity(instant);
    }

}