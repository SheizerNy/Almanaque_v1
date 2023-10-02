package com.example.almanaque10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity3 extends AppCompatActivity {

    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        et1 = (EditText) findViewById(R.id.User);
        et2 = (EditText) findViewById(R.id.Pass);
    }

    public void New_register(View v){
        String name = et1.getText().toString();
        String pass = et2.getText().toString();
        if(et1.getText().toString().isEmpty() && et2.getText().toString().isEmpty() ){
            Toast.makeText(MainActivity3.this,"Ninguno de los campos ha sido rellenado",Toast.LENGTH_SHORT).show();
        }else if(et1.getText().toString().isEmpty()){
            Toast.makeText(MainActivity3.this,"Rellene el nombre de usuario",Toast.LENGTH_SHORT).show();
        }
        else if(et2.getText().toString().isEmpty()){
            Toast.makeText(MainActivity3.this,"Rellene la contraseña",Toast.LENGTH_SHORT).show();
        }else{
            User invitado = new User(name,pass);
            Intent sig = new Intent(this,MainActivity4.class);
            startActivity(sig);
        }
    }
}