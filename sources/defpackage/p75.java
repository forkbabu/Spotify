package defpackage;

import android.content.Context;

/* renamed from: p75  reason: default package */
public final class p75 implements fjf<o75> {
    private final wlf<Context> a;

    public p75(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o75(this.a.get());
    }
}
