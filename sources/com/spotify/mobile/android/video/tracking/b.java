package com.spotify.mobile.android.video.tracking;

import com.google.common.base.Predicate;

public final /* synthetic */ class b implements Predicate {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((k) obj).a().isPresent();
    }
}
