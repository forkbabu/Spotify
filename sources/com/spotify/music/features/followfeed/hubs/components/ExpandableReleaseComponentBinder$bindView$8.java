package com.spotify.music.features.followfeed.hubs.components;

import com.spotify.music.features.followfeed.views.FeedExpandableReleaseItem;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class ExpandableReleaseComponentBinder$bindView$8 extends Lambda implements cmf<f> {
    final /* synthetic */ FeedExpandableReleaseItem $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExpandableReleaseComponentBinder$bindView$8(FeedExpandableReleaseItem feedExpandableReleaseItem) {
        super(0);
        this.$view = feedExpandableReleaseItem;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        this.$view.i();
        return f.a;
    }
}
