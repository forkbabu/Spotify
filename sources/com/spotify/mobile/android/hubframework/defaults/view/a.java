package com.spotify.mobile.android.hubframework.defaults.view;

import android.widget.FrameLayout;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ FrameLayout a;

    public /* synthetic */ a(FrameLayout frameLayout) {
        this.a = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.performClick();
    }
}
