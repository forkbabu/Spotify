package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.Map;

public final /* synthetic */ class x implements l {
    public static final /* synthetic */ x a = new x();

    private /* synthetic */ x() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new ArrayList(((Map) obj).values());
    }
}
