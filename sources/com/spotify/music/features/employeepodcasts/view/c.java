package com.spotify.music.features.employeepodcasts.view;

public final class c {
    private final wlf<com.spotify.http.contentaccesstoken.c> a;

    public c(wlf<com.spotify.http.contentaccesstoken.c> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public b b(d dVar) {
        com.spotify.http.contentaccesstoken.c cVar = this.a.get();
        a(cVar, 1);
        a(dVar, 2);
        return new b(cVar, dVar);
    }
}
