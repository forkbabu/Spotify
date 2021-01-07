package com.google.firebase.iid;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.firebase.iid.MessengerIpcClient;

final /* synthetic */ class a0 implements Runnable {
    private final MessengerIpcClient.b a;
    private final IBinder b;

    a0(MessengerIpcClient.b bVar, IBinder iBinder) {
        this.a = bVar;
        this.b = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessengerIpcClient.b bVar = this.a;
        IBinder iBinder = this.b;
        synchronized (bVar) {
            if (iBinder == null) {
                bVar.c(0, "Null service connection");
                return;
            }
            try {
                bVar.c = new MessengerIpcClient.c(iBinder);
                bVar.a = 2;
                MessengerIpcClient.b(MessengerIpcClient.this).execute(new b0(bVar));
            } catch (RemoteException e) {
                bVar.c(0, e.getMessage());
            }
        }
    }
}
