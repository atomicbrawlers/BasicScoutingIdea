package com.example.basicscoutingidea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;

import static android.R.attr.baseline;

public class Auto extends AppCompatActivity {

    public Switch baseLine;
    public CheckBox high, low, gear, balls;

    public boolean baseLineCrossed;
    public boolean autoScoredHigh;
    public boolean autoScoredLow;
    public boolean startedWithGear;
    public boolean startedWithBalls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);

        baseLine = (Switch) findViewById(R.id.base_line_crossed);
        high = (CheckBox) findViewById(R.id.scored_high);
        low = (CheckBox) findViewById(R.id.scored_low);
        gear = (CheckBox) findViewById(R.id.started_with_gear);
        balls = (CheckBox) findViewById(R.id.started_with_balls);

        baseLineCrossed = false;
        autoScoredHigh = false;
        autoScoredLow = false;
        startedWithGear = false;
        startedWithBalls = false;
    }

    public void readData(View view){
        if (baseLine.isChecked())
            baseLineCrossed = true;
        if (high.isChecked())
            autoScoredHigh = true;
        if (low.isChecked())
            autoScoredLow = true;
        if (gear.isChecked())
            startedWithGear = true;
        if (balls.isChecked())
            startedWithBalls = true;
    }

}
