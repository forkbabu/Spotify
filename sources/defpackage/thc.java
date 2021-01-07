package defpackage;

import android.content.Context;

/* renamed from: thc  reason: default package */
public final class thc implements fjf<shc> {
    private final wlf<Context> a;

    public thc(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new shc(this.a.get());
    }
}
