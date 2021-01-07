package com.spotify.libs.instrumentation.performance;

import android.view.View;
import android.view.ViewTreeObserver;

class s implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ ViewLoadingTracker b;

    s(ViewLoadingTracker viewLoadingTracker, View view) {
        this.b = viewLoadingTracker;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ViewLoadingTracker.e(this.b);
    }
}
