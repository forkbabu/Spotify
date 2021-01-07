package com.spotify.music.newplaying.scroll.container;

import com.google.common.collect.ImmutableList;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.e;

public final /* synthetic */ class p implements l {
    public final /* synthetic */ g a;

    public /* synthetic */ p(g gVar) {
        this.a = gVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new e(this.a, g.a, Functions.e()).h0((long) ((ImmutableList) obj).size());
    }
}
