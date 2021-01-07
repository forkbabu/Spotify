package com.spotify.libs.instrumentation.performance;

import android.view.Choreographer;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;

public final /* synthetic */ class e implements Choreographer.FrameCallback {
    public final /* synthetic */ ViewLoadingTracker.c a;

    public /* synthetic */ e(ViewLoadingTracker.c cVar) {
        this.a = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        ViewLoadingTracker.this.p();
    }
}
