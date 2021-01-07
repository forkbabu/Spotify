package com.spotify.music.features.login.startview;

import android.view.View;
import defpackage.ce0;
import defpackage.fe0;
import defpackage.ge0;
import defpackage.je0;

public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ WelcomeBackFragment a;
    public final /* synthetic */ u b;

    public /* synthetic */ h(WelcomeBackFragment welcomeBackFragment, u uVar) {
        this.a = welcomeBackFragment;
        this.b = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WelcomeBackFragment welcomeBackFragment = this.a;
        u uVar = this.b;
        welcomeBackFragment.j0.a(new ce0.c(je0.p.b, fe0.y.b, ge0.k.b));
        uVar.o();
    }
}
