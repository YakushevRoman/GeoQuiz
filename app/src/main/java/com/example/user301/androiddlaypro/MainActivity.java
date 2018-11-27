package com.example.user301.androiddlaypro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mGeoQuizButton;
    Intent mIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGeoQuizButton = findViewById(R.id.ButtonGeoQuiz);
        mGeoQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIntent = new Intent(MainActivity.this, GeoQuiz.class);
                startActivity(mIntent);
            }
        });
    }
}
