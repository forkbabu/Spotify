package com.spotify.music.features.followfeed.mobius;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.h;

public final class b {
    private final PublishSubject<o25> a;

    public b() {
        PublishSubject<o25> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create<FeedEvent>()");
        this.a = h1;
    }

    public final void a(o25 o25) {
        h.e(o25, "event");
        this.a.onNext(o25);
    }

    public final s<o25> b() {
        return this.a;
    }
}
