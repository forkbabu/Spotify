package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: ka8  reason: default package */
public final class ka8 {
    private final wlf<ere> a;
    private final wlf<jz1> b;
    private final wlf<ifd> c;
    private final wlf<c.a> d;
    private final wlf<cqe> e;

    public ka8(wlf<ere> wlf, wlf<jz1> wlf2, wlf<ifd> wlf3, wlf<c.a> wlf4, wlf<cqe> wlf5) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public ja8 b(nqe nqe) {
        ere ere = this.a.get();
        a(ere, 1);
        ere ere2 = ere;
        jz1 jz1 = this.b.get();
        a(jz1, 2);
        jz1 jz12 = jz1;
        ifd ifd = this.c.get();
        a(ifd, 3);
        ifd ifd2 = ifd;
        c.a aVar = this.d.get();
        a(aVar, 4);
        c.a aVar2 = aVar;
        cqe cqe = this.e.get();
        a(cqe, 5);
        a(nqe, 6);
        return new ja8(ere2, jz12, ifd2, aVar2, cqe, nqe);
    }
}
