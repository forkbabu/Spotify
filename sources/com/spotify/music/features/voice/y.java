package com.spotify.music.features.voice;

import androidx.fragment.app.c;
import com.spotify.mobile.android.rx.w;
import com.spotify.music.libs.voice.b;
import com.spotify.music.libs.voice.e;

public final class y implements fjf<x> {
    private final wlf<c> a;
    private final wlf<e> b;
    private final wlf<w52> c;
    private final wlf<io.reactivex.subjects.c<Boolean>> d;
    private final wlf<b> e;
    private final wlf<w> f;
    private final wlf<Boolean> g;

    public y(wlf<c> wlf, wlf<e> wlf2, wlf<w52> wlf3, wlf<io.reactivex.subjects.c<Boolean>> wlf4, wlf<b> wlf5, wlf<w> wlf6, wlf<Boolean> wlf7) {
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
        return new x(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get().booleanValue());
    }
}
