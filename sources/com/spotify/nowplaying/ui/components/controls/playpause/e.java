package com.spotify.nowplaying.ui.components.controls.playpause;

import com.spotify.nowplaying.ui.components.controls.playpause.g;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.rxjava2.q;

public final class e implements g.a {
    private final d a;
    private final io.reactivex.g<Boolean> b;
    private final io.reactivex.g<String> c;
    private final d d;
    private final q e = new q();
    private boolean f;
    private String g;
    private g h;

    public e(d dVar, io.reactivex.g<Boolean> gVar, io.reactivex.g<String> gVar2, d dVar2) {
        this.a = dVar;
        this.b = gVar;
        this.c = gVar2;
        this.d = dVar2;
    }

    public static void a(e eVar, String str) {
        eVar.g = str;
    }

    public static void b(e eVar, boolean z) {
        eVar.f = z;
        if (z) {
            eVar.h.e();
        } else {
            eVar.h.c();
        }
    }

    public void c() {
        if (this.f) {
            this.d.b(this.g);
            this.e.a(this.a.a(c.c()).subscribe());
            return;
        }
        this.d.v(this.g);
        this.e.a(this.a.a(c.e()).subscribe());
    }

    public void d(g gVar) {
        gVar.getClass();
        this.h = gVar;
        gVar.setListener(this);
        this.e.a(this.b.subscribe(new c(this)));
        this.e.a(this.c.subscribe(new b(this)));
    }

    public void e() {
        this.h.setListener(null);
        this.e.c();
    }
}
