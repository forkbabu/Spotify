package defpackage;

import android.content.Context;

/* renamed from: ld0  reason: default package */
public final class ld0 implements fjf<kd0> {
    private final wlf<Context> a;

    public ld0(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kd0(this.a.get());
    }
}
