package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.collect.ImmutableList;
import io.reactivex.functions.l;

public final /* synthetic */ class l1 implements l {
    public static final /* synthetic */ l1 a = new l1();

    private /* synthetic */ l1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(!((ImmutableList) obj).isEmpty());
    }
}
