package com.spotify.music.features.ads;

import com.spotify.music.features.ads.screensaver.n0;

/* access modifiers changed from: package-private */
public class r0 {
    private final r1 a;
    private final dv3 b;
    private final ku3 c;
    private final p0 d;
    private final n0 e;
    private final x1 f;

    r0(r1 r1Var, dv3 dv3, ku3 ku3, p0 p0Var, n0 n0Var, x1 x1Var) {
        this.a = r1Var;
        this.b = dv3;
        this.c = ku3;
        this.d = p0Var;
        this.e = n0Var;
        this.f = x1Var;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.c.b();
        if (this.a.c()) {
            this.b.b("backgrounded", this.a.a(), this.a.b());
        }
        this.e.n();
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.c.c();
        if (this.a.c()) {
            this.b.b("foregrounded", this.a.a(), this.a.b());
        }
        this.e.o();
        this.d.c();
        this.f.b();
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.c.d();
    }
}
