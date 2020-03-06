package com.example.controleurportique;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainPanel extends AppCompatActivity {
Chronometer chrono;
Button btnstart;
Button btnstop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_panel);
        chrono = (Chronometer) findViewById(R.id.chrono);
        chrono.setFormat("Time (%s)");
        btnstart=(Button) findViewById(R.id.btnstart);
        btnstop=(Button) findViewById(R.id.btnstop);

    }



    void startScan(){

        chrono.setVisibility(View.VISIBLE);
        chrono.start();
    }

    void stopScan(View v){
        chrono.setVisibility(View.GONE);
        chrono.stop();
    }





}
