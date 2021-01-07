package com.spotify.music.features.yourlibrary.container.view;

import com.google.common.collect.ImmutableSortedMap;
import io.reactivex.functions.n;

public final /* synthetic */ class m implements n {
    public static final /* synthetic */ m a = new m();

    private /* synthetic */ m() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !((ImmutableSortedMap) obj).isEmpty();
    }
}
