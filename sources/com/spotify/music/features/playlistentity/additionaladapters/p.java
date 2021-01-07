package com.spotify.music.features.playlistentity.additionaladapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.t;
import java.util.List;
import java.util.Map;

public interface p extends t {

    public interface a {
        p a(Map<AdditionalAdapter.Position, ? extends List<? extends AdditionalAdapter>> map);
    }

    void n(twd twd, RecyclerView recyclerView);

    void p(LayoutInflater layoutInflater, ViewGroup viewGroup, AdditionalAdapter.Position position);
}
