package com.spotify.mobile.android.ui.contextmenu;

import android.app.Activity;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.features.addtoplaylist.d;
import com.spotify.music.features.editplaylist.g;
import com.spotify.music.follow.m;
import com.spotify.music.libs.yourlibraryx.pin.a;
import com.spotify.music.playlist.service.b;
import com.spotify.music.sleeptimer.n;
import com.spotify.music.spotlets.offline.util.e;
import com.spotify.music.z0;
import defpackage.t8a;

public final class p3 implements fjf<o3> {
    private final wlf<b.a> A;
    private final wlf<a> B;
    private final wlf<r9b> a;
    private final wlf<g22> b;
    private final wlf<SnackbarManager> c;
    private final wlf<jz1> d;
    private final wlf<fm9> e;
    private final wlf<m> f;
    private final wlf<n> g;
    private final wlf<cqe> h;
    private final wlf<nsb> i;
    private final wlf<vka> j;
    private final wlf<Activity> k;
    private final wlf<com.spotify.music.navigation.b> l;
    private final wlf<d> m;
    private final wlf<g> n;
    private final wlf<com.spotify.music.features.renameplaylist.d> o;
    private final wlf<xec> p;
    private final wlf<vxc> q;
    private final wlf<t8b> r;
    private final wlf<caa> s;
    private final wlf<kzc> t;
    private final wlf<e> u;
    private final wlf<t8a.a> v;
    private final wlf<ih0> w;
    private final wlf<ere> x;
    private final wlf<bre> y;
    private final wlf<z0> z;

    public p3(wlf<r9b> wlf, wlf<g22> wlf2, wlf<SnackbarManager> wlf3, wlf<jz1> wlf4, wlf<fm9> wlf5, wlf<m> wlf6, wlf<n> wlf7, wlf<cqe> wlf8, wlf<nsb> wlf9, wlf<vka> wlf10, wlf<Activity> wlf11, wlf<com.spotify.music.navigation.b> wlf12, wlf<d> wlf13, wlf<g> wlf14, wlf<com.spotify.music.features.renameplaylist.d> wlf15, wlf<xec> wlf16, wlf<vxc> wlf17, wlf<t8b> wlf18, wlf<caa> wlf19, wlf<kzc> wlf20, wlf<e> wlf21, wlf<t8a.a> wlf22, wlf<ih0> wlf23, wlf<ere> wlf24, wlf<bre> wlf25, wlf<z0> wlf26, wlf<b.a> wlf27, wlf<a> wlf28) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
        this.l = wlf12;
        this.m = wlf13;
        this.n = wlf14;
        this.o = wlf15;
        this.p = wlf16;
        this.q = wlf17;
        this.r = wlf18;
        this.s = wlf19;
        this.t = wlf20;
        this.u = wlf21;
        this.v = wlf22;
        this.w = wlf23;
        this.x = wlf24;
        this.y = wlf25;
        this.z = wlf26;
        this.A = wlf27;
        this.B = wlf28;
    }

    public static p3 a(wlf<r9b> wlf, wlf<g22> wlf2, wlf<SnackbarManager> wlf3, wlf<jz1> wlf4, wlf<fm9> wlf5, wlf<m> wlf6, wlf<n> wlf7, wlf<cqe> wlf8, wlf<nsb> wlf9, wlf<vka> wlf10, wlf<Activity> wlf11, wlf<com.spotify.music.navigation.b> wlf12, wlf<d> wlf13, wlf<g> wlf14, wlf<com.spotify.music.features.renameplaylist.d> wlf15, wlf<xec> wlf16, wlf<vxc> wlf17, wlf<t8b> wlf18, wlf<caa> wlf19, wlf<kzc> wlf20, wlf<e> wlf21, wlf<t8a.a> wlf22, wlf<ih0> wlf23, wlf<ere> wlf24, wlf<bre> wlf25, wlf<z0> wlf26, wlf<b.a> wlf27, wlf<a> wlf28) {
        return new p3(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10, wlf11, wlf12, wlf13, wlf14, wlf15, wlf16, wlf17, wlf18, wlf19, wlf20, wlf21, wlf22, wlf23, wlf24, wlf25, wlf26, wlf27, wlf28);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, jjf.a(this.s), this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
    }
}
