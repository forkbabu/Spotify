package com.spotify.music.nowplaying.musicvideotoggle.widget.previousbutton;

import com.spotify.music.nowplaying.musicvideotoggle.widget.e;
import com.spotify.nowplaying.ui.components.controls.previous.g;
import com.spotify.player.model.Restrictions;
import com.spotify.rxjava2.q;

public final class d implements g.a {
    private final io.reactivex.g<Restrictions> a;
    private final io.reactivex.g<String> b;
    private final com.spotify.nowplaying.ui.components.controls.previous.d c;
    private final q d = new q();
    private final e e;
    private String f;
    private g g;

    public d(io.reactivex.g<Restrictions> gVar, io.reactivex.g<String> gVar2, com.spotify.nowplaying.ui.components.controls.previous.d dVar, e eVar) {
        this.a = gVar;
        this.b = gVar2;
        this.c = dVar;
        this.e = eVar;
    }

    public static void b(d dVar, Restrictions restrictions) {
        dVar.getClass();
        dVar.g.setPreviousEnabled(restrictions.disallowSkippingPrevReasons().isEmpty() || restrictions.disallowSeekingReasons().isEmpty());
    }

    public static void c(d dVar, String str) {
        dVar.f = str;
    }

    @Override // com.spotify.nowplaying.ui.components.controls.previous.g.a
    public void a() {
        this.c.o(this.f);
        this.e.a(false);
    }

    public void d(g gVar) {
        gVar.getClass();
        this.g = gVar;
        gVar.setListener(this);
        this.e.c();
        this.d.a(this.a.subscribe(new b(this)));
        this.d.a(this.b.subscribe(new c(this)));
    }

    public void e() {
        this.g.setListener(null);
        this.e.clear();
        this.d.c();
    }
}
