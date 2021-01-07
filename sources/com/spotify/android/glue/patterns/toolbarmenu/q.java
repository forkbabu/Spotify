package com.spotify.android.glue.patterns.toolbarmenu;

import com.spotify.music.libs.viewuri.c;

public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ w b;
    public final /* synthetic */ c c;
    public final /* synthetic */ String f;
    public final /* synthetic */ a0 n;

    public /* synthetic */ q(e0 e0Var, w wVar, c cVar, String str, a0 a0Var) {
        this.a = e0Var;
        this.b = wVar;
        this.c = cVar;
        this.f = str;
        this.n = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.A(this.b, this.c, this.f, this.n);
    }
}
