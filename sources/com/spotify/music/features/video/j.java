package com.spotify.music.features.video;

import android.content.Context;
import com.google.android.exoplayer2.upstream.o;

public final class j implements fjf<o> {
    private final wlf<Context> a;

    public j(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o.b(this.a.get()).a();
    }
}
