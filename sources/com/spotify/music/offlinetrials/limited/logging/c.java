package com.spotify.music.offlinetrials.limited.logging;

import com.spotify.instrumentation.a;

public class c {
    private final wlf<jz1> a;
    private final wlf<cqe> b;

    public c(wlf<jz1> wlf, wlf<cqe> wlf2) {
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

    public OfflineUserMixInteractionLogger b(com.spotify.music.libs.viewuri.c cVar, a aVar) {
        jz1 jz1 = this.a.get();
        a(jz1, 1);
        cqe cqe = this.b.get();
        a(cqe, 2);
        a(cVar, 3);
        a(aVar, 4);
        return new OfflineUserMixInteractionLogger(jz1, cqe, cVar, aVar);
    }
}
