package com.example.aryam.quizsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_login).setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_login:
                login();
                break;
        }
    }
    private void login(){
        showSummaryScreen();

    }

    private void showSummaryScreen() {
        startActivity(new Intent(this, SummaryActivity.class));
    }



}