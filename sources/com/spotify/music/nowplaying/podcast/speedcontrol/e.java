package com.spotify.music.nowplaying.podcast.speedcontrol;

import com.google.common.base.MoreObjects;
import com.spotify.music.nowplaying.podcast.speedcontrol.g;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import com.spotify.player.model.ContextTrack;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.y;

public final class e implements g.a {
    private final io.reactivex.g<ContextTrack> a;
    private final s<Integer> b;
    private final c2c c;
    private final e2c d;
    private final d e;
    private final q f = new q();
    private g g;
    private ContextTrack h = ContextTrack.create("");

    public e(io.reactivex.g<ContextTrack> gVar, SpeedControlInteractor speedControlInteractor, c2c c2c, e2c e2c, d dVar, y yVar) {
        this.a = gVar;
        this.b = speedControlInteractor.c().o0(yVar);
        this.c = c2c;
        this.d = e2c;
        this.e = dVar;
    }

    public static void c(e eVar, int i) {
        boolean z = true;
        if (eVar.d.a(i) != null) {
            eVar.g.setSpeed(eVar.d.a(i));
            g gVar = eVar.g;
            if (i == 100) {
                z = false;
            }
            gVar.setActive(z);
            return;
        }
        eVar.g.setSpeed(eVar.d.a(100));
        eVar.g.setActive(false);
    }

    public static void d(e eVar, ContextTrack contextTrack) {
        eVar.h = contextTrack;
    }

    @Override // com.spotify.music.nowplaying.podcast.speedcontrol.g.a
    public void a() {
        this.e.p(this.h.uri());
        this.c.b(this.h.uri(), MoreObjects.nullToEmpty(this.h.metadata().get("title")));
    }

    public void e(g gVar) {
        this.g = gVar;
        gVar.setListener(this);
        this.f.a(this.b.subscribe(new b(this)));
        this.f.a(this.a.subscribe(new c(this)));
    }

    public void f() {
        this.f.c();
    }
}
