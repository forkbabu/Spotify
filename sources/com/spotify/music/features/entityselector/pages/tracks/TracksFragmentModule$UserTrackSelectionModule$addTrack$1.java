package com.spotify.music.features.entityselector.pages.tracks;

import com.spotify.music.features.entityselector.common.b;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class TracksFragmentModule$UserTrackSelectionModule$addTrack$1 extends Lambda implements nmf<uy4, f> {
    final /* synthetic */ b $userSelectionManager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TracksFragmentModule$UserTrackSelectionModule$addTrack$1(b bVar) {
        super(1);
        this.$userSelectionManager = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(uy4 uy4) {
        uy4 uy42 = uy4;
        h.e(uy42, "it");
        this.$userSelectionManager.b(uy42);
        return f.a;
    }
}
