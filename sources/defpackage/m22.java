package defpackage;

import defpackage.p22;

/* renamed from: m22  reason: default package */
public final class m22 implements fjf<l22> {
    private final wlf<p22.a> a;
    private final wlf<n22> b;

    public m22(wlf<p22.a> wlf, wlf<n22> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l22(this.a.get(), this.b.get());
    }
}
