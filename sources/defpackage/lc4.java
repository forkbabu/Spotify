package defpackage;

import io.reactivex.k;
import io.reactivex.y;

/* renamed from: lc4  reason: default package */
public final class lc4 {
    private final wlf<hf4> a;
    private final wlf<dc4> b;
    private final wlf<k<b91, String>> c;
    private final wlf<bj9> d;
    private final wlf<y> e;
    private final wlf<efa> f;

    public lc4(wlf<hf4> wlf, wlf<dc4> wlf2, wlf<k<b91, String>> wlf3, wlf<bj9> wlf4, wlf<y> wlf5, wlf<efa> wlf6) {
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
        a(wlf6, 6);
        this.f = wlf6;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public kc4 b(b61 b61) {
        hf4 hf4 = this.a.get();
        a(hf4, 1);
        hf4 hf42 = hf4;
        dc4 dc4 = this.b.get();
        a(dc4, 2);
        dc4 dc42 = dc4;
        k<b91, String> kVar = this.c.get();
        a(kVar, 3);
        k<b91, String> kVar2 = kVar;
        bj9 bj9 = this.d.get();
        a(bj9, 4);
        bj9 bj92 = bj9;
        y yVar = this.e.get();
        a(yVar, 5);
        y yVar2 = yVar;
        efa efa = this.f.get();
        a(efa, 6);
        a(b61, 7);
        return new kc4(hf42, dc42, kVar2, bj92, yVar2, efa, b61);
    }
}
