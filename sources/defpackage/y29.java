package defpackage;

/* renamed from: y29  reason: default package */
public class y29 {
    private final wlf<w59> a;
    private final wlf<u59> b;
    private final wlf<c69> c;
    private final wlf<y59> d;

    public y29(wlf<w59> wlf, wlf<u59> wlf2, wlf<c69> wlf3, wlf<y59> wlf4) {
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

    public x29 b(wc9 wc9) {
        w59 w59 = this.a.get();
        a(w59, 1);
        w59 w592 = w59;
        u59 u59 = this.b.get();
        a(u59, 2);
        u59 u592 = u59;
        c69 c69 = this.c.get();
        a(c69, 3);
        c69 c692 = c69;
        y59 y59 = this.d.get();
        a(y59, 4);
        a(wc9, 5);
        return new x29(w592, u592, c692, y59, wc9);
    }
}
