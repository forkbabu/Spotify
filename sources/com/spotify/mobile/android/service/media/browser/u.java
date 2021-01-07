package com.spotify.mobile.android.service.media.browser;

import io.reactivex.y;

public final class u implements fjf<t> {
    private final wlf<qna> a;
    private final wlf<y> b;
    private final wlf<y> c;

    public u(wlf<qna> wlf, wlf<y> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t(this.a.get(), this.b.get(), this.c.get());
    }
}
