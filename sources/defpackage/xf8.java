package defpackage;

import android.content.Context;

/* renamed from: xf8  reason: default package */
public final class xf8 implements fjf<wf8> {
    private final wlf<Context> a;
    private final wlf<cg8> b;

    public xf8(wlf<Context> wlf, wlf<cg8> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wf8(this.a.get(), this.b.get());
    }
}
