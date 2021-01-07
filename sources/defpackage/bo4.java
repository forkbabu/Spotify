package defpackage;

import android.content.Context;

/* renamed from: bo4  reason: default package */
public final class bo4 implements fjf<ao4> {
    private final wlf<Context> a;

    public bo4(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ao4(this.a.get());
    }
}
