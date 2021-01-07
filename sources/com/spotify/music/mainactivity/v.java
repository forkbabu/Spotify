package com.spotify.music.mainactivity;

import androidx.fragment.app.c;
import com.spotify.music.features.ads.audioplus.topbanner.a;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.features.ads.screensaver.e0;
import com.spotify.music.features.ads.screensaver.f0;
import com.spotify.music.features.ads.screensaver.j0;
import com.spotify.music.features.ads.screensaver.k0;
import com.spotify.music.features.ads.screensaver.p0;

public class v implements j0, k0 {
    private final f0 a;
    private e0 b;
    private p0 c;

    public v(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // com.spotify.music.features.ads.screensaver.k0
    public boolean a() {
        return this.c.f();
    }

    @Override // com.spotify.music.features.ads.screensaver.j0
    public void b(Ad ad) {
        this.b.d(ad);
    }

    public p0 c() {
        return this.b.W();
    }

    public void d(c cVar, ys2 ys2, a aVar) {
        e0 b2 = this.a.b(cVar, ys2, aVar);
        this.b = b2;
        this.c = b2.W();
    }

    public void e() {
        this.b.a();
    }

    public void f() {
        this.b.b();
    }

    public void g() {
        this.b.c();
    }

    public void h() {
        this.b.e();
    }
}
