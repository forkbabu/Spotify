package com.spotify.mobile.android.storytelling.common;

import io.reactivex.s;
import io.reactivex.subjects.a;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class PauseStateUpdates {
    private final a<PauseState> a;

    public PauseStateUpdates() {
        a<PauseState> i1 = a.i1(PauseState.RESUMED);
        h.d(i1, "BehaviorSubject.createDefault(PauseState.RESUMED)");
        this.a = i1;
    }

    public final s<PauseState> b() {
        return this.a;
    }

    public final nmf<PauseState, f> c() {
        return new PauseStateUpdates$pauseStateConsumer$1(this);
    }
}
