package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import io.reactivex.functions.l;

public final /* synthetic */ class i3 implements l {
    public static final /* synthetic */ i3 a = new i3();

    private /* synthetic */ i3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ImmutableList.of((MusicItem) obj);
    }
}
