package defpackage;

/* renamed from: aaa  reason: default package */
public class aaa {
    private final wlf<xg0> a;

    public aaa(wlf<xg0> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public z9a b() {
        xg0 xg0 = this.a.get();
        a(xg0, 1);
        return new z9a(xg0);
    }
}
