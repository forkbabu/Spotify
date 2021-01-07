package defpackage;

import android.content.res.Resources;

/* renamed from: rf5  reason: default package */
public final class rf5 implements fjf<qf5> {
    private final wlf<Resources> a;

    public rf5(wlf<Resources> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qf5(this.a.get());
    }
}
