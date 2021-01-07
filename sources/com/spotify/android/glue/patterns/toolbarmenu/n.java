package com.spotify.android.glue.patterns.toolbarmenu;

import com.spotify.music.libs.viewuri.c;

public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ c b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ n(e0 e0Var, c cVar, Runnable runnable) {
        this.a = e0Var;
        this.b = cVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.w(this.b, this.c);
    }
}
