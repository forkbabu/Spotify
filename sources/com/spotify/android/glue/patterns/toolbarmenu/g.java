package com.spotify.android.glue.patterns.toolbarmenu;

import com.spotify.music.navigation.t;

public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ t b;

    public /* synthetic */ g(e0 e0Var, t tVar) {
        this.a = e0Var;
        this.b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.y(this.b);
    }
}
