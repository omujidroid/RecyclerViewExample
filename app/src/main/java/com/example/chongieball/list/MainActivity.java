package com.example.chongieball.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set to fixed size
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_main);
        recyclerView.setHasFixedSize(true);

        //set layout for recyclerview
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager
                (getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(R.drawable.kucing, "Kucing", "Felis catus"));
        animals.add(new Animal(R.drawable.anjing, "Anjing", "Canis " +
                "familiaris"));
        animals.add(new Animal(R.drawable.ayam, "Ayam", "Gallus gallus"));
        animals.add(new Animal(R.drawable.babi_hutan, "Babi Hutan", "Sus " +
                "barbatus"));
        animals.add(new Animal(R.drawable.banteng, "Banteng", "Bos javanicus"));
        animals.add(new Animal(R.drawable.cendrawasih, "Cendrawasih",
                "Paradiseseidae"));
        animals.add(new Animal(R.drawable.cumi_cumi, "Cumi-cumi", "Loligo"));
        animals.add(new Animal(R.drawable.gajah, "Gajah", "Elehas maximus"));
        animals.add(new Animal(R.drawable.kalajengking, "Kalajengking",
                "Heterometrus cyaneus"));
        animals.add(new Animal(R.drawable.komodo, "Komodo", "Faranus " +
                "komodonsis"));
        animals.add(new Animal(R.drawable.merak, "Merpati", "Columbia livia"));

        AnimalAdapter adapter = new AnimalAdapter(animals);
        recyclerView.setAdapter(adapter);
    }
}
