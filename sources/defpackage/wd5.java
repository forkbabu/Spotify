package defpackage;

import android.content.Context;
import com.spotify.remoteconfig.x6;

/* renamed from: wd5  reason: default package */
public final class wd5 implements fjf<vd5> {
    private final wlf<Context> a;
    private final wlf<yk8> b;
    private final wlf<x6> c;

    public wd5(wlf<Context> wlf, wlf<yk8> wlf2, wlf<x6> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vd5(this.a.get(), this.b.get(), this.c.get());
    }
}
