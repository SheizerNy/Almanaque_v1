package com.example.almanaque10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity2 extends AppCompatActivity {

    ProgressBar pb;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pb = (ProgressBar) findViewById(R.id.pb1);
        Progressbar();
    }
    public void Progressbar(){
        final Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                contador++;
                pb.setProgress(contador);
                if(contador==100){
                    t.cancel();
                }
            }
        };
        t.schedule(tt,0,100);
    }

    public void Siguiente(View v){
        Intent sig = new Intent(this,MainActivity4.class);
        startActivity(sig);
    }
}