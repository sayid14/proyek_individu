package com.example.kost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KostigaserangkaiActivity extends AppCompatActivity {

    Button pindah;
    Button pindah1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kostigaserangkai);

        pindah = findViewById(R.id.btn5);
        pindah1 = findViewById(R.id.btn9);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(KostigaserangkaiActivity.this,MapdarulajumiActivity.class);
                startActivity(i);
            }
        });
        pindah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(KostigaserangkaiActivity.this,AjukansewaActivity.class);
                startActivity(i);
            }
        });
    }
}