package com.spotify.mobile.android.service.media;

import com.spotify.music.follow.j;
import io.reactivex.a;
import io.reactivex.functions.l;
import io.reactivex.z;

public final /* synthetic */ class k implements l {
    public final /* synthetic */ c2 a;

    public /* synthetic */ k(c2 c2Var) {
        this.a = c2Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        c2 c2Var = this.a;
        j jVar = (j) obj;
        c2Var.getClass();
        return a.u(new m(c2Var, jVar)).h(z.z(Boolean.valueOf(jVar.g())));
    }
}
