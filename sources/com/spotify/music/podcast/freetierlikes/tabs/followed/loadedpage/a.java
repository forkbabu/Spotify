package com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.pageloader.s0;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class a implements s0 {
    private final g a;
    private final d b;
    private final s<ryd> c;

    /* renamed from: com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.a$a  reason: collision with other inner class name */
    public interface AbstractC0327a {
        a a(s<ryd> sVar);
    }

    public a(g gVar, d dVar, s<ryd> sVar) {
        h.e(gVar, "viewBinder");
        h.e(dVar, "presenter");
        h.e(sVar, "observable");
        this.a = gVar;
        this.b = dVar;
        this.c = sVar;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.a.getView();
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        this.a.a(layoutInflater, viewGroup);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.b.a(this.c);
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.b.stop();
    }
}
