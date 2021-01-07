package defpackage;

import com.google.protobuf.u;

/* renamed from: e25  reason: default package */
public final class e25 implements fjf<d25> {
    private final wlf<ere> a;
    private final wlf<gl0<u>> b;

    public e25(wlf<ere> wlf, wlf<gl0<u>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d25(this.a.get(), this.b.get());
    }
}
