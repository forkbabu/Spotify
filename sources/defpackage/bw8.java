package defpackage;

import defpackage.v62;

/* renamed from: bw8  reason: default package */
public final class bw8 implements fjf<aw8> {
    private final wlf<v62.a> a;

    public bw8(wlf<v62.a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new aw8(this.a.get());
    }
}
