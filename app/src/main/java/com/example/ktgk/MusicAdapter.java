package com.example.ktgk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MusicAdapter extends BaseAdapter {


    private Context context;
    private  int idLayout;
    private List<Music> musicList = new ArrayList<Music>();

    public MusicAdapter(Context context, int idLayout, List<Music> musicList) {
        this.context = context;
        this.idLayout = idLayout;
        this.musicList = musicList;
    }

    @Override
    public int getCount() {
        if (musicList.size() != 0 && !musicList.isEmpty()) {
            return musicList.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view  = LayoutInflater.from(context).inflate(idLayout,null);
        ImageView imageView = view.findViewById(R.id.imageView2);
        TextView name = view.findViewById(R.id.textView4);
        TextView nameSong = view.findViewById(R.id.textView5);

        imageView.setImageResource(musicList.get(i).getImage());
        name.setText(musicList.get(i).getName());
        nameSong.setText(musicList.get(i).getNameSong());

        return view;
    }
}
