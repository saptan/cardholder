package com.example.ilina_ka;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private  Card cardL;
    private  Card cardD;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardL = new Card();
        cardD = new Card();
        cardL.setTitle("Лента");
        cardL.setId("id=1");
        cardL.setPhoto("https://goo.gl/eQRqVq");
        cardD.setTitle("DOMINGO");
        cardD.setId("id=2");
        cardD.setPhoto("https://goo.gl/65NeMq");



    }

    public void onCLick(View view) {
        Intent instant= new Intent(this, CardListActivity.class);
        instant.putExtra(Card.class.getSimpleName(),cardL);
        startActivity(instant);
    }

    public void onClick(View view) {



        Intent instant = new Intent(this, CardListActivity.class);
        instant.putExtra(Card.class.getSimpleName(),cardD);
        startActivity(instant);
    }

}