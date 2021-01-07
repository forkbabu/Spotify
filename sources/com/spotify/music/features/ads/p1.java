package com.spotify.music.features.ads;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.MainActivity;
import com.spotify.music.marquee.trigger.d0;
import com.spotify.music.productstate.c;
import com.spotify.rxjava2.p;

public class p1 {
    private final n1 a;
    private final y1 b;
    private final w1 c;
    private final d0 d;
    private final boolean e;
    private final c f;
    private boolean g;
    private boolean h;
    private final p i = new p();

    public p1(n1 n1Var, y1 y1Var, w1 w1Var, d0 d0Var, boolean z, c cVar) {
        this.a = n1Var;
        this.b = y1Var;
        this.c = w1Var;
        this.d = d0Var;
        this.e = z;
        this.f = cVar;
    }

    public void a(ys2 ys2) {
        this.i.b(this.f.a().subscribe(new u(this, ys2)));
        if (this.e) {
            boolean z = this.h;
            if (!z) {
                this.h = true;
                ((MainActivity) ys2).q1(this.d);
            } else if (z) {
                Logger.b("[Marquee] - removing MarqueeNavigationListener", new Object[0]);
                this.h = false;
                ((MainActivity) ys2).x2(this.d);
            }
        }
    }

    public void b(ys2 ys2) {
        if (this.g) {
            this.g = false;
            this.a.b();
            ys2.x2(this.a);
            ys2.x2(this.b);
            ys2.x2(this.c);
        }
        this.i.a();
    }

    public /* synthetic */ void c(ys2 ys2, Boolean bool) {
        if (bool.booleanValue() && !this.g) {
            this.g = true;
            ys2.q1(this.a);
            ys2.q1(this.b);
            ys2.q1(this.c);
        } else if (!bool.booleanValue() && this.g) {
            b(ys2);
        }
    }
}
