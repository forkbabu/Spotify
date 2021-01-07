package com.spotify.nowplaying.ui.components.progressbar;

import com.spotify.rxjava2.q;
import io.reactivex.g;

public class b {
    private final g<dqd> a;
    private final q b = new q();
    private c c;

    public b(g<dqd> gVar) {
        this.a = gVar;
    }

    public static void a(b bVar, dqd dqd) {
        bVar.c.setDuration((int) dqd.a());
        bVar.c.setPosition((int) dqd.b());
    }

    public void b(c cVar) {
        cVar.getClass();
        this.c = cVar;
        this.b.a(this.a.subscribe(new a(this)));
    }

    public void c() {
        this.b.c();
    }
}
