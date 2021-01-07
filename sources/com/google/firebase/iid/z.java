package com.google.firebase.iid;

import com.google.firebase.iid.MessengerIpcClient;

final /* synthetic */ class z implements Runnable {
    private final MessengerIpcClient.b a;

    z(MessengerIpcClient.b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessengerIpcClient.b bVar = this.a;
        synchronized (bVar) {
            if (bVar.a == 1) {
                bVar.c(1, "Timed out while binding");
            }
        }
    }
}
