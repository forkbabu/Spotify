package com.spotify.music.spotlets.offline.util;

import com.google.protobuf.u;
import com.spotify.music.libs.viewuri.c;

public class e {
    private final wlf<gl0<u>> a;

    public e(wlf<gl0<u>> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public OffliningLogger b(c cVar) {
        gl0<u> gl0 = this.a.get();
        a(gl0, 1);
        a(cVar, 2);
        return new OffliningLogger(gl0, cVar);
    }
}
