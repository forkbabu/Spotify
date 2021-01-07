package com.spotify.mobile.android.storytelling.common;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class StoryStartUpdates {
    private final PublishSubject<kx1> a;

    public StoryStartUpdates() {
        PublishSubject<kx1> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create<StoryInfo>()");
        this.a = h1;
    }

    public final nmf<kx1, f> b() {
        return new StoryStartUpdates$storyStartConsumer$1(this);
    }

    public final s<kx1> c() {
        return this.a;
    }
}
