package br.com.etecia.mystaggered;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    ArrayList images = new ArrayList<>(Arrays.asList(
            R.drawable.imgum, R.drawable.imgdois, R.drawable.imgtres, R.drawable.imgquatro,
            R.drawable.imgcinco, R.drawable.imgseis, R.drawable.imgsete, R.drawable.imgoito,
            R.drawable.imgnove, R.drawable.imgdez));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        Adapter adapter = new Adapter(images, MainActivity.this);

        recyclerView.setAdapter(adapter);
    }
}