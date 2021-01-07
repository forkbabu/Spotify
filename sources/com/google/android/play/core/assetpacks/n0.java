package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.common.a;
import com.google.android.play.core.common.c;
import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.m;
import com.google.android.play.core.internal.y;
import com.google.android.play.core.internal.z;
import com.google.android.play.core.splitinstall.b;
import java.util.concurrent.Executor;

public final class n0 {
    private final w2 a;
    private a0<Context> b;
    private a0<c2> c;
    private a0<z> d;
    private a0<u0> e;
    private a0<o> f;
    private a0<String> g = z.a(new c3(this.b));
    private a0<f3> h = new y();
    private a0<Executor> i;
    private a0<i1> j;
    private a0<t> k;
    private a0<p0> l;
    private a0<m2> m;
    private a0<w1> n;
    private a0<a2> o;
    private a0<a> p;
    private a0<f2> q;
    private a0<g0> r;
    private a0<l1> s;
    private a0<r0> t;
    private a0<j0> u;
    private a0<Executor> v;
    private a0<q1> w;
    private a0<com.google.android.play.core.splitinstall.a> x;
    private a0<s2> y;

    n0(w2 w2Var) {
        this.a = w2Var;
        b3 b3Var = new b3(w2Var);
        this.b = b3Var;
        a0<c2> a2 = z.a(new d2(b3Var));
        this.c = a2;
        this.d = z.a(new a0(this.b, a2));
        a0<u0> a3 = z.a(v0.a());
        this.e = a3;
        this.f = z.a(new p(this.b, a3));
        a0<Executor> a4 = z.a(x2.a());
        this.i = a4;
        this.j = z.a(new j1(this.d, this.h, this.e, a4));
        y yVar = new y();
        this.k = yVar;
        this.l = z.a(new q0(this.d, this.h, yVar, this.e));
        this.m = z.a(new n2(this.d));
        this.n = z.a(new x1(this.d));
        this.o = z.a(new b2(this.d, this.h, this.j, this.i, this.e));
        a0<a> a5 = z.a(c.a());
        this.p = a5;
        this.q = z.a(new g2(this.d, this.h, a5));
        a0<g0> a6 = z.a(new h0(this.h));
        this.r = a6;
        a0<l1> a7 = z.a(new m1(this.j, this.d, a6));
        this.s = a7;
        this.t = z.a(new s0(this.j, this.h, this.l, this.m, this.n, this.o, this.q, a7));
        this.u = z.a(k0.a());
        a0<Executor> a8 = z.a(d3.a());
        this.v = a8;
        y.a(this.k, z.a(new u(this.b, this.j, this.t, this.h, this.e, this.u, this.p, this.i, a8)));
        a0<q1> a9 = z.a(new r1(this.g, this.k, this.e, this.b, this.c, this.i));
        this.w = a9;
        y.a(this.h, z.a(new a3(this.b, this.f, a9)));
        a0<com.google.android.play.core.splitinstall.a> a10 = z.a(new b(this.b));
        this.x = a10;
        a0<s2> a11 = z.a(new t2(this.d, this.h, this.k, a10, this.j, this.e, this.u, this.i));
        this.y = a11;
        z.a(new z2(a11, this.b));
    }

    public final void a(AssetPackExtractionService assetPackExtractionService) {
        Context a2 = this.a.a();
        m.e(a2);
        assetPackExtractionService.b = a2;
        assetPackExtractionService.c = this.y.e();
        assetPackExtractionService.f = this.d.e();
    }
}
