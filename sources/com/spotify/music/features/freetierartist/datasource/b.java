package com.spotify.music.features.freetierartist.datasource;

import com.spotify.music.follow.j;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ c0 a;

    public /* synthetic */ b(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        c0 c0Var = this.a;
        com.spotify.playlist.models.b bVar = (com.spotify.playlist.models.b) obj;
        String uri = bVar.getUri();
        j b = j.b(bVar.getUri(), 0, 0, bVar.j(), bVar.i());
        c0Var.getClass();
        return new v(g.p(new m(c0Var, uri, b), BackpressureStrategy.BUFFER));
    }
}
