package com.spotify.mobile.android.ui.view;

public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ MainLayout a;

    public /* synthetic */ n(MainLayout mainLayout) {
        this.a = mainLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.requestLayout();
    }
}
