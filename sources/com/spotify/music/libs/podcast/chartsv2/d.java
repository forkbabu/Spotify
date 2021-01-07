package com.spotify.music.libs.podcast.chartsv2;

import io.reactivex.disposables.b;
import io.reactivex.s;
import io.reactivex.y;

public class d {
    private final gna a;
    private final nma b;
    private final y c;
    private b d;

    public d(nma nma, gna gna, y yVar) {
        nma.getClass();
        this.b = nma;
        gna.getClass();
        this.a = gna;
        yVar.getClass();
        this.c = yVar;
    }

    public void a() {
        s<b91> o0 = this.b.a().o0(this.c);
        gna gna = this.a;
        gna.getClass();
        this.d = o0.subscribe(new a(gna));
    }

    public void b() {
        b bVar = this.d;
        if (bVar != null) {
            bVar.dispose();
        }
    }
}
