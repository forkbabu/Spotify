package defpackage;

import io.reactivex.g;

/* renamed from: a6c  reason: default package */
public final class a6c implements fjf<g<Boolean>> {
    private final wlf<i6c> a;

    public a6c(wlf<i6c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().a();
    }
}
