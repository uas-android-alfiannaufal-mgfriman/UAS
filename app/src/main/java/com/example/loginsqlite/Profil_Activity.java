package com.example.loginsqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Profil_Activity extends AppCompatActivity {
    private String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_);
        Intent i = getIntent();
        name = ((Intent) i).getStringExtra("name");
        TextView tv = findViewById(R.id.textView);
        tv.setText(name);
    }
}
