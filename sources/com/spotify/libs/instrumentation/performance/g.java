package com.spotify.libs.instrumentation.performance;

import android.view.View;

public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ ViewLoadingTracker a;
    public final /* synthetic */ View b;

    public /* synthetic */ g(ViewLoadingTracker viewLoadingTracker, View view) {
        this.a = viewLoadingTracker;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.n(this.b);
    }
}
