package defpackage;

import android.content.res.Resources;

/* renamed from: e85  reason: default package */
public final class e85 implements fjf<d85> {
    private final wlf<Resources> a;

    public e85(wlf<Resources> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d85(this.a.get());
    }
}
