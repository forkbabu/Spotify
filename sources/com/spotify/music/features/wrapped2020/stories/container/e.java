package com.spotify.music.features.wrapped2020.stories.container;

import kotlin.jvm.internal.h;

public final class e implements fjf<Boolean> {
    private final wlf<Wrapped2020StoriesActivity> a;

    public e(wlf<Wrapped2020StoriesActivity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Wrapped2020StoriesActivity wrapped2020StoriesActivity = this.a.get();
        h.e(wrapped2020StoriesActivity, "activity");
        return Boolean.valueOf(wrapped2020StoriesActivity.getIntent().getBooleanExtra("use_sample_response", false));
    }
}
