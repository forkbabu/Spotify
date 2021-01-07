package defpackage;

import android.content.Context;

/* renamed from: hne  reason: default package */
public final class hne implements fjf<gne> {
    private final wlf<Context> a;

    public hne(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gne(this.a.get());
    }
}
