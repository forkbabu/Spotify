package com.spotify.music.features.album.di;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;

public final /* synthetic */ class b implements Function {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return (s81) FluentIterable.from(((s81) obj).children()).firstMatch(e.a).orNull();
    }
}
