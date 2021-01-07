package com.spotify.http;

public final class g {
    private final wlf<w> a;

    public g(wlf<w> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public f b(String str) {
        w wVar = this.a.get();
        a(wVar, 1);
        a(str, 2);
        return new f(wVar, str);
    }
}
