package defpackage;

import android.content.Context;

/* renamed from: jl7  reason: default package */
public final class jl7 implements fjf<il7> {
    private final wlf<Context> a;
    private final wlf<at7> b;

    public jl7(wlf<Context> wlf, wlf<at7> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new il7(this.a.get(), this.b.get());
    }
}
