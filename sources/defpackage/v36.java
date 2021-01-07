package defpackage;

import defpackage.ja6;
import defpackage.zo6;
import defpackage.zt6;

/* renamed from: v36  reason: default package */
public class v36 implements zo6.c {
    private final wlf<x36> a;
    private final wlf<zt6.a> b;
    private final wlf<ja6.a> c;
    private final wlf<ei6> d;

    public v36(wlf<x36> wlf, wlf<zt6.a> wlf2, wlf<ja6.a> wlf3, wlf<ei6> wlf4) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.zo6.c
    public zo6 create() {
        x36 x36 = this.a.get();
        a(x36, 1);
        zt6.a aVar = this.b.get();
        a(aVar, 2);
        ja6.a aVar2 = this.c.get();
        a(aVar2, 3);
        ei6 ei6 = this.d.get();
        a(ei6, 4);
        return new s36(x36, aVar, aVar2, ei6);
    }
}
