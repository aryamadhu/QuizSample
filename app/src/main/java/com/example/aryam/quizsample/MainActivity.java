package com.example.aryam.quizsample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import Controller.Data;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    QuestionListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_login).setOnClickListener(this);
        Data.getInstance().loadData(this);
        adapter = new QuestionListAdapter(this, Data.getInstance().getData());

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
        showSelectionScreen();

    }

    private void showSelectionScreen() {
        startActivity(new Intent(this, SelectionActivity.class));
    }



}
