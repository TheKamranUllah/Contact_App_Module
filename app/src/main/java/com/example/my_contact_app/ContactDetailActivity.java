package com.example.my_contact_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ContactDetailActivity extends AppCompatActivity {


    private TextView idTvName, idTvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_detail);

        String name = getIntent().getStringExtra("name");
        String contact = getIntent().getStringExtra("contact");


        idTvName = findViewById(R.id.idTVName);
        idTvPhone = findViewById(R.id.idTVPhone);

        idTvName.setText(name);
        idTvPhone.setText(contact);
    }
}