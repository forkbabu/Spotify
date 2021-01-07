package defpackage;

import com.google.protobuf.u;

/* renamed from: zqe  reason: default package */
public final class zqe implements fjf<dre> {
    private final wlf<gl0<u>> a;
    private final wlf<bre> b;
    private final wlf<yqe> c;

    public zqe(wlf<gl0<u>> wlf, wlf<bre> wlf2, wlf<yqe> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vqe(this.a.get(), this.b.get(), this.c.get());
    }
}
