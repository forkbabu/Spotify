package com.spotify.music.features.entityselector.pages.tracks.view;

import com.spotify.music.features.entityselector.common.a;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class SuggestedSongViewHolder$bind$2 extends Lambda implements cmf<f> {
    final /* synthetic */ uy4 $track;
    final /* synthetic */ SuggestedSongViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuggestedSongViewHolder$bind$2(SuggestedSongViewHolder suggestedSongViewHolder, uy4 uy4) {
        super(0);
        this.this$0 = suggestedSongViewHolder;
        this.$track = uy4;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        SuggestedSongViewHolder.h0(this.this$0).onNext(new a.c(this.$track.getPreviewId()));
        return f.a;
    }
}
