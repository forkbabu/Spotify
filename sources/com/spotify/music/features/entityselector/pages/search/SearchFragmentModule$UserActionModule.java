package com.spotify.music.features.entityselector.pages.search;

import com.spotify.music.preview.v;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class SearchFragmentModule$UserActionModule {
    public static final cmf<f> a(SearchFragment searchFragment) {
        h.e(searchFragment, "searchFragment");
        return new SearchFragmentModule$UserActionModule$dismiss$1(searchFragment);
    }

    public static final cmf<f> b(v vVar) {
        h.e(vVar, "previewPlayer");
        return new SearchFragmentModule$UserActionModule$stopPreview$1(vVar);
    }
}
