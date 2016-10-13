package com.example.aryam.quizsample.model;

/**
 * Created by arya.m on 10/13/2016.
 */
public class Question {

    public int qid;
    public String question;
    public String ch1;
    public String ch2;
    public String ch3;
    public String ch4;
    public int correctch;

    public char types;

    // LOCAL
    private int mSelectedChoice;

    public void setSelectedChoice(int selectedChoice) {
        mSelectedChoice = selectedChoice;
    }

    public boolean isAnswered() {
        return mSelectedChoice != 0;
    }

    public boolean isAnswerCorrect() {
        return mSelectedChoice == correctch;
    }

}
