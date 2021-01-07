package com.spotify.loginflow;

import com.spotify.cosmos.session.BootstrapHandler;
import com.spotify.cosmos.session.SessionClient;
import com.spotify.loginflow.navigation.d;
import com.spotify.music.spotlets.tracker.identifier.a;
import com.spotify.smartlock.store.f;
import dagger.android.DispatchingAndroidInjector;
import io.reactivex.y;

public final class s {
    public static void a(LoginActivity loginActivity, DispatchingAndroidInjector<Object> dispatchingAndroidInjector) {
        loginActivity.J = dispatchingAndroidInjector;
    }

    public static void b(QuickLoginActivity quickLoginActivity, DispatchingAndroidInjector<Object> dispatchingAndroidInjector) {
        quickLoginActivity.D = dispatchingAndroidInjector;
    }

    public static void c(LoginActivity loginActivity, ae0 ae0) {
        loginActivity.N = ae0;
    }

    public static void d(LoginActivity loginActivity, ajf<r01> ajf) {
        loginActivity.M = ajf;
    }

    public static void e(QuickLoginActivity quickLoginActivity, BootstrapHandler bootstrapHandler) {
        quickLoginActivity.F = bootstrapHandler;
    }

    public static void f(LoginActivity loginActivity, boolean z) {
        loginActivity.L = z;
    }

    public static void g(LoginActivity loginActivity, ajf<f> ajf) {
        loginActivity.E = ajf;
    }

    public static void h(LoginActivity loginActivity, yx0 yx0) {
        loginActivity.P = yx0;
    }

    public static void i(LoginActivity loginActivity, n nVar) {
        loginActivity.O = nVar;
    }

    public static void j(LoginActivity loginActivity, y yVar) {
        loginActivity.G = yVar;
    }

    public static void k(LoginActivity loginActivity, hx0 hx0) {
        loginActivity.F = hx0;
    }

    public static void l(QuickLoginActivity quickLoginActivity, kx0 kx0) {
        quickLoginActivity.G = kx0;
    }

    public static void m(QuickLoginActivity quickLoginActivity, SessionClient sessionClient) {
        quickLoginActivity.C = sessionClient;
    }

    public static void n(LoginActivity loginActivity, u uVar) {
        loginActivity.K = uVar;
    }

    public static void o(QuickLoginActivity quickLoginActivity, u uVar) {
        quickLoginActivity.E = uVar;
    }

    public static void p(LoginActivity loginActivity, v vVar) {
        loginActivity.I = vVar;
    }

    public static void q(LoginActivity loginActivity, a aVar) {
        loginActivity.Q = aVar;
    }

    public static void r(LoginActivity loginActivity, d dVar) {
        loginActivity.H = dVar;
    }
}
