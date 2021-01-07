package com.spotify.music.carmode.nowplaying.podcast.view.speedbutton;

import com.spotify.music.carmode.nowplaying.podcast.view.speedbutton.f;
import io.reactivex.disposables.a;
import io.reactivex.s;
import io.reactivex.y;

public class d implements f.a {
    private final s<Integer> a;
    private final s<Integer> b;
    private final a c = new a();
    private final sq2 d;
    private final nq2 e;
    private final y f;
    private f g;
    private int h = 0;

    public d(s<Integer> sVar, sq2 sq2, nq2 nq2, s<Integer> sVar2, y yVar) {
        this.d = sq2;
        this.e = nq2;
        this.a = sVar;
        this.b = sVar2;
        this.f = yVar;
    }

    public static void a(d dVar, int i) {
        dVar.h = i;
    }

    public static void b(d dVar, int i) {
        if (dVar.g != null) {
            if (mq2.a(i) != null) {
                f fVar = dVar.g;
                Integer a2 = mq2.a(i);
                a2.getClass();
                fVar.setSpeedIcon(a2.intValue());
                return;
            }
            f fVar2 = dVar.g;
            Integer a3 = mq2.a(100);
            a3.getClass();
            fVar2.setSpeedIcon(a3.intValue());
        }
    }

    public void c() {
        this.d.c();
        this.e.a(this.h);
    }

    public void d(f fVar) {
        this.g = fVar;
        fVar.setListener(this);
        this.c.b(this.a.o0(this.f).subscribe(new c(this)));
        this.c.b(this.b.subscribe(new b(this)));
    }

    public void e() {
        this.c.f();
    }
}
