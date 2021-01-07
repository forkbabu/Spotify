package defpackage;

import android.content.Context;

/* renamed from: xnd  reason: default package */
public final class xnd implements fjf<wnd> {
    private final wlf<Context> a;

    public xnd(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wnd(this.a.get());
    }
}
