package defpackage;

import android.content.Context;

/* renamed from: c97  reason: default package */
public final class c97 implements fjf<b97> {
    private final wlf<Context> a;

    public c97(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b97(this.a.get());
    }
}
