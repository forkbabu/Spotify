package com.spotify.music.features.podcast.episode.datasource;

import com.google.common.base.Optional;
import com.spotify.music.features.podcast.episode.datasource.z;
import io.reactivex.functions.j;

public final /* synthetic */ class k implements j {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // io.reactivex.functions.j
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        z zVar = (z) obj;
        x xVar = (x) obj2;
        y87 y87 = (y87) obj3;
        qe7 qe7 = (qe7) obj4;
        f27 f27 = (f27) obj5;
        zVar.getClass();
        return zVar instanceof z.c ? new z.c(((z.c) zVar).c(), (Optional) xVar.a(p.a, j.a, i.a), (Optional) y87.c(o.a, q.a, n.a), (Optional) qe7.c(c.a, r.a, m.a), (Optional) f27.c(g.a, h.a, f.a)) : zVar;
    }
}
