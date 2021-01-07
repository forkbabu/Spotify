package defpackage;

import com.spotify.ubi.specification.factories.v;

/* renamed from: z98  reason: default package */
public final class z98 {
    private final wlf<ere> a;

    public z98(wlf<ere> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public y98 b(v.c.b bVar) {
        ere ere = this.a.get();
        a(ere, 1);
        a(bVar, 2);
        return new y98(ere, bVar);
    }
}
