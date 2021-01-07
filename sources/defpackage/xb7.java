package defpackage;

import defpackage.kqc;
import defpackage.oqc;
import defpackage.rqc;
import defpackage.vb7;

/* renamed from: xb7  reason: default package */
public final class xb7 implements fjf<wb7> {
    private final wlf<vb7.a> a;
    private final wlf<kqc.a> b;
    private final wlf<rqc.a> c;
    private final wlf<oqc.a> d;
    private final wlf<eoa> e;

    public xb7(wlf<vb7.a> wlf, wlf<kqc.a> wlf2, wlf<rqc.a> wlf3, wlf<oqc.a> wlf4, wlf<eoa> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wb7(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
