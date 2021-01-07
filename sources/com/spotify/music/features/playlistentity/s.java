package com.spotify.music.features.playlistentity;

import android.content.Context;
import com.spotify.music.navigation.b;
import com.spotify.music.navigation.o;

public final class s implements fjf<r> {
    private final wlf<Context> a;
    private final wlf<b> b;
    private final wlf<o> c;

    public s(wlf<Context> wlf, wlf<b> wlf2, wlf<o> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a.get(), this.b.get(), this.c.get());
    }
}
