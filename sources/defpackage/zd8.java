package defpackage;

import android.content.res.Resources;

/* renamed from: zd8  reason: default package */
public final class zd8 implements fjf<yd8> {
    private final wlf<Resources> a;

    public zd8(wlf<Resources> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yd8(this.a.get());
    }
}
