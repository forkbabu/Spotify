package com.spotify.rxjava2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.reactivex.t;

/* access modifiers changed from: package-private */
public class m implements ServiceConnection {
    final /* synthetic */ t a;

    m(n nVar, t tVar) {
        this.a = tVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            this.a.onNext(iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.a.onComplete();
    }
}
