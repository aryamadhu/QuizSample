package com.example.aryam.quizsample.utils;

/**
 * Created by arya.m on 10/13/2016.
 */
public class Utils {

    public static String getTotalTime(int no) {
        int minutes = no * 1;
        String mins = (minutes % 60) + " Minutes";
        if (minutes > 59)
            mins = String.format("%02d", (minutes / 60)) + " : " + (minutes % (60 * (minutes/60))) + " Minutes";
        return mins;
    }
}
