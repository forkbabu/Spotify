package defpackage;

import com.spotify.remoteconfig.sa;
import defpackage.yzc;

/* renamed from: a0d  reason: default package */
public final class a0d implements fjf<yzc.a> {
    private final wlf<sa> a;
    private final wlf<b0d> b;
    private final wlf<uzc> c;

    public a0d(wlf<sa> wlf, wlf<b0d> wlf2, wlf<uzc> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yzc.a(this.a.get(), this.b.get(), this.c.get());
    }
}
