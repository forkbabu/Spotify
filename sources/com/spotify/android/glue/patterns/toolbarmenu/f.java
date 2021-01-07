package com.spotify.android.glue.patterns.toolbarmenu;

import android.content.Context;
import com.spotify.music.libs.viewuri.c;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ w b;
    public final /* synthetic */ c c;
    public final /* synthetic */ String f;
    public final /* synthetic */ Context n;

    public /* synthetic */ f(e0 e0Var, w wVar, c cVar, String str, Context context) {
        this.a = e0Var;
        this.b = wVar;
        this.c = cVar;
        this.f = str;
        this.n = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.C(this.b, this.c, this.f, this.n);
    }
}
