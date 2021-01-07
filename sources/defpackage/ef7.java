package defpackage;

import android.content.res.Resources;

/* renamed from: ef7  reason: default package */
public final class ef7 implements fjf<df7> {
    private final wlf<Resources> a;

    public ef7(wlf<Resources> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new df7(this.a.get());
    }
}
