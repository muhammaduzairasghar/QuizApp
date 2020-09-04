package com.example.welcome.quizapp;

import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import static androidx.core.content.ContextCompat.startActivity;

public class MainActivity extends AppCompatActivity {
    Button answer1,answer2,answer3,answer4;
    TextView score,question;

    private Questions nQuestions = new Questions();

    private String nAnswer;
    private int nScore = 0;
    private int nQuestionsLength = nQuestions.nQuestions.length;
    Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);
        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        updateQuestion(r.nextInt(nQuestionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText() == nAnswer) {
                    nScore++;
                    score.setText("score:" + nScore);
                    updateQuestion(r.nextInt(nQuestionsLength));
                } else {
                    gameOver();
                }
            }});

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText() == nAnswer){
                    nScore++;
                    score.setText("score:"+ nScore);
                    updateQuestion(r.nextInt(nQuestionsLength));
                }else
                {
                    gameOver();
                }
                }

            }
        );
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(answer3.getText() == nAnswer){
                nScore++;
                score.setText("score:"+ nScore);
                updateQuestion(r.nextInt(nQuestionsLength));
            }else
            {
                gameOver();
            }

            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(answer4.getText() == nAnswer){
                nScore++;
                score.setText("score:"+ nScore);
                updateQuestion(r.nextInt(nQuestionsLength));
            }else
            {
                gameOver();
            }

            }
        });
    }
    private void updateQuestion(int num){
        question.setText(nQuestions.getquestion(num));
        answer1.setText(nQuestions.getChoice1(num));
        answer2.setText(nQuestions.getChoice2(num));
        answer3.setText(nQuestions.getChoice3(num));
        answer4.setText(nQuestions.getChoice4(num));

        nAnswer = nQuestions.getCorrectAnswers(num);
    }

    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                 .setMessage("Game Over! Your Score is " + nScore + "points.")
                 .setCancelable(false)
                 .setPositiveButton("NEW GAME",
                         new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                            startActivity(new Intent(getApplicationContext(),MainActivity.class));
                             finish();}
                         })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            finish();}
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }}

