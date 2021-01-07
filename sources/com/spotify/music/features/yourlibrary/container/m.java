package com.spotify.music.features.yourlibrary.container;

import android.content.Context;
import androidx.lifecycle.n;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.json.g;

public final class m implements fjf<YourLibraryPrefs> {
    private final wlf<cqe> a;
    private final wlf<Context> b;
    private final wlf<n> c;
    private final wlf<g> d;
    private final wlf<i> e;
    private final wlf<w09> f;
    private final wlf<e> g;

    public m(wlf<cqe> wlf, wlf<Context> wlf2, wlf<n> wlf3, wlf<g> wlf4, wlf<i> wlf5, wlf<w09> wlf6, wlf<e> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new YourLibraryPrefs(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
