package com.example.loginsqlite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Profil extends AppCompatActivity implements GaleriAdapter.OnAdapterClickListener {
    GaleriClass galeri;
    RecyclerView recyclerView;
    private List<GaleriClass> galeris = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galeri);

        recyclerView = findViewById(R.id.rv_galeri);
        galeris = new ArrayList<GaleriClass>();
        galeris = initData();
        GaleriAdapter adapter = new GaleriAdapter(galeris,this);
        adapter.setListener(this);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(adapter);

    }

    public ArrayList<GaleriClass> initData(){
        ArrayList<GaleriClass> list = new ArrayList<>();
        list.add(new GaleriClass(1,"test","user"));
        list.add(new GaleriClass(2,"test3","galeri_dasbord"));
        list.add(new GaleriClass(2,"test2","pamerdiesen"));
        list.add(new GaleriClass(2,"test2","password"));
        list.add(new GaleriClass(2,"test2","user"));
        return list;
    }

    @Override
    public void DetailonClick(GaleriClass galeriClass) {
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("id",galeriClass.getId());
        intent.putExtra("nama",galeriClass.getName());
        intent.putExtra("photo",galeriClass.getPhoto());
        startActivity(intent);
    }
}
