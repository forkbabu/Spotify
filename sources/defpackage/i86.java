package defpackage;

import android.content.Context;

/* renamed from: i86  reason: default package */
public final class i86 implements fjf<h86> {
    private final wlf<Context> a;

    public i86(wlf<Context> wlf) {
        this.a = wlf;
    }

    public static h86 a(wlf<Context> wlf) {
        return new h86(wlf);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h86(this.a);
    }
}
