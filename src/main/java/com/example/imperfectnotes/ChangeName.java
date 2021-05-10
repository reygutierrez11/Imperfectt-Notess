package com.example.imperfectnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class ChangeName extends AppCompatActivity {

    int nameID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_name);

        EditText editText = (EditText)findViewById(R.id.edit_user_name);
        Intent intent = getIntent();
        nameID = intent.getIntExtra("nameID", -1);



    }
}