package com.spotify.music.features.playlistentity.trackcloud;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.playlistallsongs.c;
import com.spotify.music.features.playlistentity.configuration.i;
import com.spotify.music.features.playlistentity.t;

public interface b0 extends t {

    public interface a {
        b0 a(i iVar, c cVar);
    }

    void t(LayoutInflater layoutInflater, ViewGroup viewGroup, RecyclerView recyclerView, twd twd);
}
