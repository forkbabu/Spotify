package com.spotify.music.spotlets.apprater;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.t;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class i {
    public static void a(AppRaterActivity appRaterActivity, t tVar) {
        appRaterActivity.G = tVar;
    }

    public static void b(AppRaterFragment appRaterFragment, t tVar) {
        appRaterFragment.j0 = tVar;
    }

    public static void c(AppRaterFragment appRaterFragment, cqe cqe) {
        appRaterFragment.l0 = cqe;
    }

    public static void d(AppRaterFragment appRaterFragment, g<PlayerState> gVar) {
        appRaterFragment.k0 = gVar;
    }

    public static void e(AppRaterFragment appRaterFragment, SpSharedPreferences<Object> spSharedPreferences) {
        appRaterFragment.m0 = spSharedPreferences;
    }
}
