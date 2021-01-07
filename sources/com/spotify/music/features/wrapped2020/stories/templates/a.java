package com.spotify.music.features.wrapped2020.stories.templates;

import kotlin.jvm.internal.h;

public final class a implements fjf<cmf<fx1>> {
    private final wlf<b> a;

    public a(wlf<b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        b bVar = this.a.get();
        h.e(bVar, "wrappedStoriesLoader");
        return new StoriesModule$provideStoriesLoader$1(bVar);
    }
}
