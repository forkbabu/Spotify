package com.spotify.music.libs.ageverification;

import android.content.Context;
import androidx.lifecycle.n;
import com.spotify.mobile.android.rx.w;
import io.reactivex.y;

public final class h implements fjf<AgeRestrictedContentFacade> {
    private final wlf<uy9> a;
    private final wlf<w> b;
    private final wlf<Context> c;
    private final wlf<n> d;
    private final wlf<y> e;
    private final wlf<n> f;

    public h(wlf<uy9> wlf, wlf<w> wlf2, wlf<Context> wlf3, wlf<n> wlf4, wlf<y> wlf5, wlf<n> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static h a(wlf<uy9> wlf, wlf<w> wlf2, wlf<Context> wlf3, wlf<n> wlf4, wlf<y> wlf5, wlf<n> wlf6) {
        return new h(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AgeRestrictedContentFacade(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
