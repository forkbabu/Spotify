package com.spotify.music.features.podcast.entity;

import com.spotify.mobile.android.util.SortOption;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class DefaultFilterSortPopupFactory$createFilterPopup$1 extends FunctionReferenceImpl implements nmf<SortOption, f> {
    DefaultFilterSortPopupFactory$createFilterPopup$1(e eVar) {
        super(1, eVar, e.class, "onSortOptionChanged", "onSortOptionChanged(Lcom/spotify/mobile/android/util/SortOption;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(SortOption sortOption) {
        SortOption sortOption2 = sortOption;
        h.e(sortOption2, "p1");
        ((e) this.receiver).a(sortOption2);
        return f.a;
    }
}
