package defpackage;

import defpackage.y22;

/* renamed from: v22  reason: default package */
public final class v22 implements fjf<u22> {
    private final wlf<y22.a> a;
    private final wlf<w22> b;

    public v22(wlf<y22.a> wlf, wlf<w22> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u22(this.a.get(), this.b.get());
    }
}
