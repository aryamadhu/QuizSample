package com.example.aryam.quizsample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.aryam.quizsample.model.Question;
import com.example.aryam.quizsample.utils.Utils;

import java.util.ArrayList;

import Controller.Data;


/**
 * Created by arya.m on 10/4/2016.
 */
public class SummaryActivity  extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        findViewById(R.id.button_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                showQuestionsScreen();
            }
        });
             getQuestionsFromDataBase();
    }

    private void getQuestionsFromDataBase() {


    }

    private void showQuestionsScreen() {
        Intent i = new Intent(SummaryActivity.this, QuestionActivity.class);
        i.putExtra("selected_subject", getIntent().getStringExtra("selected_subject"))
                .putExtra("selected_topic", getIntent().getStringExtra("selected_topic"));
        startActivity(i);
    }

    private void fillData(ArrayList<Question> questions) {
        ((TextView)findViewById(R.id.subject)).setText("Subject : " + getIntent().getStringExtra("selected_subject"));
        ((TextView)findViewById(R.id.topic)).setText("Topic : " + getIntent().getStringExtra("selected_topic"));
        int noOfQuestions = questions != null ? questions.size() : 0;
        ((TextView)findViewById(R.id.questions)).setText("Total Questions : " + noOfQuestions);
        ((TextView)findViewById(R.id.time)).setText("Time Left : " + Utils.getTotalTime(questions.size()));
    }



}
