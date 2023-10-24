package com.example.ejemplo_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.ejemplo_recycler.Models.ItemList;
import com.example.ejemplo_recycler.adapter.ArtistAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvList;

    private ArtistAdapter adp;
    private List<ItemList> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initValues();
    }

    private void initViews() {
        rvList = findViewById(R.id.rvLista);
    }

    private void initValues() {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvList.setLayoutManager(manager);
        items = getItems();
        adp = new ArtistAdapter(items);
        rvList.setAdapter(adp);
    }

    private List<ItemList> getItems() {
        List<ItemList> itemLists = new ArrayList<>();
        itemLists.add(new ItemList("Junior H", R.drawable.jundior));

        itemLists.add(new ItemList("Natanael Cano", R.drawable.nata));
        itemLists.add(new ItemList("Junior H", R.drawable.jundior));
        itemLists.add(new ItemList("Junior H", R.drawable.jundior));
        itemLists.add(new ItemList("Junior H", R.drawable.jundior));

        itemLists.add(new ItemList("Natanael Cano", R.drawable.nata));
        for (ItemList item : itemLists) {
            if (item.getArtist().equals("Jundior")) {
                item.setCustomDescription("Corridos tmbados");
            }


            if (item.getArtist().equals("Natanael Cano")) {
                item.setCustomDescription("King of CT");
            }


        }
        return itemLists;
    }

}
