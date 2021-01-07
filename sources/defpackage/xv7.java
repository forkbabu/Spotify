package defpackage;

import com.google.protobuf.u;

/* renamed from: xv7  reason: default package */
public final class xv7 implements fjf<wv7> {
    private final wlf<cqe> a;
    private final wlf<gl0<u>> b;

    public xv7(wlf<cqe> wlf, wlf<gl0<u>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wv7(this.a.get(), this.b.get());
    }
}
