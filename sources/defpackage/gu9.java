package defpackage;

import android.content.Context;

/* renamed from: gu9  reason: default package */
public final class gu9 implements fjf<fu9> {
    private final wlf<Context> a;
    private final wlf<String> b;

    public gu9(wlf<Context> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fu9(this.a.get(), this.b.get());
    }
}
