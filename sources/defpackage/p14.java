package defpackage;

import io.reactivex.s;

/* renamed from: p14  reason: default package */
public class p14 {
    private final wlf<r34> a;

    public p14(wlf<r34> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public o14 b(s<com.spotify.music.libs.assistedcuration.presenter.s> sVar) {
        r34 r34 = this.a.get();
        a(r34, 1);
        a(sVar, 2);
        return new o14(r34, sVar);
    }
}
