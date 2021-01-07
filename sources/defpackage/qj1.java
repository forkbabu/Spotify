package defpackage;

import io.reactivex.s;

/* renamed from: qj1  reason: default package */
public final class qj1<T> implements fjf<pj1<T>> {
    private final wlf<s<String>> a;

    public qj1(wlf<s<String>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pj1(this.a.get());
    }
}
