package defpackage;

import android.content.Context;

/* renamed from: lja  reason: default package */
public final class lja implements fjf<kja> {
    private final wlf<Context> a;

    public lja(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kja(this.a.get());
    }
}
