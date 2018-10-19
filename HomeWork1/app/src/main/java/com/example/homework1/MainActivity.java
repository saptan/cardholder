package com.example.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import com.example.homework1.card;

public class MainActivity extends AppCompatActivity {


    private card cardLenta;
    private card cardDomingo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titleLenta = findViewById(R.id.tvLenta);
        TextView titleDomingo = findViewById(R.id.tvDomingo);


        titleLenta.setText("Карта: Лента");
        titleDomingo.setText("Карта: Доминго");

        cardLenta = new card();
        cardLenta.setID(1);
        cardLenta.setTitle("Лента");
        cardLenta.setPhoto("https://goo.gl/eQRqVq");

        cardDomingo = new card();
        cardDomingo.setID(2);
        cardDomingo.setTitle("Доминго");
        cardDomingo.setPhoto("https://goo.gl/65NeMq");
    }


    public void onClick(View view) {
        Intent intent = new Intent(this, EditCardActivity.class);
        intent.putExtra(card.class.getSimpleName(), cardLenta);
        startActivity(intent);
    }


    public void onClick1(View view) {
        Intent intent = new Intent(this, EditCardActivity.class);
        intent.putExtra(card.class.getSimpleName(), cardDomingo);
        startActivity(intent);
    }
}
