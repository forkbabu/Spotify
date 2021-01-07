package defpackage;

import android.content.res.Resources;

/* renamed from: ej4  reason: default package */
public final class ej4 implements fjf<dj4> {
    private final wlf<Resources> a;

    public ej4(wlf<Resources> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dj4(this.a.get());
    }
}
