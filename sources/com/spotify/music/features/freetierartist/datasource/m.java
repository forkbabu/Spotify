package com.spotify.music.features.freetierartist.datasource;

import com.spotify.music.follow.j;
import io.reactivex.h;
import io.reactivex.i;

public final /* synthetic */ class m implements i {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ j c;

    public /* synthetic */ m(c0 c0Var, String str, j jVar) {
        this.a = c0Var;
        this.b = str;
        this.c = jVar;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        this.a.a(this.b, this.c, hVar);
    }
}
