package com.example.almanaque10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    private SearchView SvSearch;
    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        recyclerView = (RecyclerView) findViewById(R.id.Rv1);
        itemAdapter =  new ItemAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        itemAdapter.setData(getData());
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        SvSearch = (SearchView) findViewById(R.id.Barra_busqueda);
    }
    private List<Items> getData() {
        List<Items> list = new ArrayList<>();
        list.add(new Items(R.drawable.ichika,"Ichika"));
        list.add(new Items(R.drawable.nino, "Nino"));
        list.add(new Items(R.drawable.miku, "Miku"));
        list.add(new Items(R.drawable.yotsuba, "Yotsuba"));
        list.add(new Items(R.drawable.itsuki, "Itsuki"));
        return list;
    }
    public void Editar(View v){
        Intent sig = new Intent(this,MainActivity5.class);
        startActivity(sig);
    }
    public void Actualizar(View v){
        Intent sig = new Intent(this,MainActivity6.class);
        startActivity(sig);
    }

    public void Eliminar(View v){
        Intent sig = new Intent(this,MainActivity7.class);
        startActivity(sig);
    }
}