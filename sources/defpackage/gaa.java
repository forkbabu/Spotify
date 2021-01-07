package defpackage;

/* renamed from: gaa  reason: default package */
public final class gaa {
    private final wlf<wh0> a;
    private final wlf<xh0> b;

    public gaa(wlf<wh0> wlf, wlf<xh0> wlf2) {
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

    public faa b() {
        wh0 wh0 = this.a.get();
        a(wh0, 1);
        xh0 xh0 = this.b.get();
        a(xh0, 2);
        return new faa(wh0, xh0);
    }
}
