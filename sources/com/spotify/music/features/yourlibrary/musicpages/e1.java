package com.spotify.music.features.yourlibrary.musicpages;

import android.util.DisplayMetrics;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.ui.fragments.logic.k;
import io.reactivex.s;

public class e1 {
    private final k a;
    private final tpd b;
    private final zec c;
    private final w d;
    private int e;
    private int f;
    private int g;
    private int h;

    public e1(DisplayMetrics displayMetrics, k kVar, tpd tpd, zec zec, w wVar) {
        this.a = kVar;
        this.b = tpd;
        this.c = zec;
        this.d = wVar;
        int min = Math.min(Math.max(Math.round((((float) displayMetrics.heightPixels) * 1.5f) / ((float) Math.round(displayMetrics.density * 64.0f))), 16), 48);
        this.h = min;
        int max = Math.max(tpd.e(), min * 2);
        this.e = max;
        int min2 = Math.min(max / 8, 16);
        this.g = min2;
        this.f = (min2 * 2) + this.h;
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.e;
    }

    public boolean d() {
        return z42.y(this.a.getFlags());
    }

    public boolean e() {
        return z42.y(this.a.getFlags());
    }

    public boolean f() {
        return this.b.a();
    }

    public boolean g() {
        return this.b.b();
    }

    public boolean h() {
        return this.b.c();
    }

    public boolean i() {
        return z42.x(this.a.getFlags());
    }

    public boolean j() {
        return z42.y(this.a.getFlags());
    }

    public boolean k() {
        return this.c.c();
    }

    public boolean l() {
        return !z42.C(this.a.getFlags());
    }

    public boolean m() {
        return this.b.d();
    }

    public int n() {
        return this.b.f();
    }

    public s<Boolean> o() {
        return this.d.b().j0(s0.a).E();
    }

    public s<Boolean> p() {
        return this.d.a("streaming-rules").j0(z0.a);
    }

    public boolean q() {
        return z42.y(this.a.getFlags());
    }

    public boolean r() {
        return this.b.g();
    }

    public boolean s() {
        return this.b.h();
    }

    public boolean t() {
        return this.b.i();
    }

    public boolean u() {
        return this.b.j();
    }

    public boolean v() {
        return this.b.k();
    }

    public boolean w() {
        return this.b.l();
    }

    public int x() {
        return this.h;
    }

    public boolean y() {
        return this.c.d();
    }
}
