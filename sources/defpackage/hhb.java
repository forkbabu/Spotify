package defpackage;

import java.util.List;

/* renamed from: hhb  reason: default package */
public final class hhb {
    private final wlf<uib> a;
    private final wlf<rib> b;
    private final wlf<kib> c;
    private final wlf<xib> d;
    private final wlf<oib> e;

    public hhb(wlf<uib> wlf, wlf<rib> wlf2, wlf<kib> wlf3, wlf<xib> wlf4, wlf<oib> wlf5) {
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

    public ghb b(List<? extends s81> list, String str) {
        a(list, 1);
        a(str, 2);
        uib uib = this.a.get();
        a(uib, 3);
        uib uib2 = uib;
        rib rib = this.b.get();
        a(rib, 4);
        rib rib2 = rib;
        kib kib = this.c.get();
        a(kib, 5);
        kib kib2 = kib;
        xib xib = this.d.get();
        a(xib, 6);
        xib xib2 = xib;
        oib oib = this.e.get();
        a(oib, 7);
        return new ghb(list, str, uib2, rib2, kib2, xib2, oib);
    }
}
