package com.example.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_card);

        TextView tvID = findViewById(R.id.idCard);

        TextView tvTitle = findViewById(R.id.titleCard);

        TextView tvPhoto = findViewById(R.id.srcPhoto);

        Bundle arguments = getIntent().getExtras();
        if(arguments == null)
        {
            return;
        }

        card card1 = (card)arguments.getSerializable(card.class.getSimpleName());
        if(card1 == null)
        {
            return;
        }

        int id = card1.getID();
        String title1 = card1.getTitle();
        String photo = card1.getPhoto();
        tvID.setText("ID: "+id);
        tvTitle.setText("Название: "+title1);
        tvPhoto.setText("Ссылка на фото: "+photo);


    }
}
