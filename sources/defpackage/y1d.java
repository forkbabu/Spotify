package defpackage;

import android.util.DisplayMetrics;
import defpackage.w1d;

/* renamed from: y1d  reason: default package */
public final class y1d implements fjf<w1d> {
    private final wlf<w1d.a> a;
    private final wlf<DisplayMetrics> b;

    public y1d(wlf<w1d.a> wlf, wlf<DisplayMetrics> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w1d(this.a.get(), this.b.get());
    }
}
