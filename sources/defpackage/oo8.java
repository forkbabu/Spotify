package defpackage;

import android.content.res.Resources;

/* renamed from: oo8  reason: default package */
public final class oo8 implements fjf<no8> {
    private final wlf<Resources> a;

    public oo8(wlf<Resources> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new no8(this.a.get());
    }
}
