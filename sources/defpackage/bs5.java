package defpackage;

import android.app.Activity;
import io.reactivex.y;
import java.util.Set;

/* renamed from: bs5  reason: default package */
public final class bs5 implements fjf<as5> {
    private final wlf<es5> a;
    private final wlf<w82> b;
    private final wlf<cs5> c;
    private final wlf<Activity> d;
    private final wlf<vr5> e;
    private final wlf<Set<wa2>> f;
    private final wlf<vla> g;
    private final wlf<y> h;

    public bs5(wlf<es5> wlf, wlf<w82> wlf2, wlf<cs5> wlf3, wlf<Activity> wlf4, wlf<vr5> wlf5, wlf<Set<wa2>> wlf6, wlf<vla> wlf7, wlf<y> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        es5 es5 = this.a.get();
        return new as5(es5, this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
