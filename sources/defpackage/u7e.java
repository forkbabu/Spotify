package defpackage;

import android.content.Context;

/* renamed from: u7e  reason: default package */
public final class u7e implements fjf<t7e> {
    private final wlf<Context> a;

    public u7e(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t7e(this.a.get());
    }
}
