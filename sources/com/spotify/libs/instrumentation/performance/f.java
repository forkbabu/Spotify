package com.spotify.libs.instrumentation.performance;

import android.view.Choreographer;

public final /* synthetic */ class f implements Choreographer.FrameCallback {
    public final /* synthetic */ ViewLoadingTracker a;

    public /* synthetic */ f(ViewLoadingTracker viewLoadingTracker) {
        this.a = viewLoadingTracker;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.o(j);
    }
}
