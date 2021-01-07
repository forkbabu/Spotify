package defpackage;

import android.content.Context;

/* renamed from: o8a  reason: default package */
public final class o8a implements fjf<n8a> {
    private final wlf<Context> a;

    public o8a(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n8a(this.a.get());
    }
}
