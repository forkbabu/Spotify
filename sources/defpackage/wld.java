package defpackage;

import android.content.Context;

/* renamed from: wld  reason: default package */
public final class wld implements fjf<vld> {
    private final wlf<Context> a;

    public wld(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vld(this.a.get());
    }
}
