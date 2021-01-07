package defpackage;

import android.content.res.Resources;

/* renamed from: g2c  reason: default package */
public final class g2c implements fjf<f2c> {
    private final wlf<Resources> a;
    private final wlf<h2c> b;

    public g2c(wlf<Resources> wlf, wlf<h2c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f2c(this.a.get(), this.b.get());
    }
}
