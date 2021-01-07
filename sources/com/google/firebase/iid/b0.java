package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.iid.MessengerIpcClient;
import java.util.concurrent.TimeUnit;

final /* synthetic */ class b0 implements Runnable {
    private final MessengerIpcClient.b a;

    b0(MessengerIpcClient.b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessengerIpcClient.e<?> poll;
        MessengerIpcClient.b bVar = this.a;
        while (true) {
            synchronized (bVar) {
                if (bVar.a == 2) {
                    if (bVar.f.isEmpty()) {
                        bVar.e();
                        return;
                    }
                    poll = bVar.f.poll();
                    bVar.n.put(poll.a, poll);
                    MessengerIpcClient.b(MessengerIpcClient.this).schedule(new d0(bVar, poll), 30, TimeUnit.SECONDS);
                } else {
                    return;
                }
            }
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String.valueOf(poll).length();
            }
            Context a2 = MessengerIpcClient.a(MessengerIpcClient.this);
            Messenger messenger = bVar.b;
            Message obtain = Message.obtain();
            obtain.what = poll.c;
            obtain.arg1 = poll.a;
            obtain.replyTo = messenger;
            Bundle bundle = new Bundle();
            bundle.putBoolean("oneWay", poll.d());
            bundle.putString("pkg", a2.getPackageName());
            bundle.putBundle("data", poll.d);
            obtain.setData(bundle);
            try {
                bVar.c.a(obtain);
            } catch (RemoteException e) {
                bVar.c(2, e.getMessage());
            }
        }
    }
}
