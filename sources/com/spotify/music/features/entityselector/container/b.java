package com.spotify.music.features.entityselector.container;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.spotify.music.features.entityselector.pages.podcasts.PodcastsFragment;
import com.spotify.music.features.entityselector.pages.tracks.TracksFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

public final class b extends FragmentStateAdapter {
    private final List<String> t;
    private final String u;
    private final dz4 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Fragment fragment, List<String> list, String str, dz4 dz4) {
        super(fragment);
        h.e(fragment, "fragment");
        h.e(list, "playlistItems");
        h.e(dz4, "entitySelectorLogger");
        this.t = list;
        this.u = str;
        this.v = dz4;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment Z(int i) {
        if (i == 0) {
            this.v.e();
            String str = this.u;
            List<String> list = this.t;
            h.e(list, "playlistItems");
            TracksFragment tracksFragment = new TracksFragment();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("playlist_items", new ArrayList<>(list));
            if (str != null) {
                bundle.putString("list_name", str);
            }
            tracksFragment.r4(bundle);
            return tracksFragment;
        } else if (i == 1) {
            this.v.d();
            List<String> list2 = this.t;
            h.e(list2, "playlistItems");
            PodcastsFragment podcastsFragment = new PodcastsFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putStringArrayList("playlist_items", new ArrayList<>(list2));
            podcastsFragment.r4(bundle2);
            return podcastsFragment;
        } else {
            throw new IllegalStateException("unknown index".toString());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return 2;
    }
}
