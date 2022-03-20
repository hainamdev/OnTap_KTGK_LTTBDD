package com.example.ktgk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Music> musicList = new ArrayList<Music>();

        Music m01 = new Music("1" , R.drawable.music, "Please No Ego Again" , "Jessie J") ;
        Music m02 = new Music("2" , R.drawable.music, "Son of Life" , "Niamh Toliver") ;
        Music m03 = new Music("3" , R.drawable.music, "A Darker Kind Of Moods" , "Gemma Lorris") ;
        Music m04 = new Music("4" , R.drawable.music, "Where the Sea and Land" , "Mystery") ;

        musicList.add(m01);
        musicList.add(m02);
        musicList.add(m03);
        musicList.add(m04);

        GridView gridView = findViewById(R.id.Grid);
        gridView.setAdapter(new MusicAdapter(this,R.layout.list_view_new_music,musicList));

//        RecyclerView recyclerView = findViewById(R.id.recyclerView);
//        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
//        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(mLayoutManager);
////        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        recyclerView.setAdapter(new MusicAdapter(this,R.layout.list_view_new_music,musicList));




    }
}