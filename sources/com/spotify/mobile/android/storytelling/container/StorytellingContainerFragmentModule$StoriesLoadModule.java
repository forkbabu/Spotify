package com.spotify.mobile.android.storytelling.container;

import com.spotify.mobile.android.storytelling.common.b;
import io.reactivex.a;
import kotlin.jvm.internal.h;

public final class StorytellingContainerFragmentModule$StoriesLoadModule {
    public static final nmf<Integer, a> a(b bVar) {
        h.e(bVar, "storiesProvider");
        return new StorytellingContainerFragmentModule$StoriesLoadModule$provideStoryPreLoader$1(bVar);
    }
}
