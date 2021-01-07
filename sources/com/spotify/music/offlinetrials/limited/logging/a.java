package com.spotify.music.offlinetrials.limited.logging;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.offlinetrials.limited.logging.OfflineUserMixImpressionLogger;

public class a implements OfflineUserMixImpressionLogger.a {
    private final wlf<jz1> a;
    private final wlf<cqe> b;

    public a(wlf<jz1> wlf, wlf<cqe> wlf2) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.offlinetrials.limited.logging.OfflineUserMixImpressionLogger.a
    public OfflineUserMixImpressionLogger a(c cVar, com.spotify.instrumentation.a aVar) {
        jz1 jz1 = this.a.get();
        b(jz1, 1);
        cqe cqe = this.b.get();
        b(cqe, 2);
        b(cVar, 3);
        b(aVar, 4);
        return new OfflineUserMixImpressionLogger(jz1, cqe, cVar, aVar);
    }
}
