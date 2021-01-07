package defpackage;

import defpackage.ov9;

/* renamed from: mv9  reason: default package */
public final class mv9 implements fjf<lv9> {
    private final wlf<qf0> a;
    private final wlf<ov9.a> b;

    public mv9(wlf<qf0> wlf, wlf<ov9.a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lv9(this.a.get(), this.b.get());
    }
}
