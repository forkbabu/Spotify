package com.spotify.mobile.android.storytelling.container;

import com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class StorytellingContainerFragment$onCreateView$1 extends Lambda implements nmf<Integer, f> {
    final /* synthetic */ StorytellingContainerViews $views;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StorytellingContainerFragment$onCreateView$1(StorytellingContainerViews storytellingContainerViews) {
        super(1);
        this.$views = storytellingContainerViews;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Integer num) {
        this.$views.h(num.intValue());
        return f.a;
    }
}
