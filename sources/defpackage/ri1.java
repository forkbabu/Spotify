package defpackage;

import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.remoteconfig.x4;

/* renamed from: ri1  reason: default package */
public final class ri1 implements fjf<qi1> {
    private final wlf<t9a> a;
    private final wlf<x4> b;
    private final wlf<o> c;

    public ri1(wlf<t9a> wlf, wlf<x4> wlf2, wlf<o> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qi1(this.a.get(), this.b.get(), this.c.get());
    }
}
