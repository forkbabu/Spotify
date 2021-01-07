package com.spotify.mobile.android.rx;

import io.reactivex.s;
import io.reactivex.y;
import java.util.Map;

public final class p implements fjf<s<Map<String, String>>> {
    private final wlf<j> a;
    private final wlf<y> b;

    public p(wlf<j> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().a().v0(1).h1().o0(this.b.get());
    }
}
