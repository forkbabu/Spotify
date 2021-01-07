package com.spotify.music.libs.search.product.main.util;

import com.google.common.base.Optional;
import com.spotify.music.libs.search.product.main.util.SearchModelParcelable;
import defpackage.dza;
import org.apache.commons.lang3.tuple.ImmutablePair;

public final /* synthetic */ class b implements ti0 {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        return Optional.of(new ImmutablePair(SearchModelParcelable.SearchResultType.OFFLINE, ((dza.c) obj).f()));
    }
}
