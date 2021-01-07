package defpackage;

import android.content.Context;

/* renamed from: zk8  reason: default package */
public final class zk8 implements fjf<yk8> {
    private final wlf<Context> a;

    public zk8(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yk8(this.a.get(), "SpotOnUtterance");
    }
}
