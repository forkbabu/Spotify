package com.spotify.music.features.login.startview;

import android.content.Intent;
import com.google.common.base.Optional;
import com.spotify.effortlesslogin.EffortlessLoginBottomSheetDialog;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButtonConfiguration;
import com.spotify.libs.pse.model.a;
import com.spotify.music.features.login.startview.cta.d;
import defpackage.fo5;

public final class n {
    public static void a(WelcomeBackFragment welcomeBackFragment, ajf<g70> ajf) {
        welcomeBackFragment.h0 = ajf;
    }

    public static void b(WelcomeBackFragment welcomeBackFragment, ae0 ae0) {
        welcomeBackFragment.j0 = ae0;
    }

    public static void c(StartFragment startFragment, ComponentFactory<AuthenticationButton, AuthenticationButtonConfiguration> componentFactory) {
        startFragment.m0 = componentFactory;
    }

    public static void d(StartFragment startFragment, a aVar) {
        startFragment.i0 = aVar;
    }

    public static void e(StartFragment startFragment, EffortlessLoginBottomSheetDialog.a aVar) {
        startFragment.n0 = aVar;
    }

    public static void f(StartFragment startFragment, boolean z) {
        startFragment.j0 = z;
    }

    public static void g(StartFragment startFragment, boolean z) {
        startFragment.k0 = z;
    }

    public static void h(StartFragment startFragment, fo5.a aVar) {
        startFragment.o0 = aVar;
    }

    public static void i(StartFragment startFragment, Optional<Intent> optional) {
        startFragment.l0 = optional;
    }

    public static void j(StartFragment startFragment, d dVar) {
        startFragment.g0 = dVar;
    }

    public static void k(StartFragment startFragment, q qVar) {
        startFragment.h0 = qVar;
    }

    public static void l(WelcomeBackFragment welcomeBackFragment, com.spotify.loginflow.navigation.d dVar) {
        welcomeBackFragment.i0 = dVar;
    }
}
