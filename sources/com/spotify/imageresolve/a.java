package com.spotify.imageresolve;

import com.google.common.base.Predicate;
import com.spotify.imageresolve.CacheStatusResponse;

public final /* synthetic */ class a implements Predicate {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((CacheStatusResponse.Entry) obj).cached();
    }
}
