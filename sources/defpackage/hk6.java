package defpackage;

import defpackage.zo6;
import defpackage.zt6;

/* renamed from: hk6  reason: default package */
public class hk6 implements zo6.c {
    private final wlf<ck6> a;
    private final wlf<zt6.a> b;

    public hk6(wlf<ck6> wlf, wlf<zt6.a> wlf2) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.zo6.c
    public zo6 create() {
        ck6 ck6 = this.a.get();
        a(ck6, 1);
        zt6.a aVar = this.b.get();
        a(aVar, 2);
        return new ek6(ck6, aVar);
    }
}
