package com.spotify.music.nowplaying.podcastads.cta;

import com.google.common.base.MoreObjects;
import com.spotify.music.navigation.t;
import com.spotify.music.nowplaying.podcastads.cta.e;
import com.spotify.player.model.ContextTrack;
import com.spotify.rxjava2.p;
import io.reactivex.g;

public class c implements e.a {
    private final t a;
    private final g<ContextTrack> b;
    private final p c = new p();
    private String d;

    public c(g<ContextTrack> gVar, t tVar) {
        this.a = tVar;
        this.b = gVar;
    }

    public static void a(c cVar, ContextTrack contextTrack) {
        cVar.getClass();
        cVar.d = contextTrack.metadata().get("click_url");
    }

    public void b() {
        if (!MoreObjects.isNullOrEmpty(this.d)) {
            this.a.d(this.d);
        }
    }

    public void c(e eVar) {
        eVar.getClass();
        eVar.setListener(this);
        this.c.b(this.b.subscribe(new b(this)));
    }

    public void d() {
        this.c.a();
    }
}
