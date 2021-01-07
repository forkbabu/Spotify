package com.spotify.music;

import com.spotify.mobile.android.ui.view.MainLayout;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ MainActivity a;
    public final /* synthetic */ MainLayout b;

    public /* synthetic */ f(MainActivity mainActivity, MainLayout mainLayout) {
        this.a = mainActivity;
        this.b = mainLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.p1(this.b);
    }
}
