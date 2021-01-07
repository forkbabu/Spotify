package defpackage;

import android.content.res.Resources;

/* renamed from: k7c  reason: default package */
public final class k7c implements fjf<j7c> {
    private final wlf<Resources> a;

    public k7c(wlf<Resources> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j7c(this.a.get());
    }
}
