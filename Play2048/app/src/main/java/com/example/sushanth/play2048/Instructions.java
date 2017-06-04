package com.example.sushanth.play2048;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Instructions extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        Button information = (Button) findViewById(R.id.information);
        information.setText("\nWelcome to 2048!!\nConfused How to play?\n\n*Swipe Up, Down, Left and Right to add the numbers.\n" +
                "*Same numbers are added\nKeep going till you make a 2048 tile.\n *If there is no more space then the game is over\n\n" +
                "Have Fun!!");

        Button backbutton = (Button) findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
