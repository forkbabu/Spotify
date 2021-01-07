package com.spotify.music.features.login.startview;

import android.view.View;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.navigation.b;
import defpackage.ce0;
import defpackage.fe0;
import defpackage.ge0;
import defpackage.je0;

public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ WelcomeBackFragment a;

    public /* synthetic */ d(WelcomeBackFragment welcomeBackFragment) {
        this.a = welcomeBackFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WelcomeBackFragment welcomeBackFragment = this.a;
        welcomeBackFragment.j0.a(new ce0.c(je0.p.b, fe0.c.b, ge0.k.b));
        welcomeBackFragment.i0.c(Destination.c.a, new b(null));
    }
}
