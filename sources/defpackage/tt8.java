package defpackage;

/* renamed from: tt8  reason: default package */
public final class tt8 {
    private final wlf<jt8> a;
    private final wlf<e61> b;

    public tt8(wlf<jt8> wlf, wlf<e61> wlf2) {
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

    public st8 b(b91 b91) {
        jt8 jt8 = this.a.get();
        a(jt8, 1);
        e61 e61 = this.b.get();
        a(e61, 2);
        a(b91, 3);
        return new st8(jt8, e61, b91);
    }
}
