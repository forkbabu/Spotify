package com.spotify.music.features.entityselector.pages.search;

import com.spotify.music.preview.v;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class SearchFragmentModule$UserActionModule$stopPreview$1 extends Lambda implements cmf<f> {
    final /* synthetic */ v $previewPlayer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchFragmentModule$UserActionModule$stopPreview$1(v vVar) {
        super(0);
        this.$previewPlayer = vVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        this.$previewPlayer.h();
        return f.a;
    }
}
