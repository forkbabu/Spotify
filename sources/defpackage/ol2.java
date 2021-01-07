package defpackage;

import android.content.Context;
import com.spotify.remoteconfig.yc;

/* renamed from: ol2  reason: default package */
public final class ol2 implements fjf<nl2> {
    private final wlf<tl2> a;
    private final wlf<Context> b;
    private final wlf<sda> c;
    private final wlf<yc> d;

    public ol2(wlf<tl2> wlf, wlf<Context> wlf2, wlf<sda> wlf3, wlf<yc> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nl2(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
