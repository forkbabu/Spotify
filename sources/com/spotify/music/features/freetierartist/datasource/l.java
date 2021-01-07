package com.spotify.music.features.freetierartist.datasource;

import io.reactivex.functions.f;

public final /* synthetic */ class l implements f {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ com.spotify.music.follow.l c;

    public /* synthetic */ l(c0 c0Var, String str, com.spotify.music.follow.l lVar) {
        this.a = c0Var;
        this.b = str;
        this.c = lVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.b(this.b, this.c);
    }
}
