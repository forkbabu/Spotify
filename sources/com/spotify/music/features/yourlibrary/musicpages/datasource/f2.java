package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.collect.ImmutableMap;
import io.reactivex.functions.l;

public final /* synthetic */ class f2 implements l {
    public static final /* synthetic */ f2 a = new f2();

    private /* synthetic */ f2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (String) ((ImmutableMap) obj).getOrDefault("collapse_recommended_albums_section", Boolean.FALSE.toString());
    }
}
