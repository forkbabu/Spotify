package com.google.firebase.iid;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.firebase.iid.MessengerIpcClient;

final /* synthetic */ class y implements Handler.Callback {
    private final MessengerIpcClient.b a;

    y(MessengerIpcClient.b bVar) {
        this.a = bVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        MessengerIpcClient.e<?> eVar;
        MessengerIpcClient.b bVar = this.a;
        bVar.getClass();
        int i = message.arg1;
        Log.isLoggable("MessengerIpcClient", 3);
        synchronized (bVar) {
            eVar = bVar.n.get(i);
            if (eVar == null) {
                return true;
            }
            bVar.n.remove(i);
            bVar.e();
        }
        Bundle data = message.getData();
        if (data.getBoolean("unsupported", false)) {
            eVar.a(new MessengerIpcClient.RequestFailedException(4, "Not supported by GmsCore"));
            return true;
        }
        eVar.c(data);
        return true;
    }
}
