package com.spotify.mobile.android.storytelling.container.view;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* access modifiers changed from: package-private */
public final /* synthetic */ class StorytellingContainerViews$diffuser$4 extends FunctionReferenceImpl implements nmf<Boolean, f> {
    StorytellingContainerViews$diffuser$4(StorytellingContainerViews storytellingContainerViews) {
        super(1, storytellingContainerViews, StorytellingContainerViews.class, "showMuteStatus", "showMuteStatus(Z)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Boolean bool) {
        StorytellingContainerViews.c((StorytellingContainerViews) this.receiver, bool.booleanValue());
        return f.a;
    }
}
