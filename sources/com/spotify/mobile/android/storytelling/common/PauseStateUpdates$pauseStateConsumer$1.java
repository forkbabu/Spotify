package com.spotify.mobile.android.storytelling.common;

import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class PauseStateUpdates$pauseStateConsumer$1 extends Lambda implements nmf<PauseState, f> {
    final /* synthetic */ PauseStateUpdates this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PauseStateUpdates$pauseStateConsumer$1(PauseStateUpdates pauseStateUpdates) {
        super(1);
        this.this$0 = pauseStateUpdates;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(PauseState pauseState) {
        PauseState pauseState2 = pauseState;
        h.e(pauseState2, "pauseState");
        PauseStateUpdates.a(this.this$0).onNext(pauseState2);
        return f.a;
    }
}
