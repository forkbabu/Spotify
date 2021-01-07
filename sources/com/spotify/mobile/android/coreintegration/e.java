package com.spotify.mobile.android.coreintegration;

import com.spotify.base.java.logging.Logger;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ t a;

    public /* synthetic */ e(t tVar) {
        this.a = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = this.a;
        tVar.getClass();
        Logger.g("Auto shutdown triggered", new Object[0]);
        tVar.f();
    }
}
