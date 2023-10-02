package com.example.almanaque10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public User Admin = new User("Ny","Mocosa05");

    private EditText et1;
    private EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.User);
        et2 = (EditText) findViewById(R.id.Pass);
    }
    public void Login(View v) {
        if(et1.getText().toString().isEmpty() && et2.getText().toString().isEmpty() ){
            Toast.makeText(MainActivity.this,"Ninguno de los campos ha sido rellenado",Toast.LENGTH_SHORT).show();
        }else if(et1.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this,"Rellene el nombre de usuario",Toast.LENGTH_SHORT).show();
        }
        else if(et2.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this,"Rellene la contraseña",Toast.LENGTH_SHORT).show();
        }else{
            Intent sig = new Intent(this,MainActivity2.class);
            startActivity(sig);
        }
    }

    public void Register(View v){
        Intent sig = new Intent(this,MainActivity3.class);
        startActivity(sig);
    }
}