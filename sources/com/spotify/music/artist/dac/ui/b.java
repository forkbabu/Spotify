package com.spotify.music.artist.dac.ui;

import com.spotify.dac.api.proto.DacResponse;

public final class b {
    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public a b(DacResponse dacResponse, s80 s80) {
        a(dacResponse, 1);
        a(s80, 2);
        return new a(dacResponse, s80);
    }
}
