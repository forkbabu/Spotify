package com.spotify.music.carmode.navigation;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.carmode.navigation.view.h;
import com.spotify.music.connection.l;
import com.spotify.music.libs.carmodeengine.util.y;
import com.spotify.music.navigation.b;
import com.spotify.music.navigation.o;
import io.reactivex.g;

public final class q {
    public static void a(CarModeNavigationFragment carModeNavigationFragment, b bVar) {
        carModeNavigationFragment.k0 = bVar;
    }

    public static void b(Object obj, b bVar) {
        ((r) obj).a = bVar;
    }

    public static void c(Object obj, kn2 kn2) {
        ((r) obj).i = kn2;
    }

    public static void d(CarModeNavigationFragment carModeNavigationFragment, o oVar) {
        carModeNavigationFragment.j0 = oVar;
    }

    public static void e(Object obj, o oVar) {
        ((r) obj).b = oVar;
    }

    public static void f(CarModeNavigationFragment carModeNavigationFragment, y yVar) {
        carModeNavigationFragment.l0 = yVar;
    }

    public static void g(Object obj, s sVar) {
        ((r) obj).f = sVar;
    }

    public static void h(Object obj, ln2 ln2) {
        ((r) obj).g = ln2;
    }

    public static void i(CarModeNavigationFragment carModeNavigationFragment, ere ere) {
        carModeNavigationFragment.h0 = ere;
    }

    public static void j(CarModeNavigationFragment carModeNavigationFragment, Object obj) {
        carModeNavigationFragment.g0 = (r) obj;
    }

    public static void k(Object obj, mn2 mn2) {
        ((r) obj).c = mn2;
    }

    public static void l(Object obj, l lVar) {
        ((r) obj).d = lVar;
    }

    public static void m(Object obj, on2 on2) {
        ((r) obj).j = on2;
    }

    public static void n(CarModeNavigationFragment carModeNavigationFragment, ys2 ys2) {
        carModeNavigationFragment.m0 = ys2;
    }

    public static void o(CarModeNavigationFragment carModeNavigationFragment, tn2 tn2) {
        carModeNavigationFragment.i0 = tn2;
    }

    public static void p(Object obj, h hVar) {
        ((r) obj).h = hVar;
    }

    public static void q(Object obj, pn2 pn2) {
        ((r) obj).e = pn2;
    }

    public static r r() {
        return new r();
    }

    public static t s(i iVar, Context context, g<SessionState> gVar, com.spotify.rxjava2.q qVar) {
        return new t(iVar, context, gVar, qVar);
    }
}
