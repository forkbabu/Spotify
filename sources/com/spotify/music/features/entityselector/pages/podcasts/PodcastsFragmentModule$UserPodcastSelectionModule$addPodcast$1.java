package com.spotify.music.features.entityselector.pages.podcasts;

import com.spotify.music.features.entityselector.common.b;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class PodcastsFragmentModule$UserPodcastSelectionModule$addPodcast$1 extends Lambda implements nmf<sy4, f> {
    final /* synthetic */ b $userSelectionManager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PodcastsFragmentModule$UserPodcastSelectionModule$addPodcast$1(b bVar) {
        super(1);
        this.$userSelectionManager = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(sy4 sy4) {
        sy4 sy42 = sy4;
        h.e(sy42, "it");
        this.$userSelectionManager.a(sy42);
        return f.a;
    }
}
