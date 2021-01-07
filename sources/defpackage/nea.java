package defpackage;

import android.content.Context;

/* renamed from: nea  reason: default package */
public final class nea implements fjf<mea> {
    private final wlf<Context> a;

    public nea(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mea(this.a.get());
    }
}
