package com.example.gerganzhekov.moduleevaluationquiz;

/**
 * Created by Gergan Zhekov on 07/12/2017.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {


    TextView mScore, mFinalScore;
    Button mRestartButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results); //use results layout

        mScore = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRestartButton = (Button)findViewById(R.id.retry);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalGrade");

        mFinalScore.setText("Your score is: " + score + " out of " + QuizQuestions.questions.length);

        //if statements to determine the correct grade
        if (score > 8){
            mScore.setText("Good job! You are expected to earn first class in this module!");
        }else if (score == 7 || score == 8 ){
            mScore.setText("Good Work! You are expected to earn between 60%-70% in this module!");
        }else if (score == 6 || score == 5) {
            mScore.setText("You are expected to pass, but you better go over your notes");
        }else {
            mScore.setText("Ouch! You are expected to not pass this module. Study more!");
        }

        //restart functionality
        mRestartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsActivity.this, QuizActivity.class)); //go from results to quiz activity
                ResultsActivity.this.finish();
            }
        });

    }
}
