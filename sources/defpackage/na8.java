package defpackage;

import com.spotify.ubi.specification.factories.q3;

/* renamed from: na8  reason: default package */
public final class na8 {
    private final wlf<ere> a;

    public na8(wlf<ere> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public ma8 b(q3.c.b bVar) {
        ere ere = this.a.get();
        a(ere, 1);
        a(bVar, 2);
        return new ma8(ere, bVar);
    }
}
