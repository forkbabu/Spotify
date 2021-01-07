package com.spotify.music.features.carmode.optin;

/* access modifiers changed from: package-private */
public class q {
    private final wlf<ere> a;

    q(wlf<ere> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    /* access modifiers changed from: package-private */
    public p b(j jVar) {
        ere ere = this.a.get();
        a(ere, 1);
        a(jVar, 2);
        return new p(ere, jVar);
    }
}
