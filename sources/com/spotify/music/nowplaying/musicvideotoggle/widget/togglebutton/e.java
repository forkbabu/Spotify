package com.spotify.music.nowplaying.musicvideotoggle.widget.togglebutton;

import com.spotify.music.nowplaying.musicvideotoggle.widget.togglebutton.g;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;

public class e implements g.a {
    private final com.spotify.music.nowplaying.musicvideotoggle.widget.e a;
    private final com.spotify.music.nowplaying.musicvideotoggle.widget.g b;
    private final io.reactivex.g<PlayerState> c;
    private final nzb d;
    private g e;
    private final q f = new q();
    private PlayerState g;
    private boolean h;

    public e(com.spotify.music.nowplaying.musicvideotoggle.widget.e eVar, nzb nzb, io.reactivex.g<PlayerState> gVar, com.spotify.music.nowplaying.musicvideotoggle.widget.g gVar2) {
        this.a = eVar;
        this.c = gVar;
        this.b = gVar2;
        this.d = nzb;
    }

    public static void a(e eVar, PlayerState playerState) {
        if (eVar.h && playerState.playbackId().isPresent() && playerState.track().isPresent()) {
            eVar.d.c(playerState.playbackId().get(), playerState.track().get().uri());
        }
        eVar.h = true;
        eVar.g = playerState;
    }

    public /* synthetic */ void b(Boolean bool) {
        g gVar = this.e;
        if (gVar != null) {
            gVar.a(bool);
        }
    }

    public void c() {
        if (this.g.playbackId().isPresent() && this.g.track().isPresent()) {
            if (iyb.h(this.g).booleanValue()) {
                this.d.f(this.g.playbackId().get(), this.g.track().get().uri());
            } else {
                this.d.h(this.g.playbackId().get(), this.g.track().get().uri());
            }
        }
        this.h = false;
        this.a.b();
    }

    public void d(g gVar) {
        gVar.getClass();
        this.e = gVar;
        gVar.setClickListener(this);
        this.a.c();
        this.h = true;
        this.f.a(this.b.a().E().subscribe(new b(this)));
        this.f.a(this.c.t(d.a).subscribe(new c(this)));
    }

    public void e() {
        this.a.clear();
        this.f.c();
    }
}
