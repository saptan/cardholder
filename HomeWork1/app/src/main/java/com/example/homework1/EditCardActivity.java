package com.example.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_card);

        TextView titletext3 = findViewById(R.id.textView3);

        TextView titletext4 = findViewById(R.id.textView4);

        TextView titletext5 = findViewById(R.id.textView5);

        Bundle arguments = getIntent().getExtras();
        if(arguments == null)
        {
            return;
        }

        card car1 = (card)arguments.getSerializable(card.class.getSimpleName());
        if(car1 == null)
        {
            return;
        }

        Integer id = car1.getID();
        String title1 = car1.getTitle();
        String photo = car1.getPhoto();
        titletext3.setText("ID: "+id);
        titletext4.setText("Название: "+title1);
        titletext5.setText("Ссылка на фото: "+photo);


    }
}
