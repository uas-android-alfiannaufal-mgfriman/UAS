package com.example.loginsqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import jdulal.com.np.androiduploadretrieveimagesusingfirebasestorage.UploadActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Bundle bundle = getIntent().getExtras();
        TextView tvData2 = (TextView) findViewById(R.id.textView2);
        bundle.putString("data1", (bundle.getString("data1")));

        tvData2.setText(bundle.getString("data1"));

        ImageButton glr = (ImageButton) findViewById(R.id.tekangaleri);
        glr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1 = new Intent(getApplicationContext(),Galeri.class);
                startActivity(i1);
            }
        });

        ImageButton upload = (ImageButton) findViewById(R.id.upload);
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i13 = new Intent(getApplicationContext(), UploadActivity.class);
                startActivity(i13);
            }
        });

        ImageButton pf = (ImageButton) findViewById(R.id.tekanuser);
        pf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(getApplicationContext(),Profil_Activity.class);

                i12.putExtra("name", bundle.getString("data1"));
                startActivity(i12);
            }
        });
    }
}
