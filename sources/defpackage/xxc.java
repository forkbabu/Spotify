package defpackage;

import android.content.Context;

/* renamed from: xxc  reason: default package */
public final class xxc implements fjf<wxc> {
    private final wlf<Context> a;

    public xxc(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wxc(this.a.get());
    }
}
