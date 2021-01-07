package com.spotify.nowplaying.ui.components.controls.previous;

import com.spotify.nowplaying.ui.components.controls.previous.g;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import com.spotify.rxjava2.q;

public final class e implements g.a {
    private final d a;
    private final io.reactivex.g<Restrictions> b;
    private final io.reactivex.g<String> c;
    private final d d;
    private final q e = new q();
    private String f;
    private g g;

    public e(d dVar, io.reactivex.g<Restrictions> gVar, io.reactivex.g<String> gVar2, d dVar2) {
        this.a = dVar;
        this.b = gVar;
        this.c = gVar2;
        this.d = dVar2;
    }

    public static void b(e eVar, Restrictions restrictions) {
        eVar.getClass();
        eVar.g.setPreviousEnabled(restrictions.disallowSkippingPrevReasons().isEmpty() || restrictions.disallowSeekingReasons().isEmpty());
    }

    public static void c(e eVar, String str) {
        eVar.f = str;
    }

    @Override // com.spotify.nowplaying.ui.components.controls.previous.g.a
    public void a() {
        this.d.o(this.f);
        this.e.a(this.a.a(c.l(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build())).subscribe());
    }

    public void d(g gVar) {
        gVar.getClass();
        this.g = gVar;
        gVar.setListener(this);
        this.e.a(this.b.subscribe(new b(this)));
        this.e.a(this.c.subscribe(new c(this)));
    }

    public void e() {
        this.g.setListener(null);
        this.e.c();
    }
}
