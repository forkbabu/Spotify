package com.spotify.music.behindthelyrics.persistence.database;

import com.google.common.collect.ImmutableSet;
import com.spotify.music.behindthelyrics.model.business.TracksAndResources;
import io.reactivex.functions.l;
import java.util.Collection;
import java.util.List;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new TracksAndResources(ImmutableSet.copyOf((Collection) ((List) obj)));
    }
}
