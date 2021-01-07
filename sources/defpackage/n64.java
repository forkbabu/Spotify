package defpackage;

import android.content.Context;

/* renamed from: n64  reason: default package */
public final class n64 implements fjf<m64> {
    private final wlf<Context> a;

    public n64(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m64(this.a.get());
    }
}
