package com.spotify.music.nowplaying.common.view.queue;

import com.spotify.music.nowplaying.common.view.queue.e;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import io.reactivex.g;

public class c implements e.a {
    private final g<PlayerState> a;
    private final nsb b;
    private final crd c;
    private final p d = new p();
    private e e;

    public c(g<PlayerState> gVar, nsb nsb, crd crd) {
        this.a = gVar;
        this.b = nsb;
        this.c = crd;
    }

    public static void a(c cVar, PlayerState playerState) {
        cVar.e.setQueueEnabled(!(agd.i(playerState.contextUri()) || agd.h(playerState.contextUri())));
    }

    public void b() {
        this.c.w();
        this.b.c();
    }

    public void c(e eVar) {
        eVar.getClass();
        this.e = eVar;
        eVar.setListener(this);
        this.d.b(this.a.subscribe(new b(this)));
    }

    public void d() {
        this.e.setListener(null);
        this.d.a();
    }
}
