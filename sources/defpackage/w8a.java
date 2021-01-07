package defpackage;

import android.content.Context;

/* renamed from: w8a  reason: default package */
public final class w8a implements fjf<v8a> {
    private final wlf<y8a> a;
    private final wlf<Context> b;

    public w8a(wlf<y8a> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v8a(this.a, this.b);
    }
}
