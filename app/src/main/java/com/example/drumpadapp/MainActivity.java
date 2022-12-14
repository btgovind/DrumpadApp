package com.example.drumpadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private SoundPool sp;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;
    private int sound9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        sound1 = sp.load(getApplicationContext(), R.raw.sound1, 1);
        sound2 = sp.load(getApplicationContext(), R.raw.sound2, 2);
        sound3 = sp.load(getApplicationContext(), R.raw.sound3, 3);
        sound4 = sp.load(getApplicationContext(), R.raw.sound4, 4);
        sound5 = sp.load(getApplicationContext(), R.raw.sound5, 5);
        sound6 = sp.load(getApplicationContext(), R.raw.sound6, 6);
        sound7 = sp.load(getApplicationContext(), R.raw.sound7, 7);
        sound8 = sp.load(getApplicationContext(), R.raw.sound8, 8);
        sound9 = sp.load(getApplicationContext(), R.raw.sound9, 9);
    }

    public void playsound1(View v) {
        sp.play(sound1, 1.0f, 1.0f, 0, 0, 10f);
    }

    public void playsound2(View v) {
        sp.play(sound3, 1.0f, 1.0f, 0, 0, 10f);
    }

    public void playsound3(View v) {
        sp.play(sound4, 1.0f, 1.0f, 0, 0, 10f);
    }

    public void playsound4(View v) {
        sp.play(sound5, 1.0f, 1.0f, 0, 0, 10f);
    }

    public void playsound5(View v) {
        sp.play(sound5, 1.0f, 1.0f, 0, 0, 10f);
    }

    public void playsound6(View v) {
        sp.play(sound6, 1.0f, 1.0f, 0, 0, 10f);
    }

    public void playsound7(View v) {
        sp.play(sound7, 1.0f, 1.0f, 0, 0, 10f);
    }

    public void playsound8(View v) {
        sp.play(sound8, 1.0f, 1.0f, 0, 0, 10f);
    }

    public void playsound9(View v) {
        sp.play(sound9, 1.0f, 1.0f, 0, 0, 10f);
    }
}