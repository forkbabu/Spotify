package com.spotify.music.cyoa.home;

import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.s;
import io.reactivex.y;

public class j {
    private final k a;
    private final s<b91> b;
    private final y c;
    private b d = c.a();

    public j(c cVar, k kVar, y yVar) {
        this.b = cVar.b();
        kVar.getClass();
        this.a = kVar;
        this.c = yVar;
    }

    public void a() {
        s<b91> o0 = this.b.o0(this.c);
        k kVar = this.a;
        kVar.getClass();
        this.d = o0.subscribe(new b(kVar));
    }

    public void b() {
        this.d.dispose();
    }
}
