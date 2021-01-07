package com.spotify.music.features.playlistentity.empty;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.features.playlistentity.t;
import java.util.List;

public interface l extends t {

    public interface a {
        l create();
    }

    List<View> a(LayoutInflater layoutInflater, ViewGroup viewGroup, twd twd);
}
