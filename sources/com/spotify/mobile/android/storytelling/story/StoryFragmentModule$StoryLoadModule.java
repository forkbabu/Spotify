package com.spotify.mobile.android.storytelling.story;

import com.spotify.mobile.android.storytelling.common.b;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class StoryFragmentModule$StoryLoadModule {
    public static final nmf<Integer, z<hx1>> a(b bVar) {
        h.e(bVar, "storiesProvider");
        return new StoryFragmentModule$StoryLoadModule$provideStoryProvider$1(bVar);
    }
}
