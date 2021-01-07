package defpackage;

import android.content.Context;

/* renamed from: bpa  reason: default package */
public final class bpa implements fjf<apa> {
    private final wlf<Context> a;

    public bpa(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new apa(this.a.get());
    }
}
