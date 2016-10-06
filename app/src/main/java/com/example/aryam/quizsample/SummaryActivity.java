package com.example.aryam.quizsample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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

    }

    private void showQuestionsScreen() {
        Intent intent = new Intent(SummaryActivity.this, QuestionActivity.class);

    }


}
