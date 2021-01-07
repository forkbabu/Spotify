package defpackage;

import io.reactivex.l;

/* renamed from: dh2  reason: default package */
public final class dh2 implements fjf<ch2> {
    private final wlf<ekd> a;
    private final wlf<l<String>> b;

    public dh2(wlf<ekd> wlf, wlf<l<String>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ch2(this.a.get(), this.b.get());
    }
}
