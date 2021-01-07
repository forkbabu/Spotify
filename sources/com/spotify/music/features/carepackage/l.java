package com.spotify.music.features.carepackage;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.share.menu.preview.api.e;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.preview.v;
import com.spotify.playlist.endpoints.i;
import io.reactivex.a;
import io.reactivex.y;

public final class l implements fjf<CarePackageInjector> {
    private final wlf<SpSharedPreferences<Object>> a;
    private final wlf<i> b;
    private final wlf<e> c;
    private final wlf<v> d;
    private final wlf<y> e;
    private final wlf<qy4> f;
    private final wlf<String> g;
    private final wlf<si4> h;
    private final wlf<nmf<String, a>> i;
    private final wlf<SnackbarManager> j;
    private final wlf<vh4> k;
    private final wlf<ui4> l;

    public l(wlf<SpSharedPreferences<Object>> wlf, wlf<i> wlf2, wlf<e> wlf3, wlf<v> wlf4, wlf<y> wlf5, wlf<qy4> wlf6, wlf<String> wlf7, wlf<si4> wlf8, wlf<nmf<String, a>> wlf9, wlf<SnackbarManager> wlf10, wlf<vh4> wlf11, wlf<ui4> wlf12) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
        this.l = wlf12;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new CarePackageInjector(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get());
    }
}
