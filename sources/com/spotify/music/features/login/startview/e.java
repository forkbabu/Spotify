package com.spotify.music.features.login.startview;

import androidx.lifecycle.v;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.music.features.login.startview.u;

public final /* synthetic */ class e implements v {
    public final /* synthetic */ WelcomeBackFragment a;

    public /* synthetic */ e(WelcomeBackFragment welcomeBackFragment) {
        this.a = welcomeBackFragment;
    }

    @Override // androidx.lifecycle.v
    public final void a(Object obj) {
        WelcomeBackFragment welcomeBackFragment = this.a;
        welcomeBackFragment.getClass();
        if (((u.a) obj).a() != null) {
            welcomeBackFragment.i0.b(Destination.i.a);
        }
    }
}
