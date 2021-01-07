package com.spotify.imageresolve;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMultimap;
import io.reactivex.functions.l;

public final /* synthetic */ class p implements l {
    public static final /* synthetic */ p a = new p();

    private /* synthetic */ p() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (ImmutableMultimap) ((Optional) obj).get();
    }
}
