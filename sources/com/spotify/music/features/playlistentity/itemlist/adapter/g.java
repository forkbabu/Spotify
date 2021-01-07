package com.spotify.music.features.playlistentity.itemlist.adapter;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.l;
import java.util.List;

public interface g<T extends RecyclerView.e<? extends RecyclerView.b0>> {
    void c(j jVar, List<l> list);

    T e();

    void i(ItemConfiguration itemConfiguration);

    void j(String str, boolean z);
}
