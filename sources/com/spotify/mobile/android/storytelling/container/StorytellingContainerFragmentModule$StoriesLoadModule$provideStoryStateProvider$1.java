package com.spotify.mobile.android.storytelling.container;

import com.spotify.mobile.android.storytelling.common.b;
import com.spotify.mobile.android.storytelling.common.g;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* access modifiers changed from: package-private */
public final /* synthetic */ class StorytellingContainerFragmentModule$StoriesLoadModule$provideStoryStateProvider$1 extends FunctionReferenceImpl implements nmf<Integer, g> {
    StorytellingContainerFragmentModule$StoriesLoadModule$provideStoryStateProvider$1(b bVar) {
        super(1, bVar, b.class, "storyState", "storyState(I)Lcom/spotify/mobile/android/storytelling/common/StoryState;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public g invoke(Integer num) {
        return ((b) this.receiver).h(num.intValue());
    }
}
