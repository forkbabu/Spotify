package defpackage;

import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.remoteconfig.x4;

/* renamed from: ti1  reason: default package */
public final class ti1 implements fjf<si1> {
    private final wlf<aaa> a;
    private final wlf<o> b;
    private final wlf<x4> c;

    public ti1(wlf<aaa> wlf, wlf<o> wlf2, wlf<x4> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new si1(this.a.get(), this.b.get(), this.c.get());
    }
}
