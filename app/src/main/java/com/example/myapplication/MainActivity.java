package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        View imageView = findViewById(R.id.imageView);
        Button buttonKyKiske = findViewById(R.id.kyButton);
        Button buttonSolBadguy = findViewById(R.id.solButton);
        Button buttonJohnny = findViewById(R.id.johnnyButton);

        buttonKyKiske.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setBackgroundResource(R.drawable.ky_kiske);
            }
        });

        buttonSolBadguy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setBackgroundResource(R.drawable.sol_badguy);
            }
        });

        buttonJohnny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setBackgroundResource(R.drawable.johnny);
            }
        });
    }
}