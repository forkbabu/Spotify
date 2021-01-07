package defpackage;

/* renamed from: q9a  reason: default package */
public class q9a {
    private final wlf<p8a> a;

    public q9a(wlf<p8a> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public p9a b(String str) {
        a(str, 1);
        p8a p8a = this.a.get();
        a(p8a, 2);
        return new p9a(str, p8a);
    }
}
