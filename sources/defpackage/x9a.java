package defpackage;

/* renamed from: x9a  reason: default package */
public final class x9a {
    private final wlf<xg0> a;

    public x9a(wlf<xg0> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public w9a b(String str) {
        a(str, 1);
        xg0 xg0 = this.a.get();
        a(xg0, 2);
        return new w9a(str, xg0);
    }
}
