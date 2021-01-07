package com.spotify.music.preview;

import android.content.Context;
import io.reactivex.y;

public final class s implements fjf<r> {
    private final wlf<Context> a;
    private final wlf<cqe> b;
    private final wlf<y> c;

    public s(wlf<Context> wlf, wlf<cqe> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a, this.b, this.c);
    }
}
