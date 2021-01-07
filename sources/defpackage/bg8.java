package defpackage;

import android.content.Context;

/* renamed from: bg8  reason: default package */
public final class bg8 implements fjf<ag8> {
    private final wlf<Context> a;
    private final wlf<cg8> b;

    public bg8(wlf<Context> wlf, wlf<cg8> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ag8(this.a.get(), this.b.get());
    }
}
