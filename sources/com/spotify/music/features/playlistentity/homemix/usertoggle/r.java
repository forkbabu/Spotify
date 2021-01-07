package com.spotify.music.features.playlistentity.homemix.usertoggle;

public final class r {
    private final wlf<n> a;

    public r(wlf<n> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public q b(k kVar) {
        n nVar = this.a.get();
        a(nVar, 1);
        a(kVar, 2);
        return new q(nVar, kVar);
    }
}
