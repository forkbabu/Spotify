package defpackage;

import android.content.Context;

/* renamed from: it6  reason: default package */
public final class it6 implements fjf<Integer> {
    private final wlf<Context> a;

    public it6(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Integer.valueOf(nud.g(75.0f, this.a.get().getResources()));
    }
}
