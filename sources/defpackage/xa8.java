package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: xa8  reason: default package */
public final class xa8 {
    private final wlf<ere> a;
    private final wlf<jz1> b;
    private final wlf<c.a> c;
    private final wlf<cqe> d;

    public xa8(wlf<ere> wlf, wlf<jz1> wlf2, wlf<c.a> wlf3, wlf<cqe> wlf4) {
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

    public wa8 b(nqe nqe) {
        ere ere = this.a.get();
        a(ere, 1);
        ere ere2 = ere;
        jz1 jz1 = this.b.get();
        a(jz1, 2);
        jz1 jz12 = jz1;
        c.a aVar = this.c.get();
        a(aVar, 3);
        c.a aVar2 = aVar;
        cqe cqe = this.d.get();
        a(cqe, 4);
        a(nqe, 5);
        return new wa8(ere2, jz12, aVar2, cqe, nqe);
    }
}
