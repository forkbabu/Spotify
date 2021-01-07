package defpackage;

import defpackage.l32;

/* renamed from: i32  reason: default package */
public final class i32 implements fjf<h32> {
    private final wlf<l32.a> a;
    private final wlf<j32> b;

    public i32(wlf<l32.a> wlf, wlf<j32> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h32(this.a.get(), this.b.get());
    }
}
