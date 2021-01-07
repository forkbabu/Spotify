package com.spotify.music.newplaying.scroll.widgets.example;

import com.spotify.music.newplaying.scroll.widgets.example.h;
import com.spotify.player.model.ContextTrack;
import io.reactivex.disposables.a;
import io.reactivex.g;

public class f implements h.a {
    private final g<ContextTrack> a;
    private final a b = new a();
    private h c;

    public f(g<ContextTrack> gVar) {
        this.a = gVar;
    }

    public static void b(f fVar, ContextTrack contextTrack) {
        fVar.c.setTrackCover(kxd.c(contextTrack));
        fVar.c.setTrackTitle(contextTrack.metadata().get("title"));
        fVar.c.setArtistName(kxd.a(contextTrack));
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.example.h.a
    public void a() {
    }

    public void c(h hVar) {
        hVar.getClass();
        this.c = hVar;
        hVar.setListener(this);
        this.b.b(this.a.subscribe(new a(this)));
    }

    public void d() {
        this.b.f();
    }
}
