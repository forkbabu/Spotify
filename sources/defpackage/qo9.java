package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: qo9  reason: default package */
public final class qo9 implements fjf<po9> {
    private final wlf<DisplayMetrics> a;
    private final wlf<Resources> b;

    public qo9(wlf<DisplayMetrics> wlf, wlf<Resources> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new po9(this.a.get(), this.b.get());
    }
}
