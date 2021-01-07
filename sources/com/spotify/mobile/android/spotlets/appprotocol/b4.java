package com.spotify.mobile.android.spotlets.appprotocol;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.service.h;
import com.spotify.mobile.android.spotlets.appprotocol.u3;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

public class b4 implements u3, IBinder.DeathRecipient {
    private final Messenger a = new Messenger(new b(this));
    private final Messenger b;
    private u3.a c;
    private a f;

    public interface a {
    }

    private static class b extends Handler {
        private final WeakReference<b4> a;

        public b(b4 b4Var) {
            this.a = new WeakReference<>(b4Var);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            b4 b4Var = this.a.get();
            if (b4Var != null) {
                b4.c(b4Var, message.getData().getByteArray("MESSAGE_BODY"));
            }
        }
    }

    public b4(Messenger messenger) {
        this.b = messenger;
    }

    static void c(b4 b4Var, byte[] bArr) {
        u3.a aVar = b4Var.c;
        if (aVar != null) {
            ((i4) aVar).p(bArr.length, bArr);
        }
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.u3
    public void a(u3.a aVar) {
        this.c = aVar;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.u3
    public void b(int i, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("MESSAGE_BODY", bArr);
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.setData(bundle);
        try {
            this.b.send(obtain);
        } catch (RemoteException unused) {
            Logger.d("Could not send the message to the remote client", new Object[0]);
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        a aVar = this.f;
        if (aVar != null) {
            h hVar = (h) aVar;
            hVar.a.h(hVar.b);
        }
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.u3
    public void close() {
        try {
            this.b.getBinder().unlinkToDeath(this, 0);
        } catch (NoSuchElementException unused) {
            Logger.d("Trying to close a session that has never been started.", new Object[0]);
            binderDied();
        }
    }

    public void d(boolean z) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        if (z) {
            obtain.replyTo = this.a;
        }
        try {
            this.b.send(obtain);
        } catch (RemoteException unused) {
            Logger.d("Could not send the message to the remote client", new Object[0]);
        }
    }

    public void e(a aVar) {
        this.f = aVar;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.u3
    public void start() {
        try {
            this.b.getBinder().linkToDeath(this, 0);
        } catch (RemoteException unused) {
            Logger.d("Trying to create a session but client binder is already dead.", new Object[0]);
            binderDied();
        }
    }
}
