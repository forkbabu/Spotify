package com.spotify.mobile.android.storytelling.story.view;

import com.spotify.mobile.android.storytelling.common.PauseState;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class StoryViews$diffuser$4 extends FunctionReferenceImpl implements nmf<PauseState, f> {
    StoryViews$diffuser$4(StoryViews storyViews) {
        super(1, storyViews, StoryViews.class, "updatePauseState", "updatePauseState(Lcom/spotify/mobile/android/storytelling/common/PauseState;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(PauseState pauseState) {
        PauseState pauseState2 = pauseState;
        h.e(pauseState2, "p1");
        ((StoryViews) this.receiver).f(pauseState2);
        return f.a;
    }
}
