package defpackage;

import com.google.protobuf.u;

/* renamed from: s2a  reason: default package */
public final class s2a implements fjf<r2a> {
    private final wlf<gl0<u>> a;
    private final wlf<t2a> b;

    public s2a(wlf<gl0<u>> wlf, wlf<t2a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r2a(this.a.get(), this.b.get());
    }
}
