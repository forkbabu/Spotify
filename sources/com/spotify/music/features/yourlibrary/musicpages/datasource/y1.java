package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.collect.ImmutableMap;
import io.reactivex.functions.l;

public final /* synthetic */ class y1 implements l {
    public static final /* synthetic */ y1 a = new y1();

    private /* synthetic */ y1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (String) ((ImmutableMap) obj).getOrDefault("collapse_recommended_artists_section", Boolean.FALSE.toString());
    }
}
