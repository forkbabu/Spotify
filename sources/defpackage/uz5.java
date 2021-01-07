package defpackage;

import defpackage.qy5;

/* renamed from: uz5  reason: default package */
public final class uz5 implements fjf<tz5> {
    private final wlf<bz5> a;
    private final wlf<qy5.a> b;

    public uz5(wlf<bz5> wlf, wlf<qy5.a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tz5(this.a.get(), this.b.get());
    }
}
