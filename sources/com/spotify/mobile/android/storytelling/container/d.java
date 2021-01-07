package com.spotify.mobile.android.storytelling.container;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.h;

public final class d implements fjf<Lifecycle> {
    private final wlf<StorytellingContainerFragment> a;

    public d(wlf<StorytellingContainerFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        StorytellingContainerFragment storytellingContainerFragment = this.a.get();
        h.e(storytellingContainerFragment, "fragment");
        Lifecycle A = storytellingContainerFragment.A();
        h.d(A, "fragment.lifecycle");
        return A;
    }
}
