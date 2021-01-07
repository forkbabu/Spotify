package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.tasks.h;
import com.google.firebase.iid.t;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MessengerIpcClient {
    private static MessengerIpcClient e;
    private final Context a;
    private final ScheduledExecutorService b;
    private b c = new b(null);
    private int d = 1;

    public static class RequestFailedException extends Exception {
        private final int errorCode;

        public RequestFailedException(int i, String str) {
            super(str);
            this.errorCode = i;
        }
    }

    /* access modifiers changed from: private */
    public class b implements ServiceConnection {
        int a = 0;
        final Messenger b = new Messenger(new du(Looper.getMainLooper(), new y(this)));
        c c;
        final Queue<e<?>> f = new ArrayDeque();
        final SparseArray<e<?>> n = new SparseArray<>();

        b(a aVar) {
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean a(e<?> eVar) {
            int i = this.a;
            if (i == 0) {
                this.f.add(eVar);
                d();
                return true;
            } else if (i == 1) {
                this.f.add(eVar);
                return true;
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        int i2 = this.a;
                        StringBuilder sb = new StringBuilder(26);
                        sb.append("Unknown state: ");
                        sb.append(i2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                return false;
            } else {
                this.f.add(eVar);
                MessengerIpcClient.this.b.execute(new b0(this));
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void b(RequestFailedException requestFailedException) {
            for (e<?> eVar : this.f) {
                eVar.a(requestFailedException);
            }
            this.f.clear();
            for (int i = 0; i < this.n.size(); i++) {
                this.n.valueAt(i).a(requestFailedException);
            }
            this.n.clear();
        }

        /* access modifiers changed from: package-private */
        public synchronized void c(int i, String str) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Disconnected: ".concat(valueOf);
                } else {
                    new String("Disconnected: ");
                }
            }
            int i2 = this.a;
            if (i2 == 0) {
                throw new IllegalStateException();
            } else if (i2 == 1 || i2 == 2) {
                Log.isLoggable("MessengerIpcClient", 2);
                this.a = 4;
                sr.b().c(MessengerIpcClient.this.a, this);
                b(new RequestFailedException(i, str));
            } else if (i2 == 3) {
                this.a = 4;
            } else if (i2 != 4) {
                int i3 = this.a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            g.o(this.a == 0);
            Log.isLoggable("MessengerIpcClient", 2);
            this.a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (!sr.b().a(MessengerIpcClient.this.a, intent, this, 1)) {
                c(0, "Unable to bind to service");
            } else {
                MessengerIpcClient.this.b.schedule(new z(this), 30, TimeUnit.SECONDS);
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void e() {
            if (this.a == 2 && this.f.isEmpty() && this.n.size() == 0) {
                Log.isLoggable("MessengerIpcClient", 2);
                this.a = 3;
                sr.b().c(MessengerIpcClient.this.a, this);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.isLoggable("MessengerIpcClient", 2);
            MessengerIpcClient.this.b.execute(new a0(this, iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.isLoggable("MessengerIpcClient", 2);
            MessengerIpcClient.this.b.execute(new c0(this));
        }
    }

    static class c {
        private final Messenger a;
        private final i b;

        c(IBinder iBinder) {
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if ("android.os.IMessenger".equals(interfaceDescriptor)) {
                this.a = new Messenger(iBinder);
                this.b = null;
            } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
                this.b = new i(iBinder);
                this.a = null;
            } else {
                String valueOf = String.valueOf(interfaceDescriptor);
                if (valueOf.length() != 0) {
                    "Invalid interface descriptor: ".concat(valueOf);
                } else {
                    new String("Invalid interface descriptor: ");
                }
                throw new RemoteException();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(Message message) {
            Messenger messenger = this.a;
            if (messenger != null) {
                messenger.send(message);
                return;
            }
            i iVar = this.b;
            if (iVar != null) {
                Messenger messenger2 = iVar.a;
                if (messenger2 != null) {
                    messenger2.send(message);
                } else {
                    ((t.a) iVar.b).T(message);
                }
            } else {
                throw new IllegalStateException("Both messengers are null");
            }
        }
    }

    private static class d extends e<Void> {
        d(int i, int i2, Bundle bundle) {
            super(i, i2, bundle);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.firebase.iid.MessengerIpcClient.e
        public void c(Bundle bundle) {
            if (bundle.getBoolean("ack", false)) {
                b(null);
            } else {
                a(new RequestFailedException(4, "Invalid response to one way request"));
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.firebase.iid.MessengerIpcClient.e
        public boolean d() {
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static abstract class e<T> {
        final int a;
        final h<T> b = new h<>();
        final int c;
        final Bundle d;

        e(int i, int i2, Bundle bundle) {
            this.a = i;
            this.c = i2;
            this.d = bundle;
        }

        /* access modifiers changed from: package-private */
        public void a(RequestFailedException requestFailedException) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(this);
                String valueOf2 = String.valueOf(requestFailedException);
                valueOf.length();
                valueOf2.length();
            }
            this.b.b(requestFailedException);
        }

        /* access modifiers changed from: package-private */
        public void b(T t) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(this);
                String valueOf2 = String.valueOf(t);
                valueOf.length();
                valueOf2.length();
            }
            this.b.c(t);
        }

        /* access modifiers changed from: package-private */
        public abstract void c(Bundle bundle);

        /* access modifiers changed from: package-private */
        public abstract boolean d();

        public String toString() {
            int i = this.c;
            int i2 = this.a;
            boolean d2 = d();
            StringBuilder sb = new StringBuilder(55);
            sb.append("Request { what=");
            sb.append(i);
            sb.append(" id=");
            sb.append(i2);
            sb.append(" oneWay=");
            sb.append(d2);
            sb.append("}");
            return sb.toString();
        }
    }

    private static class f extends e<Bundle> {
        f(int i, int i2, Bundle bundle) {
            super(i, i2, bundle);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.firebase.iid.MessengerIpcClient.e
        public void c(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("data");
            if (bundle2 == null) {
                bundle2 = Bundle.EMPTY;
            }
            b(bundle2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.firebase.iid.MessengerIpcClient.e
        public boolean d() {
            return false;
        }
    }

    MessengerIpcClient(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized MessengerIpcClient c(Context context) {
        MessengerIpcClient messengerIpcClient;
        synchronized (MessengerIpcClient.class) {
            if (e == null) {
                e = new MessengerIpcClient(context, zt.a().a(1, new tr("MessengerIpcClient"), 2));
            }
            messengerIpcClient = e;
        }
        return messengerIpcClient;
    }

    private synchronized <T> com.google.android.gms.tasks.g<T> e(e<T> eVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String.valueOf(eVar).length();
        }
        if (!this.c.a(eVar)) {
            b bVar = new b(null);
            this.c = bVar;
            bVar.a(eVar);
        }
        return eVar.b.a();
    }

    public com.google.android.gms.tasks.g<Void> d(int i, Bundle bundle) {
        int i2;
        synchronized (this) {
            i2 = this.d;
            this.d = i2 + 1;
        }
        return e(new d(i2, i, bundle));
    }

    public com.google.android.gms.tasks.g<Bundle> f(int i, Bundle bundle) {
        int i2;
        synchronized (this) {
            i2 = this.d;
            this.d = i2 + 1;
        }
        return e(new f(i2, i, bundle));
    }
}
