package com.spotify.android.glue.patterns.toolbarmenu;

import com.spotify.music.navigation.t;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ com.spotify.music.libs.viewuri.c b;
    public final /* synthetic */ t c;

    public /* synthetic */ c(e0 e0Var, com.spotify.music.libs.viewuri.c cVar, t tVar) {
        this.a = e0Var;
        this.b = cVar;
        this.c = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.B(this.b, this.c);
    }
}
