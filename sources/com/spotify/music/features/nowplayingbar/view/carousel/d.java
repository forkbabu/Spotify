package com.spotify.music.features.nowplayingbar.view.carousel;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.common.recyclerview.b;
import com.spotify.music.features.nowplayingbar.view.carousel.NowPlayingBarTrackViewHolder;

public class d extends b<NowPlayingBarTrackViewHolder> {
    private final Resources c;
    private View.OnClickListener f;
    private ImmutableList<ou5> n;
    private NowPlayingBarTrackViewHolder.TrackDisplayMode o = NowPlayingBarTrackViewHolder.TrackDisplayMode.TWO_LINE_METADATA;

    public d(Resources resources) {
        this.c = resources;
        this.n = ImmutableList.of();
    }

    public static void c0(d dVar, View view) {
        View.OnClickListener onClickListener = dVar.f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        NowPlayingBarTrackViewHolder nowPlayingBarTrackViewHolder = (NowPlayingBarTrackViewHolder) b0Var;
        nowPlayingBarTrackViewHolder.v0(this.o);
        nowPlayingBarTrackViewHolder.u0(this.n.get(i));
        nowPlayingBarTrackViewHolder.a.setOnClickListener(new a(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return new NowPlayingBarTrackViewHolder(viewGroup);
    }

    public void Z() {
        NowPlayingBarTrackViewHolder.TrackDisplayMode trackDisplayMode = this.o;
        NowPlayingBarTrackViewHolder.TrackDisplayMode trackDisplayMode2 = NowPlayingBarTrackViewHolder.TrackDisplayMode.ONE_LINE_METADATA;
        if (trackDisplayMode != trackDisplayMode2) {
            this.o = trackDisplayMode2;
            z();
        }
    }

    public void b0() {
        NowPlayingBarTrackViewHolder.TrackDisplayMode trackDisplayMode = this.o;
        NowPlayingBarTrackViewHolder.TrackDisplayMode trackDisplayMode2 = NowPlayingBarTrackViewHolder.TrackDisplayMode.TWO_LINE_METADATA;
        if (trackDisplayMode != trackDisplayMode2) {
            this.o = trackDisplayMode2;
            z();
        }
    }

    public void f0(ImmutableList<ou5> immutableList) {
        immutableList.getClass();
        m.c b = m.b(new f(this.c, this.n, immutableList), true);
        this.n = immutableList;
        b.a(new androidx.recyclerview.widget.b(this));
    }

    public void g0(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.n.size();
    }
}
