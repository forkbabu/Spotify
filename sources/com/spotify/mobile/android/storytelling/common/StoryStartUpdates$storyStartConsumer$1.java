package com.spotify.mobile.android.storytelling.common;

import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class StoryStartUpdates$storyStartConsumer$1 extends Lambda implements nmf<kx1, f> {
    final /* synthetic */ StoryStartUpdates this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoryStartUpdates$storyStartConsumer$1(StoryStartUpdates storyStartUpdates) {
        super(1);
        this.this$0 = storyStartUpdates;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(kx1 kx1) {
        kx1 kx12 = kx1;
        h.e(kx12, "storyInfo");
        StoryStartUpdates.a(this.this$0).onNext(kx12);
        return f.a;
    }
}
