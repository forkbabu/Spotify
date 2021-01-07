package defpackage;

import io.reactivex.g;

/* renamed from: c4b  reason: default package */
public class c4b {
    private final wlf<g<y6b>> a;

    public c4b(wlf<g<y6b>> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public b4b b(g<y6b> gVar) {
        g<y6b> gVar2 = this.a.get();
        a(gVar2, 1);
        a(gVar, 2);
        return new b4b(gVar2, gVar);
    }
}
