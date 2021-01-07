package defpackage;

import android.content.Context;

/* renamed from: af5  reason: default package */
public final class af5 implements fjf<yk8> {
    private final wlf<Context> a;

    public af5(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yk8(this.a.get(), "GoUtterance");
    }
}
