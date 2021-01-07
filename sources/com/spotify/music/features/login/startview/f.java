package com.spotify.music.features.login.startview;

import androidx.lifecycle.v;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.music.features.login.startview.u;

public final /* synthetic */ class f implements v {
    public final /* synthetic */ WelcomeBackFragment a;

    public /* synthetic */ f(WelcomeBackFragment welcomeBackFragment) {
        this.a = welcomeBackFragment;
    }

    @Override // androidx.lifecycle.v
    public final void a(Object obj) {
        WelcomeBackFragment welcomeBackFragment = this.a;
        welcomeBackFragment.getClass();
        f70 f70 = (f70) ((u.a) obj).a();
        if (f70 != null) {
            welcomeBackFragment.i0.b(new Destination.e(f70.c(), f70.b()));
        }
    }
}
