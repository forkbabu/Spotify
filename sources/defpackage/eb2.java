package defpackage;

import android.content.Context;

/* renamed from: eb2  reason: default package */
public final class eb2 implements fjf<db2> {
    private final wlf<Context> a;

    public eb2(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new db2(this.a.get());
    }
}
