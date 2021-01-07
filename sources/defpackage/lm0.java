package defpackage;

import android.content.Context;

/* renamed from: lm0  reason: default package */
public final class lm0 implements fjf<km0> {
    private final wlf<Context> a;

    public lm0(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new km0(this.a.get());
    }
}
