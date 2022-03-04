package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declaring the variables
    TextView teamRedScore;
    RadioGroup scoresGroup;
    RadioButton scores;
    Button scoreRedPlus;

    TextView teamBlueScore;
    Button scoreBluePlus;

    int redTotal = 0;
    int redScoreChange = 0;

    int blueTotal = 0;
    int blueScoreChange = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //storing the elements in their specific variables
        teamRedScore = findViewById(R.id.teamRedScore);
        scoresGroup = findViewById(R.id.scoresGroup);
        scoreRedPlus = findViewById(R.id.redPlusButton);

        //function to increase red team's score
        scoreRedPlus.setOnClickListener(new android.view.View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int radioID = scoresGroup.getCheckedRadioButtonId();
                scores = findViewById(radioID);

                redScoreChange = Integer.parseInt(scores.getText().toString());

                //Calculating the score
                redTotal = redTotal + redScoreChange;
                teamRedScore.setText(String.valueOf(redTotal));
            }
        });

        //storing the elements in their specific variables
        teamBlueScore = findViewById(R.id.teamBlueScore);
        scoresGroup = findViewById(R.id.scoresGroup);
        scoreBluePlus = findViewById(R.id.bluePlusButton);

        //function to increase blue team's score
        scoreBluePlus.setOnClickListener(new android.view.View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int radioID = scoresGroup.getCheckedRadioButtonId();
                scores = findViewById(radioID);

                blueScoreChange = Integer.parseInt(scores.getText().toString());

                //Calculating the score
                blueTotal = blueTotal + blueScoreChange;
                teamBlueScore.setText(String.valueOf(blueTotal));
            }
        });



    }
}
