package com.example.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import com.example.homework1.card;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titletext1 = findViewById(R.id.textView);
        TextView titletext2 = findViewById(R.id.textView2);


        titletext1.setText("Карта: Лента");
        titletext2.setText("Карта: Доминго");
    }


    public void onClick(View view) {
        card card1 = new card();
        card1.setID(1);
        card1.setTitle("Лента");
        card1.setPhoto("https://goo.gl/eQRqVq");

        Intent intent = new Intent(this, EditCardActivity.class);
        intent.putExtra(card.class.getSimpleName(), card1);
        startActivity(intent);
    }


    public void onClick1(View view) {
        card card2 = new card();
        card2.setID(2);
        card2.setTitle("Доминго");
        card2.setPhoto("https://goo.gl/65NeMq");

        Intent intent = new Intent(this, EditCardActivity.class);
        intent.putExtra(card.class.getSimpleName(), card2);
        startActivity(intent);
    }
}
