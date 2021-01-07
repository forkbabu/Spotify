package com.spotify.music.features.assistedcuration.search.utils;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Assertion.i("Failed to observe AgeRestrictedContentFacade.shouldDisableAgeRestrictedContent()", (Throwable) obj);
    }
}
