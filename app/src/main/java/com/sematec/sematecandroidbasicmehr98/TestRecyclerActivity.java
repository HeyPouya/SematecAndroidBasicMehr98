package com.sematec.sematecandroidbasicmehr98;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestRecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler);
        RecyclerView recycler = findViewById(R.id.recycler);

        ArrayList<String> list = new ArrayList<>();
        list.add("Pouya Heydari");
        list.add("Mehdi Behjati");
        list.add("Sepehr Tajbakhsh");
        list.add("Vahid Taatefi");
        list.add("Afsane Taqipour");
        list.add("Ali Sabzebin");
        list.add("Ali Salehi");
        list.add("Masoud Alipour");
        list.add("Ziba Faris");
        list.add("Varand Qazarian");
        list.add("Behnam Masoodi");
        list.add("Hoora MehdiPour");
        list.add("Amin Mousavi");


        TestRecyclerAdapter adapter = new TestRecyclerAdapter(list);

        recycler.setAdapter(adapter);

        recycler.setLayoutManager(new LinearLayoutManager(TestRecyclerActivity.this, RecyclerView.VERTICAL, false));
    }
}
