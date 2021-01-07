package defpackage;

import android.content.Context;
import com.spotify.mobile.android.recentlyplayed.a;
import com.spotify.remoteconfig.x4;

/* renamed from: yh1  reason: default package */
public final class yh1 implements fjf<xh1> {
    private final wlf<Context> a;
    private final wlf<a> b;
    private final wlf<x4> c;
    private final wlf<c4e> d;

    public yh1(wlf<Context> wlf, wlf<a> wlf2, wlf<x4> wlf3, wlf<c4e> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xh1(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
