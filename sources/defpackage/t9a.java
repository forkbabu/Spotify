package defpackage;

/* renamed from: t9a  reason: default package */
public class t9a {
    private final wlf<p8a> a;

    public t9a(wlf<p8a> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public s9a b() {
        p8a p8a = this.a.get();
        a(p8a, 1);
        return new s9a(p8a);
    }
}
