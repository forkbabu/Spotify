package com.spotify.music.features.pushnotifications;

import com.google.common.collect.ArrayListMultimap;
import io.reactivex.functions.l;

public final /* synthetic */ class x implements l {
    public final /* synthetic */ r0 a;

    public /* synthetic */ x(r0 r0Var) {
        this.a = r0Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.i((ArrayListMultimap) obj);
    }
}
