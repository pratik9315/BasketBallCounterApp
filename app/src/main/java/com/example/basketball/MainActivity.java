package com.example.basketball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Threepoints(View view){
        firstBtn(scoreTeamA);
    }
    public void TwoPoints(View view){
        SectBtn(scoreTeamA);
    }
    public void OnePoint(View view){
        ThrBtn(scoreTeamA);
    }

    public void firstBtn(int number){
        scoreTeamA=scoreTeamA+3;
        display(scoreTeamA);
    }

    public void SectBtn(int number){
        scoreTeamA=scoreTeamA+2;
        display(scoreTeamA);
    }

    public void ThrBtn(int number){
        scoreTeamA=scoreTeamA+1;
        display(scoreTeamA);
    }
    public void display(int number){
        TextView threebtn= (TextView)findViewById(R.id.tv1);
        threebtn.setText("" + number);
    }



    public void Threepoints1(View view){
        firstBtn1(scoreTeamB);
    }
    public void TwoPoints2(View view){
        SectBtn2(scoreTeamB);
    }
    public void OnePoint3(View view){
        ThrBtn3(scoreTeamB);
    }
    public void firstBtn1(int number){
        scoreTeamB=scoreTeamB+3;
        display1(scoreTeamB);
    }

    public void SectBtn2(int number){
        scoreTeamB=scoreTeamB+2;
        display1(scoreTeamB);
    }

    public void ThrBtn3(int number) {
        scoreTeamB = scoreTeamB + 1;
        display1(scoreTeamB);
    }

    public void display1(int number){
        TextView threebtn1= (TextView)findViewById(R.id.tv2);
        threebtn1.setText("" + number);
    }

    public void Reset(View view){
        addReset();
    }
    public void addReset(){
        scoreTeamA= 0;
        scoreTeamB= 0;
        display(scoreTeamA);
        display1(scoreTeamB);
    }

}