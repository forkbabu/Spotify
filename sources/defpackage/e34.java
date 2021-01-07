package defpackage;

import io.reactivex.s;

/* renamed from: e34  reason: default package */
public class e34 {
    private final wlf<p34> a;
    private final wlf<j34> b;

    public e34(wlf<p34> wlf, wlf<j34> wlf2) {
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

    public d34 b(s<b91> sVar) {
        p34 p34 = this.a.get();
        a(p34, 1);
        j34 j34 = this.b.get();
        a(j34, 2);
        a(sVar, 3);
        return new d34(p34, j34, sVar);
    }
}
