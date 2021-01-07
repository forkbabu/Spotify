package com.spotify.music.nowplaying.common.view.canvas.artist;

import com.google.common.base.Optional;
import com.spotify.music.canvas.model.b;
import com.spotify.music.navigation.t;
import com.spotify.music.nowplaying.common.view.canvas.artist.j;
import com.spotify.player.model.ContextTrack;
import io.reactivex.disposables.a;
import io.reactivex.g;

public class h implements j.a {
    private final g<ContextTrack> a;
    private final g<eqd> b;
    private final vl2 c;
    private final t d;
    private final pl2 e;
    private final a f = new a();
    private Optional<b> g = Optional.absent();
    private j h;

    public h(g<ContextTrack> gVar, g<eqd> gVar2, vl2 vl2, pl2 pl2, t tVar) {
        this.a = gVar;
        this.b = gVar2;
        vl2.getClass();
        this.c = vl2;
        pl2.getClass();
        this.e = pl2;
        tVar.getClass();
        this.d = tVar;
    }

    public static void a(h hVar, eqd eqd) {
        hVar.h.setInsetBottom(eqd.a());
    }

    public static void b(h hVar, ContextTrack contextTrack) {
        Optional<b> optional;
        if (hVar.c.a(contextTrack)) {
            optional = Optional.fromNullable(hVar.e.a(contextTrack));
        } else {
            optional = Optional.absent();
        }
        hVar.g = optional;
        if (optional.isPresent()) {
            hVar.h.setName(hVar.g.get().b());
            hVar.h.setAvatar(hVar.g.get().a());
        }
    }

    public static void c(h hVar, boolean z) {
        if (z) {
            hVar.h.b();
        } else if (hVar.g.isPresent()) {
            hVar.h.a();
        } else {
            hVar.h.b();
        }
    }

    public void d() {
        if (this.g.isPresent()) {
            this.d.d(this.g.get().c());
        }
    }

    public void e(j jVar, g<Boolean> gVar) {
        jVar.getClass();
        this.h = jVar;
        jVar.setListener(this);
        this.f.b(this.a.subscribe(new b(this)));
        this.f.b(this.b.subscribe(new a(this)));
        this.f.b(gVar.subscribe(new c(this)));
    }

    public void f() {
        this.f.f();
    }
}
