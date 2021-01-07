package com.spotify.music.nowplaying.podcast.sleeptimer;

import com.spotify.music.nowplaying.podcast.sleeptimer.g;
import com.spotify.music.sleeptimer.n;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.y;

public class e implements g.a {
    private final io.reactivex.g<String> a;
    private final s<Boolean> b;
    private final d c;
    private final c2c d;
    private final q e = new q();
    private String f;
    private g g;

    public e(io.reactivex.g<String> gVar, n nVar, d dVar, c2c c2c, y yVar) {
        this.a = gVar;
        this.b = nVar.f().o0(yVar);
        this.c = dVar;
        this.d = c2c;
    }

    public static void b(e eVar, boolean z) {
        eVar.g.setActive(z);
    }

    public static void c(e eVar, String str) {
        eVar.f = str;
    }

    @Override // com.spotify.music.nowplaying.podcast.sleeptimer.g.a
    public void a() {
        this.c.f(this.f);
        this.d.a(this.f);
    }

    public void d(g gVar) {
        gVar.getClass();
        this.g = gVar;
        gVar.setListener(this);
        this.e.a(this.b.subscribe(new b(this)));
        this.e.a(this.a.subscribe(new c(this)));
    }

    public void e() {
        this.e.c();
    }
}
