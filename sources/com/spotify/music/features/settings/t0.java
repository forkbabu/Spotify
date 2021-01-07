package com.spotify.music.features.settings;

import com.spotify.android.flags.c;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.f0;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.explicitcontent.j;
import com.spotify.music.features.settings.adapter.p2;
import com.spotify.music.features.settings.adapter.u2;
import com.spotify.music.libs.facebook.t;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.samsungpersonalization.SamsungPersonalizationSettingsHandler;
import com.spotify.music.settings.a;
import com.spotify.music.z0;
import io.reactivex.g;
import io.reactivex.y;

public final class t0 implements fjf<s0> {
    public static void A(SettingsFragment settingsFragment, i1 i1Var) {
        settingsFragment.Y0 = i1Var;
    }

    public static void B(SettingsFragment settingsFragment, t tVar) {
        settingsFragment.O0 = tVar;
    }

    public static void C(SettingsFragment settingsFragment, ys2 ys2) {
        settingsFragment.L0 = ys2;
    }

    public static void D(SettingsFragment settingsFragment, z0 z0Var) {
        settingsFragment.X0 = z0Var;
    }

    public static void E(SettingsFragment settingsFragment, ov3 ov3) {
        settingsFragment.V0 = ov3;
    }

    public static s0 F(w wVar, f0 f0Var) {
        return new s0(wVar, f0Var);
    }

    public static u0 G(w wVar, f0 f0Var) {
        return new u0(wVar, f0Var);
    }

    public static void a(SettingsFragment settingsFragment, c6a c6a) {
        settingsFragment.T0 = c6a;
    }

    public static void b(SettingsFragment settingsFragment, com.spotify.mobile.android.util.t tVar) {
        settingsFragment.D0 = tVar;
    }

    public static void c(SettingsFragment settingsFragment, ConnectManager connectManager) {
        settingsFragment.C0 = connectManager;
    }

    public static void d(SettingsFragment settingsFragment, bqa bqa) {
        settingsFragment.Q0 = bqa;
    }

    public static void e(SettingsFragment settingsFragment, ExplicitContentFacade explicitContentFacade) {
        settingsFragment.H0 = explicitContentFacade;
    }

    public static void f(SettingsFragment settingsFragment, j jVar) {
        settingsFragment.I0 = jVar;
    }

    public static void g(SettingsFragment settingsFragment, c cVar) {
        settingsFragment.x0 = cVar;
    }

    public static void h(SettingsFragment settingsFragment, fm9 fm9) {
        settingsFragment.B0 = fm9;
    }

    public static void i(SettingsFragment settingsFragment, wlf<u2> wlf) {
        settingsFragment.A0 = wlf;
    }

    public static void j(SettingsFragment settingsFragment, or9 or9) {
        settingsFragment.P0 = or9;
    }

    public static void k(SettingsFragment settingsFragment, y yVar) {
        settingsFragment.W0 = yVar;
    }

    public static void l(SettingsFragment settingsFragment, InteractionLogger interactionLogger) {
        settingsFragment.M0 = interactionLogger;
    }

    public static void m(SettingsFragment settingsFragment, s0 s0Var) {
        settingsFragment.F0 = s0Var;
    }

    public static void n(SettingsFragment settingsFragment, jn5 jn5) {
        settingsFragment.a1 = jn5;
    }

    public static void o(SettingsFragment settingsFragment, y yVar) {
        settingsFragment.E0 = yVar;
    }

    public static void p(SettingsFragment settingsFragment, com.spotify.music.navigation.t tVar) {
        settingsFragment.J0 = tVar;
    }

    public static void q(SettingsFragment settingsFragment, uzd uzd) {
        settingsFragment.y0 = uzd;
    }

    public static void r(SettingsFragment settingsFragment, lqa lqa) {
        settingsFragment.R0 = lqa;
    }

    public static void s(SettingsFragment settingsFragment, u0 u0Var) {
        settingsFragment.G0 = u0Var;
    }

    public static void t(SettingsFragment settingsFragment, yn1 yn1) {
        settingsFragment.w0 = yn1;
    }

    public static void u(SettingsFragment settingsFragment, a aVar) {
        settingsFragment.K0 = aVar;
    }

    public static void v(SettingsFragment settingsFragment, SamsungPersonalizationSettingsHandler samsungPersonalizationSettingsHandler) {
        settingsFragment.Z0 = samsungPersonalizationSettingsHandler;
    }

    public static void w(SettingsFragment settingsFragment, ws3 ws3) {
        settingsFragment.U0 = ws3;
    }

    public static void x(SettingsFragment settingsFragment, g<SessionState> gVar) {
        settingsFragment.S0 = gVar;
    }

    public static void y(SettingsFragment settingsFragment, wlf<p2> wlf) {
        settingsFragment.z0 = wlf;
    }

    public static void z(SettingsFragment settingsFragment, x0 x0Var) {
        settingsFragment.N0 = x0Var;
    }
}
