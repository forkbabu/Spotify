package com.spotify.music.features.playlistentity.header;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.components.toolbar.d;
import com.spotify.music.features.playlistentity.t;
import java.util.List;

public interface m0 extends ar6, t {
    RecyclerView getRecyclerView();

    List<View> o(LayoutInflater layoutInflater, ViewGroup viewGroup, d dVar);
}
