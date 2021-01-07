package com.spotify.music.features.ads.screensaver;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.c;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.audioplus.topbanner.a;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.features.ads.screensaver.n0;
import com.spotify.music.features.ads.screensaver.p0;

public class e0 implements p0.a {
    private final p0 a;
    private final FrameLayout b;
    private final fp3 c;
    private final n0 f;
    private final com.spotify.music.features.ads.p0 n;
    private final n0.a o = new b(this);

    public e0(c cVar, ys2 ys2, a aVar, n0 n0Var, q0 q0Var, nsb nsb, com.spotify.music.features.ads.p0 p0Var) {
        this.a = q0Var.b(cVar.v0(), ys2, aVar);
        View findViewById = cVar.findViewById(C0707R.id.screensaver_ad_container);
        findViewById.getClass();
        this.b = (FrameLayout) findViewById;
        gp3 gp3 = new gp3(nsb);
        this.c = new fp3(gp3, gp3, gp3);
        this.f = n0Var;
        this.n = p0Var;
    }

    @Override // com.spotify.music.features.ads.screensaver.p0.a
    public p0 W() {
        return this.a;
    }

    public void a() {
        this.a.c();
        this.a.b();
        this.a.d();
    }

    public void b() {
        this.f.q(this.o);
        this.n.d(this.c);
    }

    public void c() {
        this.f.q(null);
        this.n.g(this.c);
    }

    public void d(Ad ad) {
        this.a.h(ad);
        this.a.i(this.b);
    }

    public void e() {
        this.a.c();
        this.a.b();
        this.a.d();
    }
}
