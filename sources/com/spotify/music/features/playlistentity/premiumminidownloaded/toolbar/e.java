package com.spotify.music.features.playlistentity.premiumminidownloaded.toolbar;

public final class e {
    private final wlf<a> a;
    private final wlf<PremiumMiniRemoveAllSongsItem> b;

    public e(wlf<a> wlf, wlf<PremiumMiniRemoveAllSongsItem> wlf2) {
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

    public d b() {
        a aVar = this.a.get();
        a(aVar, 1);
        PremiumMiniRemoveAllSongsItem premiumMiniRemoveAllSongsItem = this.b.get();
        a(premiumMiniRemoveAllSongsItem, 2);
        return new d(aVar, premiumMiniRemoveAllSongsItem);
    }
}
