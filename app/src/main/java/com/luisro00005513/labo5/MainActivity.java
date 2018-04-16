package com.luisro00005513.labo5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ModeloPlaneta> planetList;
    RecyclerView recycleView;
    AdaptadorPlaneta adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        planetList = new ArrayList<>();
        fillList(planetList);


        recycleView = findViewById(R.id.reciclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        adapter = new AdaptadorPlaneta(this, planetList);

        recycleView.setLayoutManager(linearLayoutManager);
        recycleView.setAdapter(adapter);

    }

    private ArrayList<ModeloPlaneta> fillList(){
        ArrayList<ModeloPlaneta> l = new ArrayList<>();
        String desc = "hola mundo";
        l.add(new ModeloPlaneta(1,"ella",desc));
        l.add(new ModeloPlaneta(1,"ella Contra ataca",desc));
        l.add(new ModeloPlaneta(1,"ella no te quiere",desc));
        return l;

    }

}
