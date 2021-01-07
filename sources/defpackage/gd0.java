package defpackage;

import android.content.Context;

/* renamed from: gd0  reason: default package */
public final class gd0 implements fjf<fd0> {
    private final wlf<Context> a;

    public gd0(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fd0(this.a.get());
    }
}
