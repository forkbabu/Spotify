package com.spotify.music.features.podcast.episode.inspector.tracklist.views.page;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.pageloader.s0;
import io.reactivex.s;

public class b implements s0 {
    private final d a;
    private final g b;
    private final s<k87> c;

    public b(d dVar, g gVar, s<k87> sVar) {
        this.a = dVar;
        this.b = gVar;
        this.c = sVar;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.b.b();
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.b.a(layoutInflater, viewGroup);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.a.b(this.c);
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.a.stop();
    }
}
