package com.spotify.rxjava2;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.reactivex.s;
import io.reactivex.t;

public final class n {
    private final fg0 a;

    public n(fg0 fg0) {
        this.a = fg0;
    }

    public s<IBinder> a(Intent intent, String str) {
        return s.y(new c(this, intent, str));
    }

    public /* synthetic */ void b(Intent intent, String str, t tVar) {
        z42.a("Must subscribe to service binding on main thread!");
        m mVar = new m(this, tVar);
        this.a.a(intent, mVar, str);
        tVar.e(new b(this, mVar, str));
    }

    public /* synthetic */ void c(ServiceConnection serviceConnection, String str) {
        this.a.c(serviceConnection, str);
    }
}
