package com.spotify.music.features.entityselector.pages.search.view;

import com.spotify.music.features.entityselector.common.a;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class SearchResultViewHolder$bind$3 extends Lambda implements cmf<f> {
    final /* synthetic */ uy4 $track;
    final /* synthetic */ SearchResultViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchResultViewHolder$bind$3(SearchResultViewHolder searchResultViewHolder, uy4 uy4) {
        super(0);
        this.this$0 = searchResultViewHolder;
        this.$track = uy4;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        SearchResultViewHolder.h0(this.this$0).onNext(new a.b(this.$track.getPreviewId()));
        return f.a;
    }
}
