package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.base.Predicate;
import java.util.Map;

public final /* synthetic */ class j implements Predicate {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((Boolean) ((Map.Entry) obj).getValue()).booleanValue();
    }
}
