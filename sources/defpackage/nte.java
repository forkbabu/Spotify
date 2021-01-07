package defpackage;

import com.google.protobuf.u;

/* renamed from: nte  reason: default package */
public final class nte implements fjf<mte> {
    private final wlf<gl0<u>> a;

    public nte(wlf<gl0<u>> wlf) {
        this.a = wlf;
    }

    public static mte a(gl0<u> gl0) {
        return new mte(gl0);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mte(this.a.get());
    }
}
