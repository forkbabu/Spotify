package com.spotify.music;

import android.content.Intent;
import androidx.fragment.app.k;
import com.google.android.play.core.missingsplits.a;
import com.spotify.connect.snacks.ConnectSnacksPlugin;
import com.spotify.feature.speakerdeeplink.SpeakerDeepLinkPlugin;
import com.spotify.instrumentation.navigation.logger.m;
import com.spotify.intentrouter.l;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.coreintegration.k0;
import com.spotify.mobile.android.ui.view.anchorbar.e;
import com.spotify.mobile.android.ui.view.anchorbar.g;
import com.spotify.music.carmode.navigation.o;
import com.spotify.music.deeplinktracker.c;
import com.spotify.music.features.ads.audioplus.i;
import com.spotify.music.features.ads.p1;
import com.spotify.music.features.payfail.s;
import com.spotify.music.libs.connect.access.ConnectAccessViewModel;
import com.spotify.music.mainactivity.j;
import com.spotify.music.mainactivity.p;
import com.spotify.music.mainactivity.u;
import com.spotify.music.mainactivity.v;
import com.spotify.music.mainactivity.x;
import com.spotify.music.navigation.h;
import com.spotify.music.navigation.q;
import com.spotify.music.navigation.r;
import com.spotify.music.premiummini.PremiumMiniPlugin;

public final class b0 implements fjf<a0> {
    public static void A(MainActivity mainActivity, boolean z) {
        mainActivity.o0 = z;
    }

    public static void B(MainActivity mainActivity, i iVar) {
        mainActivity.Q = iVar;
    }

    public static void C(MainActivity mainActivity, pz1 pz1) {
        mainActivity.J = pz1;
    }

    public static void D(MainActivity mainActivity, int i) {
        mainActivity.n0 = i;
    }

    public static void E(SpotifyApplication spotifyApplication, a aVar) {
        spotifyApplication.p = aVar;
    }

    public static void F(MainActivity mainActivity, p pVar) {
        mainActivity.a0 = pVar;
    }

    public static void G(MainActivity mainActivity, m mVar) {
        mainActivity.i0 = mVar;
    }

    public static void H(MainActivity mainActivity, q qVar) {
        mainActivity.h0 = qVar;
    }

    public static void I(MainActivity mainActivity, r rVar) {
        mainActivity.k0 = rVar;
    }

    public static void J(MainActivity mainActivity, wod wod) {
        mainActivity.L = wod;
    }

    public static void K(MainActivity mainActivity, k kVar) {
        mainActivity.s0 = kVar;
    }

    public static void L(MainActivity mainActivity, s sVar) {
        mainActivity.P = sVar;
    }

    public static void M(SpotifyApplication spotifyApplication, com.spotify.music.libs.performance.tracking.s sVar) {
        spotifyApplication.o = sVar;
    }

    public static void N(MainActivity mainActivity, ux9 ux9) {
        mainActivity.V = ux9;
    }

    public static void O(MainActivity mainActivity, u uVar) {
        mainActivity.u0 = uVar;
    }

    public static void P(MainActivity mainActivity, hi8 hi8) {
        mainActivity.T = hi8;
    }

    public static void Q(SpotifyApplication spotifyApplication, wlf<e0e> wlf) {
        spotifyApplication.f = wlf;
    }

    public static void R(SpotifyApplication spotifyApplication, wlf<ov9> wlf) {
        spotifyApplication.b = wlf;
    }

    public static void S(MainActivity mainActivity, v vVar) {
        mainActivity.S = vVar;
    }

    public static void T(MainActivity mainActivity, k0 k0Var) {
        mainActivity.x0 = k0Var;
    }

    public static void U(MainActivity mainActivity, Object obj) {
        mainActivity.c0 = (y0) obj;
    }

    public static void V(MainActivity mainActivity, nx9 nx9) {
        mainActivity.X = nx9;
    }

    public static void W(MainActivity mainActivity, kd0 kd0) {
        mainActivity.W = kd0;
    }

    public static void X(MainActivity mainActivity, z0 z0Var) {
        mainActivity.t0 = z0Var;
    }

    public static a0 Y(d0 d0Var, o oVar) {
        return new a0(d0Var, oVar);
    }

    public static f0 Z(w5a w5a, g0 g0Var) {
        return new f0(w5a, g0Var);
    }

