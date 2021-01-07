package com.spotify.nowplaying.container;

import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import defpackage.cqd;
import io.reactivex.g;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class b {
    private final p a = new p();
    private cqd b;
    private cqd.a c;
    private final g<PlayerState> d;
    private final NowPlayingModeTransformer e;
    private final y f;
    private final y g;

    public b(g<PlayerState> gVar, NowPlayingModeTransformer nowPlayingModeTransformer, y yVar, y yVar2) {
        h.e(gVar, "playerStateFlowable");
        h.e(nowPlayingModeTransformer, "nowPlayingModeTransformer");
        h.e(yVar, "computationScheduler");
        h.e(yVar2, "mainScheduler");
        this.d = gVar;
        this.e = nowPlayingModeTransformer;
        this.f = yVar;
        this.g = yVar2;
    }

    public static final void a(b bVar, c cVar, cqd cqd) {
        cqd cqd2 = bVar.b;
        if (!h.a(cqd2 != null ? cqd2.name() : null, cqd.name())) {
            cqd.a aVar = bVar.c;
            if (aVar != null) {
                aVar.stop();
            }
            bVar.b = cqd;
            cqd.a invoke = cqd.b().invoke();
            cVar.a(invoke);
            invoke.start();
            bVar.c = invoke;
        }
    }

    public final void b(c cVar) {
        h.e(cVar, "viewBinder");
        cqd.a aVar = this.c;
        if (aVar != null) {
            aVar.start();
        }
        this.a.b(this.d.l(this.e).e0(this.f).Q(this.g).subscribe(new a(this, cVar)));
    }

    public final void c() {
        this.a.a();
        cqd.a aVar = this.c;
        if (aVar != null) {
            aVar.stop();
        }
    }
}
