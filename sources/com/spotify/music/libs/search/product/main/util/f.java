package com.spotify.music.libs.search.product.main.util;

import com.google.common.base.Optional;
import com.spotify.music.libs.search.product.main.util.SearchModelParcelable;
import defpackage.dza;
import org.apache.commons.lang3.tuple.ImmutablePair;

public final /* synthetic */ class f implements ti0 {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        SearchModelParcelable.SearchResultType searchResultType = SearchModelParcelable.SearchResultType.ONLINE;
        cza f = ((dza.d) obj).f();
        return Optional.of(new ImmutablePair(searchResultType, new AutoValue_SearchResponseSerializable(f.b(), f.c().toByteString())));
    }
}
