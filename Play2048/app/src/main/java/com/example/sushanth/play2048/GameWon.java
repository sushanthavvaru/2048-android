package com.example.sushanth.play2048;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameWon extends Activity {
    Button playagain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_won);
        int score = getIntent().getIntExtra("clickeduser",0);
        TextView disp= (TextView) findViewById(R.id.gamewon_displayscore);
        disp.setText("You Scored "+score+" points");
        playagain = (Button) findViewById(R.id.playagain);
        playagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newgame = new Intent(getBaseContext(),MainActivity.class);
                startActivity(newgame);
                finish();

            }
        });
    }
}
