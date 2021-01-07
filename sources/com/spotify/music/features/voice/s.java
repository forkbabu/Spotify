package com.spotify.music.features.voice;

import androidx.fragment.app.c;
import com.spotify.music.libs.voice.a;
import com.spotify.music.libs.voice.e;

public final class s implements fjf<r> {
    private final wlf<c> a;
    private final wlf<e> b;
    private final wlf<w52> c;
    private final wlf<io.reactivex.subjects.c<Boolean>> d;
    private final wlf<a> e;

    public s(wlf<c> wlf, wlf<e> wlf2, wlf<w52> wlf3, wlf<io.reactivex.subjects.c<Boolean>> wlf4, wlf<a> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
