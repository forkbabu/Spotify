package com.spotify.mobile.android.ui.view;

import com.spotify.mobile.android.ui.view.MainLayout;

public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ MainLayout.e a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int f;

    public /* synthetic */ p(MainLayout.e eVar, int i, int i2, int i3) {
        this.a = eVar;
        this.b = i;
        this.c = i2;
        this.f = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainLayout.e eVar = this.a;
        MainLayout.d0(MainLayout.this, this.b, this.c, this.f);
    }
}
