package com.spotify.music.features.assistedcuration.search;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.libs.adaptiveui.di.OrientationMode;
import com.spotify.music.navigation.SimpleNavigationManager;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import io.reactivex.g;
import io.reactivex.s;

public final class f {
    public static void a(AssistedCurationSearchEntityFragment assistedCurationSearchEntityFragment, String str) {
        assistedCurationSearchEntityFragment.i0 = str;
    }

    public static void b(AssistedCurationSearchEntityFragment assistedCurationSearchEntityFragment, String str) {
        assistedCurationSearchEntityFragment.h0 = str;
    }

    public static void c(AssistedCurationSearchActivity assistedCurationSearchActivity, SimpleNavigationManager simpleNavigationManager) {
        assistedCurationSearchActivity.H = simpleNavigationManager;
    }

    public static void d(AssistedCurationSearchActivity assistedCurationSearchActivity, OrientationMode orientationMode) {
        assistedCurationSearchActivity.G = orientationMode;
    }

    public static void e(AssistedCurationSearchEntityFragment assistedCurationSearchEntityFragment, t0<s<b91>> t0Var) {
        assistedCurationSearchEntityFragment.j0 = t0Var;
    }

    public static void f(AssistedCurationSearchEntityFragment assistedCurationSearchEntityFragment, PageLoaderView.a<s<b91>> aVar) {
        assistedCurationSearchEntityFragment.k0 = aVar;
    }

    public static void g(AssistedCurationSearchActivity assistedCurationSearchActivity, w wVar) {
        assistedCurationSearchActivity.J = wVar;
    }

    public static void h(AssistedCurationSearchActivity assistedCurationSearchActivity, g<SessionState> gVar) {
        assistedCurationSearchActivity.L = gVar;
    }

    public static void i(AssistedCurationSearchActivity assistedCurationSearchActivity, SnackbarManager snackbarManager) {
        assistedCurationSearchActivity.I = snackbarManager;
    }

    public static void j(AssistedCurationSearchActivity assistedCurationSearchActivity, o0 o0Var) {
        assistedCurationSearchActivity.K = o0Var;
    }

    public static i k(String str) {
        return new i(str);
    }
}
