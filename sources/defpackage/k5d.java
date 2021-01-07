package defpackage;

import android.app.Activity;
import io.reactivex.y;

/* renamed from: k5d  reason: default package */
public final class k5d implements fjf<i5d> {
    private final wlf<lad> a;
    private final wlf<y> b;
    private final wlf<vad> c;
    private final wlf<f4d> d;
    private final wlf<t7d> e;
    private final wlf<Activity> f;
    private final wlf<jad> g;

    public k5d(wlf<lad> wlf, wlf<y> wlf2, wlf<vad> wlf3, wlf<f4d> wlf4, wlf<t7d> wlf5, wlf<Activity> wlf6, wlf<jad> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i5d(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
