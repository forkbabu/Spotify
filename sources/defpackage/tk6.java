package defpackage;

import defpackage.km6;
import defpackage.rl6;
import defpackage.zo6;
import defpackage.zt6;

/* renamed from: tk6  reason: default package */
public class tk6 implements zo6.c {
    private final wlf<ok6> a;
    private final wlf<zt6.a> b;
    private final wlf<km6.a> c;
    private final wlf<rl6.a> d;

    public tk6(wlf<ok6> wlf, wlf<zt6.a> wlf2, wlf<km6.a> wlf3, wlf<rl6.a> wlf4) {
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
        ok6 ok6 = this.a.get();
        a(ok6, 1);
        zt6.a aVar = this.b.get();
        a(aVar, 2);
        km6.a aVar2 = this.c.get();
        a(aVar2, 3);
        rl6.a aVar3 = this.d.get();
        a(aVar3, 4);
        return new qk6(ok6, aVar, aVar2, aVar3);
    }
}
