package com.spotify.music.features.ads.audioplus.overlay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.features.ads.audioplus.d;

public interface i {

    public interface a {
        i create();
    }

    View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    void b(e eVar, d dVar);
}
