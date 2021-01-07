package com.spotify.music.features.podcast.episode;

public final class p0 {
    private final wlf<nc7> a;

    public p0(wlf<nc7> wlf) {
        if (wlf != null) {
            this.a = wlf;
            return;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", 1));
    }
}
