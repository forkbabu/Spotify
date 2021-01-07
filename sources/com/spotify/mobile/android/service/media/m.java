package com.spotify.mobile.android.service.media;

import com.spotify.music.follow.j;
import io.reactivex.functions.a;

public final /* synthetic */ class m implements a {
    public final /* synthetic */ c2 a;
    public final /* synthetic */ j b;

    public /* synthetic */ m(c2 c2Var, j jVar) {
        this.a = c2Var;
        this.b = jVar;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.l(this.b);
    }
}
