package defpackage;

import android.content.res.Resources;

/* renamed from: e15  reason: default package */
public final class e15 implements fjf<d15> {
    private final wlf<Resources> a;

    public e15(wlf<Resources> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d15(this.a.get());
    }
}
