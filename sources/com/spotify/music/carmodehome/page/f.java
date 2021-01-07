package com.spotify.music.carmodehome.page;

import com.spotify.music.connection.l;
import io.reactivex.s;
import io.reactivex.y;

public final class f implements fjf<e> {
    private final wlf<y> a;
    private final wlf<dr2> b;
    private final wlf<l> c;
    private final wlf<s<Boolean>> d;

    public f(wlf<y> wlf, wlf<dr2> wlf2, wlf<l> wlf3, wlf<s<Boolean>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a, this.b, this.c, this.d);
    }
}
