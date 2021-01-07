package com.spotify.music.features.freetierartist.datasource;

import com.spotify.music.connection.l;
import com.spotify.music.libs.freetiertrackpreview.transformer.a;
import com.spotify.music.libs.freetiertrackpreview.transformer.e;
import io.reactivex.s;
import io.reactivex.v;

public class a0 {
    private final t a;
    private final String b;
    private final boolean c;
    private final c0 d;
    private final ve3 e;
    private final z75 f;
    private final d85 g;
    private final kk9 h;
    private final zec i;
    private final wf3 j;
    private final l k;
    private final q l;
    private final y m;
    private final pe3 n;
    private final ld3 o;
    private final b85 p;
    private final e q;
    private final a r;

    public a0(wf3 wf3, c0 c0Var, b85 b85, t tVar, l lVar, q qVar, y yVar, String str, boolean z, ve3 ve3, z75 z75, d85 d85, kk9 kk9, zec zec, pe3 pe3, ld3 ld3, a aVar, e eVar) {
        this.j = wf3;
        this.b = str;
        this.c = z;
        this.l = qVar;
        this.m = yVar;
        this.k = lVar;
        this.p = b85;
        this.f = z75;
        this.g = d85;
        this.h = kk9;
        this.i = zec;
        this.d = c0Var;
        this.a = tVar;
        this.e = ve3;
        this.n = pe3;
        this.o = ld3;
        this.r = aVar;
        this.q = eVar;
    }

    public static s b(a0 a0Var, s sVar) {
        if (a0Var.i.d()) {
            return (!a0Var.j.a() || a0Var.j.b()) ? sVar.q(a0Var.h) : sVar;
        }
        return sVar;
    }

    public static s c(a0 a0Var, Boolean bool) {
        a0Var.getClass();
        if (bool.booleanValue()) {
            return a0Var.l.a(a0Var.b);
        }
        return a0Var.m.a(a0Var.b).J0(new h(a0Var));
    }

    public static s e(a0 a0Var, s sVar) {
        return (!a0Var.j.b() || !a0Var.j.a()) ? sVar : sVar.q(a0Var.f);
    }

    public s<v> a() {
        s<R> q2 = this.k.b().T().P().J0(new j(this)).q(this.e).q(this.g).q(new i(this)).q(new k(this)).q(this.n).q(this.o).q(this.p);
        if (!this.c) {
            q2 = q2.q(this.r).q(this.q);
        }
        return q2.q(this.a.b(this.b));
    }

    public /* synthetic */ v d(b91 b91) {
        if (b91.body().isEmpty()) {
            return this.l.a(this.b);
        }
        return s.i0(b91);
    }

    public void f(String str, boolean z) {
        this.d.c(str, z);
    }

    public void g(String str, boolean z) {
        this.d.d(str, z);
    }
}
