package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView eightBall = findViewById(R.id.eightBall);

        Button button = findViewById(R.id.askButton);
        button.setOnClickListener(new View.OnClickListener() {

            final Integer[] eightBallArray = new Integer[] {
                    R.drawable.ball1,
                    R.drawable.ball2,
                    R.drawable.ball3,
                    R.drawable.ball4,
                    R.drawable.ball5};
            Random random = new Random();

            @Override
            public void onClick(View view) {

                eightBall.setImageResource(eightBallArray[random.nextInt(5)]);

            }
        });
    }
}
