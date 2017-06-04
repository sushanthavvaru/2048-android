package com.example.sushanth.play2048;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView score, bestscore ;
    String prefName = "MyPref";
    SharedPreferences sharedPreferences;
    int bestscoreCalculated;
    MediaPlayer music;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button newgmae = (Button) findViewById(R.id.newgame);
        newgmae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });


        Button instructions=(Button) findViewById(R.id.instructions);
        instructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent instruc = new Intent(getBaseContext(), Instructions.class);
                startActivity(instruc);
            }
        });
        score = (TextView) findViewById(R.id.score);
        score.setText("SCORE\n"+0);
        bestscore = (TextView) findViewById(R.id.best);
        sharedPreferences = getSharedPreferences(prefName, MODE_PRIVATE);
        bestscoreCalculated = sharedPreferences.getInt("bestscore" ,0);
        bestscore.setText("BEST\n"+bestscoreCalculated);


    }

    protected void onResume(){
        super.onResume();
        music=MediaPlayer.create(this, R.raw.music);
        music.setLooping(true);
        music.setVolume(100,100);
        music.start();
    }
    protected void onPause(){
        super.onPause();
        music.stop();
        music.release();
    }

}
