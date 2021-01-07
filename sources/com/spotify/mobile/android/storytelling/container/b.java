package com.spotify.mobile.android.storytelling.container;

import com.spotify.mobile.android.storytelling.common.g;
import kotlin.jvm.internal.h;

public final class b implements fjf<nmf<Integer, g>> {
    private final wlf<com.spotify.mobile.android.storytelling.common.b> a;

    public b(wlf<com.spotify.mobile.android.storytelling.common.b> wlf) {
        this.a = wlf;
    }

    public static nmf<Integer, g> a(com.spotify.mobile.android.storytelling.common.b bVar) {
        h.e(bVar, "storiesProvider");
        return new StorytellingContainerFragmentModule$StoriesLoadModule$provideStoryStateProvider$1(bVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        com.spotify.mobile.android.storytelling.common.b bVar = this.a.get();
        h.e(bVar, "storiesProvider");
        return new StorytellingContainerFragmentModule$StoriesLoadModule$provideStoryStateProvider$1(bVar);
    }
}
