package com.spotify.music.features.yourlibrary.musicpages.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;

public class c1 extends nc0 {
    private final TextView c;

    public c1(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(C0707R.layout.music_pages_drilldown_header, viewGroup, false));
        View findViewById = getView().findViewById(C0707R.id.title);
        findViewById.getClass();
        this.c = (TextView) findViewById;
    }

    public void setTitle(String str) {
        this.c.setText(str);
    }
}
