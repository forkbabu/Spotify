package defpackage;

import defpackage.uy5;
import java.util.List;

/* renamed from: nz5  reason: default package */
public final class nz5 implements fjf<mz5> {
    private final wlf<List<uy5.a>> a;

    public nz5(wlf<List<uy5.a>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mz5(this.a.get());
    }
}
