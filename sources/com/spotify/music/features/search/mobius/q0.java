package com.spotify.music.features.search.mobius;

import android.content.Intent;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.spotify.libs.search.history.i;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.a;
import com.spotify.music.libs.search.product.main.util.SearchModelParcelable;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.t;

public class q0 implements ws2 {
    private MobiusLoop.g<bza, zya> a;
    private wg8 b;
    private final uxa c;
    private final fb8 f;
    private final boolean n;
    private final u0 o;
    private final i p;
    private final t q;
    private final qd8 r;
    private final z0 s;

    public q0(uxa uxa, fb8 fb8, boolean z, u0 u0Var, i iVar, t tVar, qd8 qd8, z0 z0Var) {
        this.c = uxa;
        this.f = fb8;
        this.n = z;
        this.o = u0Var;
        this.p = iVar;
        this.q = tVar;
        this.r = qd8;
        this.s = z0Var;
    }

    private void c(b61 b61, wg8 wg8) {
        this.b = wg8;
        x0 b2 = this.s.b(wg8, b61);
        MobiusLoop.g<bza, zya> gVar = this.a;
        u0 u0Var = this.o;
        u0Var.getClass();
        gVar.c(a.a(new b(u0Var), b2));
    }

    public String a() {
        return this.a.b().d();
    }

    @Override // defpackage.ws2
    public boolean b() {
        return false;
    }

    public void d(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 1001) {
            this.q.d(intent.getStringExtra("com.spotify.music.spotlets.scannables.RESULT"));
        }
    }

    public void e() {
        this.r.a();
    }

    public void f(b61 b61, wg8 wg8) {
        this.a = this.c.a(bza.a);
        c(b61, wg8);
    }

    public void g(b61 b61, wg8 wg8, Parcelable parcelable) {
        if (parcelable instanceof SearchModelParcelable) {
            bza f2 = ((SearchModelParcelable) parcelable).f();
            this.a = this.c.a(f2);
            c(b61, wg8);
            if (!MoreObjects.isNullOrEmpty(f2.d())) {
                this.b.q().n(true);
                return;
            }
            return;
        }
        Assertion.g("Parcelable is not a SearchModelParcelable: " + parcelable);
    }

    public void h() {
        this.a.d();
    }

    public void i() {
        this.a.start();
        this.b.o();
    }

    public void j() {
        this.a.stop();
    }

    public boolean k() {
        String str;
        fb8 fb8 = this.f;
        if (this.n) {
            str = ViewUris.O.toString();
        } else {
            str = ViewUris.n0.toString();
        }
        fb8.log(str);
        return false;
    }

    public void l() {
        this.p.c();
    }

    public Parcelable m() {
        return SearchModelParcelable.a(this.a.b());
    }
}
