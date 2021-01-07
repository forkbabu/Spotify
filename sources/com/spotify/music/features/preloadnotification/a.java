package com.spotify.music.features.preloadnotification;

import com.spotify.music.features.preloadnotification.conditions.e;

public class a {
    private final d a;
    private final e b;
    private final e c;
    private final th7 d;
    private final uh7 e;
    private final cqe f;

    public a(d dVar, e eVar, e eVar2, th7 th7, uh7 uh7, cqe cqe) {
        this.a = dVar;
        this.b = eVar;
        this.c = eVar2;
        this.d = th7;
        this.e = uh7;
        this.f = cqe;
        if (uh7.c()) {
            uh7.f(cqe.d());
            a();
        }
    }

    private void a() {
        if (!this.b.a()) {
            return;
        }
        if (this.d.c()) {
            this.c.a();
            a();
            return;
        }
        this.a.c();
    }

    public void b() {
        a();
    }

    public void c() {
        a();
    }

    public void d() {
        if (this.e.d()) {
            this.e.g();
            this.a.a();
        }
    }
}
