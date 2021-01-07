package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.o;

/* renamed from: ah1  reason: default package */
public final class ah1 implements fjf<zg1> {
    private final wlf<Context> a;
    private final wlf<xj2> b;
    private final wlf<x9a> c;
    private final wlf<o> d;

    public ah1(wlf<Context> wlf, wlf<xj2> wlf2, wlf<x9a> wlf3, wlf<o> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zg1(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
