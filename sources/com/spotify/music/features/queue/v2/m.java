package com.spotify.music.features.queue.v2;

import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.PlayerState;
import com.spotify.player.queue.f;
import io.reactivex.g;
import io.reactivex.s;

public final class m {
    private final wlf<f> a;
    private final wlf<QueueViews> b;
    private final wlf<cqe> c;
    private final wlf<g<PlayerState>> d;

    public m(wlf<f> wlf, wlf<QueueViews> wlf2, wlf<cqe> wlf3, wlf<g<PlayerState>> wlf4) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public l b(s<PlayerQueue> sVar) {
        a(sVar, 1);
        s<PlayerQueue> sVar2 = sVar;
        f fVar = this.a.get();
        a(fVar, 2);
        f fVar2 = fVar;
        QueueViews queueViews = this.b.get();
        a(queueViews, 3);
        QueueViews queueViews2 = queueViews;
        cqe cqe = this.c.get();
        a(cqe, 4);
        cqe cqe2 = cqe;
        g<PlayerState> gVar = this.d.get();
        a(gVar, 5);
        return new l(sVar2, fVar2, queueViews2, cqe2, gVar);
    }
}
