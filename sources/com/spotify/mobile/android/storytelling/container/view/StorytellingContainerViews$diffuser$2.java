package com.spotify.mobile.android.storytelling.container.view;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class StorytellingContainerViews$diffuser$2 extends FunctionReferenceImpl implements nmf<px1, f> {
    StorytellingContainerViews$diffuser$2(StorytellingContainerViews storytellingContainerViews) {
        super(1, storytellingContainerViews, StorytellingContainerViews.class, "showStoryLoadStatus", "showStoryLoadStatus(Lcom/spotify/mobile/android/storytelling/container/domain/StoriesLoadStatus;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(px1 px1) {
        px1 px12 = px1;
        h.e(px12, "p1");
        StorytellingContainerViews.d((StorytellingContainerViews) this.receiver, px12);
        return f.a;
    }
}
