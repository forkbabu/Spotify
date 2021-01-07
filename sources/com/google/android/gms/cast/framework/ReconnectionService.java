package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.internal.cast.h;

public class ReconnectionService extends Service {
    private static final b b = new b("ReconnectionService");
    private g0 a;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            return this.a.G(intent);
        } catch (RemoteException e) {
            b.b(e, "Unable to call %s on %s.", "onBind", g0.class.getSimpleName());
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        a e = a.e(this);
        g0 d = h.d(this, e.c().g(), e.k().a());
        this.a = d;
        try {
            d.q();
        } catch (RemoteException e2) {
            b.b(e2, "Unable to call %s on %s.", "onCreate", g0.class.getSimpleName());
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            this.a.onDestroy();
        } catch (RemoteException e) {
            b.b(e, "Unable to call %s on %s.", "onDestroy", g0.class.getSimpleName());
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            return this.a.p3(intent, i, i2);
        } catch (RemoteException e) {
            b.b(e, "Unable to call %s on %s.", "onStartCommand", g0.class.getSimpleName());
            return 1;
        }
    }
}
