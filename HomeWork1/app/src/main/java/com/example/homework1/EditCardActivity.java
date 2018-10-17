package com.example.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_card);

        TextView idCard = findViewById(R.id.idCard);

        TextView titleCard = findViewById(R.id.titleCard);

        TextView srcPhoto = findViewById(R.id.srcPhoto);

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

        int id = car1.getID();
        String title1 = car1.getTitle();
        String photo = car1.getPhoto();
        idCard.setText("ID: "+id);
        titleCard.setText("Название: "+title1);
        srcPhoto.setText("Ссылка на фото: "+photo);


    }
}