    public static void a(MainActivity mainActivity, m70 m70) {
        mainActivity.b0 = m70;
    }

    public static l0 a0(SpeakerDeepLinkPlugin speakerDeepLinkPlugin, ir8 ir8, b90 b90) {
        return new l0(speakerDeepLinkPlugin, ir8, b90);
    }

    public static void b(MainActivity mainActivity, p1 p1Var) {
        mainActivity.H = p1Var;
    }

    public static m0 b0(tgb tgb, x xVar, c cVar, ce2 ce2) {
        return new m0(tgb, xVar, cVar, ce2);
    }

    public static void c(SpotifyApplication spotifyApplication, wlf<y> wlf) {
        spotifyApplication.c = wlf;
    }

    public static n0 c0(rgb rgb, pgb pgb, m mVar, h hVar, com.spotify.page.hosting.a aVar, ykb ykb, qg0<Intent> qg0) {
        return new n0(rgb, pgb, mVar, hVar, aVar, ykb, qg0);
    }

    public static void d(MainActivity mainActivity, e eVar) {
        mainActivity.M = eVar;
    }

    public static y0 d0(j jVar, ck2 ck2, d9b d9b, ljb ljb, hv5 hv5, d90 d90, f28 f28, com.spotify.music.features.carmode.optin.k kVar, d0 d0Var, o oVar, cy8 cy8, w5a w5a, ConnectSnacksPlugin connectSnacksPlugin, c9c c9c, PremiumMiniPlugin premiumMiniPlugin, bld bld) {
        return new y0(jVar, ck2, d9b, ljb, hv5, d90, f28, kVar, d0Var, oVar, cy8, w5a, connectSnacksPlugin, c9c, premiumMiniPlugin, bld);
    }

    public static void e(MainActivity mainActivity, fi8 fi8) {
        mainActivity.R = fi8;
    }

    public static void f(MainActivity mainActivity, g gVar) {
        mainActivity.g0 = gVar;
    }

    public static void g(MainActivity mainActivity, a0 a0Var) {
        mainActivity.y0 = a0Var;
    }

    public static void h(MainActivity mainActivity, y70 y70) {
        mainActivity.r0 = y70;
    }

    public static void i(MainActivity mainActivity, ColdStartTracker coldStartTracker) {
        mainActivity.U = coldStartTracker;
    }

    public static void j(MainActivity mainActivity, ConnectAccessViewModel connectAccessViewModel) {
        mainActivity.q0 = connectAccessViewModel;
    }

    public static void k(MainActivity mainActivity, xw9 xw9) {
        mainActivity.Y = xw9;
    }

    public static void l(MainActivity mainActivity, zw9 zw9) {
        mainActivity.Z = zw9;
    }

    public static void m(MainActivity mainActivity, com.spotify.music.navigation.i iVar) {
        mainActivity.j0 = iVar;
    }

    public static void n(MainActivity mainActivity, nhd nhd) {
        mainActivity.K = nhd;
    }

    public static void o(SpotifyApplication spotifyApplication, gl0<com.google.protobuf.u> gl0) {
        spotifyApplication.n = gl0;
    }

    public static void p(MainActivity mainActivity, ykb ykb) {
        mainActivity.m0 = ykb;
    }

    public static void q(MainActivity mainActivity, com.spotify.mobile.android.service.feature.q qVar) {
        mainActivity.w0 = qVar;
    }

    public static void r(MainActivity mainActivity, f0 f0Var) {
        mainActivity.f0 = f0Var;
    }

    public static void s(MainActivity mainActivity, fm9 fm9) {
        mainActivity.O = fm9;
    }

    public static void t(MainActivity mainActivity, qv9 qv9) {
        mainActivity.I = qv9;
    }

    public static void u(MainActivity mainActivity, iy7 iy7) {
        mainActivity.N = iy7;
    }

    public static void v(MainActivity mainActivity, boolean z) {
        mainActivity.p0 = z;
    }

    public static void w(MainActivity mainActivity, rhd rhd) {
        mainActivity.v0 = rhd;
    }

    public static void x(MainActivity mainActivity, Object obj) {
        mainActivity.d0 = (l0) obj;
    }

    public static void y(MainActivity mainActivity, Object obj) {
        mainActivity.e0 = (m0) obj;
    }

    public static void z(MainActivity mainActivity, l<hlb> lVar) {
        mainActivity.l0 = lVar;
    }
}
