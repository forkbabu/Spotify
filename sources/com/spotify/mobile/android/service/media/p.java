package com.spotify.mobile.android.service.media;

import com.spotify.music.follow.j;
import io.reactivex.functions.a;

public final /* synthetic */ class p implements a {
    public final /* synthetic */ c2 a;
    public final /* synthetic */ j b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ p(c2 c2Var, j jVar, String str, boolean z) {
        this.a = c2Var;
        this.b = jVar;
        this.c = str;
        this.d = z;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.k(this.b, this.c, this.d);
    }
}
