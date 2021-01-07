package com.spotify.music.features.podcast.entity.presentation;

import android.content.Context;
import androidx.lifecycle.n;
import com.spotify.android.glue.components.toolbar.d;
import com.spotify.music.features.podcast.entity.l;

public final class z implements fjf<ToolbarPresenterImpl> {
    private final wlf<Context> a;
    private final wlf<d> b;
    private final wlf<String> c;
    private final wlf<l> d;
    private final wlf<n> e;

    public z(wlf<Context> wlf, wlf<d> wlf2, wlf<String> wlf3, wlf<l> wlf4, wlf<n> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ToolbarPresenterImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
