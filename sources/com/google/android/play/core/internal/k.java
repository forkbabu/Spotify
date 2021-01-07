package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* access modifiers changed from: package-private */
public final class k implements ServiceConnection {
    final /* synthetic */ l a;

    /* synthetic */ k(l lVar) {
        this.a = lVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.b.f("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.h(new i(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.b.f("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.h(new j(this));
    }
}
