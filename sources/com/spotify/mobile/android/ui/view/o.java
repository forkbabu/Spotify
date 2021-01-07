package com.spotify.mobile.android.ui.view;

import com.spotify.mobile.android.ui.view.MainLayout;

public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ MainLayout.e a;
    public final /* synthetic */ int b;

    public /* synthetic */ o(MainLayout.e eVar, int i) {
        this.a = eVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainLayout.e eVar = this.a;
        MainLayout.a0(MainLayout.this).measure(this.b, z42.B());
    }
}
