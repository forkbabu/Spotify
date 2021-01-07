package com.spotify.music.podcast.entity.adapter.episoderow;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public interface i {

    public interface a {
        i create();
    }

    View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    void b(j jVar);
}
