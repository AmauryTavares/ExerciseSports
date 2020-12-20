package com.example.exercisesports;

import android.graphics.drawable.Drawable;

public class ResultGame {

    private Time time1;
    private Time time2;
    private Drawable time1_image;
    private Drawable time2_image;
    private int goalsTime1;
    private int getGoalsTime2;

    public ResultGame(Time time1, Time time2, Drawable time1_image, Drawable time2_image, int goalsTime1, int getGoalsTime2) {
        this.time1 = time1;
        this.time2 = time2;
        this.time1_image = time1_image;
        this.time2_image = time2_image;
        this.goalsTime1 = goalsTime1;
        this.getGoalsTime2 = getGoalsTime2;
    }

    public Time getTime1() {
        return time1;
    }

    public void setTime1(Time time1) {
        this.time1 = time1;
    }

    public Time getTime2() {
        return time2;
    }

    public void setTime2(Time time2) {
        this.time2 = time2;
    }

    public Drawable getTime1_image() {
        return time1_image;
    }

    public void setTime1_image(Drawable time1_image) {
        this.time1_image = time1_image;
    }

    public Drawable getTime2_image() {
        return time2_image;
    }

    public void setTime2_image(Drawable time2_image) {
        this.time2_image = time2_image;
    }

    public int getGoalsTime1() {
        return goalsTime1;
    }

    public void setGoalsTime1(int goalsTime1) {
        this.goalsTime1 = goalsTime1;
    }

    public int getGetGoalsTime2() {
        return getGoalsTime2;
    }

    public void setGetGoalsTime2(int getGoalsTime2) {
        this.getGoalsTime2 = getGoalsTime2;
    }
}
