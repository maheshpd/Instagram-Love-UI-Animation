package com.createsapp.instagramloveuianimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView lovefilled,lovecounts;
    TextView lovenums;
    View pic1;

    GestureDetector gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lovefilled = findViewById(R.id.lovesfilled);
        lovecounts = findViewById(R.id.lovecounts);
        lovenums = findViewById(R.id.lovenum);


        pic1 = findViewById(R.id.pic1);

        lovefilled.setScaleY(0);
        lovefilled.setScaleY(0);


        pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lovefilled.animate().scaleY(1).scaleX(1).start();
                lovenums.setText("12,281");
                lovecounts.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.iclovefilled));
            }
        });


    }
}
