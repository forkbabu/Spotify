package com.google.firebase.iid;

import com.google.firebase.iid.MessengerIpcClient;

final /* synthetic */ class d0 implements Runnable {
    private final MessengerIpcClient.b a;
    private final MessengerIpcClient.e b;

    d0(MessengerIpcClient.b bVar, MessengerIpcClient.e eVar) {
        this.a = bVar;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessengerIpcClient.b bVar = this.a;
        MessengerIpcClient.e eVar = this.b;
        bVar.getClass();
        int i = eVar.a;
        synchronized (bVar) {
            MessengerIpcClient.e<?> eVar2 = bVar.n.get(i);
            if (eVar2 != null) {
                bVar.n.remove(i);
                eVar2.a(new MessengerIpcClient.RequestFailedException(3, "Timed out waiting for response"));
                bVar.e();
            }
        }
    }
}
