package defpackage;

import android.content.res.Resources;

/* renamed from: la5  reason: default package */
public final class la5 implements fjf<ka5> {
    private final wlf<e61> a;
    private final wlf<b61> b;
    private final wlf<Resources> c;

    public la5(wlf<e61> wlf, wlf<b61> wlf2, wlf<Resources> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ka5(this.a.get(), this.b.get(), this.c.get());
    }
}
