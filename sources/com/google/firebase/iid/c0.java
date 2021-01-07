package com.google.firebase.iid;

import com.google.firebase.iid.MessengerIpcClient;

final /* synthetic */ class c0 implements Runnable {
    private final MessengerIpcClient.b a;

    c0(MessengerIpcClient.b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(2, "Service disconnected");
    }
}
