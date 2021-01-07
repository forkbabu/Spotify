package defpackage;

import android.content.Context;

/* renamed from: mb6  reason: default package */
public final class mb6 implements fjf<lb6> {
    private final wlf<Context> a;

    public mb6(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lb6(this.a.get());
    }
}
