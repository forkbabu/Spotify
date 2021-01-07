package com.spotify.music.features.yourepisodes.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import kotlin.a;
import kotlin.d;
import kotlin.jvm.internal.h;

public final class YourEpisodesViewsImpl implements a0 {
    private final d a;
    private final d b = a.b(new YourEpisodesViewsImpl$headerContainer$2(this));
    private final d c = a.b(new YourEpisodesViewsImpl$recyclerView$2(this));
    private final d d = a.b(new YourEpisodesViewsImpl$recyclerScroll$2(this));
    private final d e = a.b(new YourEpisodesViewsImpl$emptyView$2(this));

    public YourEpisodesViewsImpl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "inflater");
        h.e(viewGroup, "parent");
        this.a = a.b(new YourEpisodesViewsImpl$root$2(layoutInflater, viewGroup));
    }

    @Override // com.spotify.music.features.yourepisodes.view.a0
    public TextView a() {
        return (TextView) this.e.getValue();
    }

    @Override // com.spotify.music.features.yourepisodes.view.a0
    public RecyclerViewFastScroller b() {
        return (RecyclerViewFastScroller) this.d.getValue();
    }

    @Override // com.spotify.music.features.yourepisodes.view.a0
    public CoordinatorLayout c() {
        return (CoordinatorLayout) this.b.getValue();
    }

    @Override // com.spotify.music.features.yourepisodes.view.a0
    public RecyclerView getRecyclerView() {
        return (RecyclerView) this.c.getValue();
    }

    @Override // com.spotify.music.features.yourepisodes.view.a0
    public View i() {
        return (View) this.a.getValue();
    }
}
