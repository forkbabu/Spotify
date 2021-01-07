package com.spotify.mobile.android.storytelling.story;

import com.spotify.mobile.android.storytelling.common.b;
import io.reactivex.z;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* access modifiers changed from: package-private */
public final /* synthetic */ class StoryFragmentModule$StoryLoadModule$provideStoryProvider$1 extends FunctionReferenceImpl implements nmf<Integer, z<hx1>> {
    StoryFragmentModule$StoryLoadModule$provideStoryProvider$1(b bVar) {
        super(1, bVar, b.class, "retrieveStory", "retrieveStory(I)Lio/reactivex/Single;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public z<hx1> invoke(Integer num) {
        return ((b) this.receiver).g(num.intValue());
    }
}
