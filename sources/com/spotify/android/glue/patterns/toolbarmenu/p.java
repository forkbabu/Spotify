package com.spotify.android.glue.patterns.toolbarmenu;

import com.spotify.music.libs.viewuri.c;
import com.spotify.playlist.models.offline.a;
import kotlin.f;

public final /* synthetic */ class p implements nmf {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ a0 b;
    public final /* synthetic */ c c;
    public final /* synthetic */ int f;
    public final /* synthetic */ Runnable n;

    public /* synthetic */ p(e0 e0Var, a0 a0Var, c cVar, int i, Runnable runnable) {
        this.a = e0Var;
        this.b = a0Var;
        this.c = cVar;
        this.f = i;
        this.n = runnable;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        this.a.u(this.b, this.c, this.f, this.n, (a.d) obj);
        return f.a;
    }
}
