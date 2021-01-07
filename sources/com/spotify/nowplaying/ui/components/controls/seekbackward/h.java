package com.spotify.nowplaying.ui.components.controls.seekbackward;

import com.spotify.nowplaying.ui.components.controls.seekbackward.j;
import com.spotify.player.controls.d;
import com.spotify.player.model.Restrictions;
import com.spotify.rxjava2.q;
import io.reactivex.g;

public final class h implements j.a {
    private final d a;
    private final g<Long> b;
    private final g<Restrictions> c;
    private final g<String> d;
    private final g e;
    private final q f = new q();
    private j g;
    private String h;

    public h(d dVar, g<String> gVar, g<Long> gVar2, g<Restrictions> gVar3, g gVar4) {
        this.a = dVar;
        this.b = gVar2;
        this.c = gVar3;
        this.d = gVar;
        this.e = gVar4;
    }

    public static void a(h hVar, String str) {
        hVar.h = str;
    }

    public static void b(h hVar, Restrictions restrictions) {
        hVar.g.setSeekBackwardEnabled(restrictions.disallowSeekingReasons().isEmpty());
    }

    public void c() {
        this.e.k(this.h, 15000);
        q qVar = this.f;
        g<R> O = this.b.h0(1).O(f.a).O(a.a);
        d dVar = this.a;
        dVar.getClass();
        qVar.a(O.J(new b(dVar)).subscribe());
    }

    public void d(j jVar) {
        jVar.getClass();
        this.g = jVar;
        jVar.setListener(this);
        this.f.a(this.c.subscribe(new e(this)));
        this.f.a(this.d.subscribe(new d(this)));
    }

    public void e() {
        this.g.setListener(null);
        this.f.c();
    }
}
