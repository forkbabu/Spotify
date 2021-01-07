package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: br2  reason: default package */
public final class br2 implements fjf<pf5> {
    private final wlf<Boolean> a;
    private final wlf<sk5> b;
    private final wlf<dk5> c;

    public br2(wlf<Boolean> wlf, wlf<sk5> wlf2, wlf<dk5> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        String str;
        pf5 pf5;
        boolean booleanValue = this.a.get().booleanValue();
        wlf<sk5> wlf = this.b;
        wlf<dk5> wlf2 = this.c;
        h.e(wlf, "premiumDataSource");
        h.e(wlf2, "freeDataSource");
        if (booleanValue) {
            pf5 = wlf2.get();
            str = "freeDataSource.get()";
        } else {
            pf5 = wlf.get();
            str = "premiumDataSource.get()";
        }
        h.d(pf5, str);
        return pf5;
    }
}
