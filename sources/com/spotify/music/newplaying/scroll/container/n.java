package com.spotify.music.newplaying.scroll.container;

import com.google.common.collect.ImmutableList;

public final /* synthetic */ class n implements io.reactivex.functions.n {
    public static final /* synthetic */ n a = new n();

    private /* synthetic */ n() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !((ImmutableList) obj).isEmpty();
    }
}
