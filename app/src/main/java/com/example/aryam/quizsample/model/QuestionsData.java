package com.example.aryam.quizsample.model;

import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arya.m on 10/7/2016.
 */
public class QuestionsData {

    private int qid;
    private String question;
    private String ch1, ch2, ch3, ch4, correctch;


    QuestionsData() {}

    public int getId() {
        return qid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCh1() {
        return ch1;
    }
    public String getCh2() {
        return ch2;
    }
    public String getCh3() {
        return ch3;
    }
    public String getCh4() {
        return ch4;
    }
    public String getCorrectch() {
        return correctch;
    }



    public static List<QuestionsData> parseTable(Cursor cr) {
        ArrayList<QuestionsData> questionsData = new ArrayList<>();
        if (cr != null && cr.moveToFirst()) {
            do {
                questionsData.add(parseRow(cr));
            } while (cr.moveToNext());
        }

        return questionsData;
    }

    private static QuestionsData parseRow(Cursor cr) {
        QuestionsData row = new QuestionsData();
        row.qid = cr.getInt(cr.getColumnIndex("qid"));
        row.question = cr.getString(cr.getColumnIndex("Question"));
        row.ch1 = cr.getString(cr.getColumnIndex("ch1"));
        row.ch2 = cr.getString(cr.getColumnIndex("ch2"));
        row.ch3 = cr.getString(cr.getColumnIndex("ch3"));
        row.ch4 = cr.getString(cr.getColumnIndex("ch4"));
        row.correctch = cr.getString(cr.getColumnIndex("correctch"));

        return  row;
    }

}
