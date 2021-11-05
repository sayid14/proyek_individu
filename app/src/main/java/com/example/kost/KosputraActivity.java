package com.example.kost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KosputraActivity extends AppCompatActivity {

    Button pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kosputra);

        pindah = findViewById(R.id.btn6);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(KosputraActivity.this,MapmujahidinActivity.class);
                startActivity(i);
            }
        });
    }
}