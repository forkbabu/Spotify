package defpackage;

import android.content.Context;

/* renamed from: be2  reason: default package */
public final class be2 implements fjf<ae2> {
    private final wlf<Context> a;

    public be2(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ae2(this.a.get());
    }
}
