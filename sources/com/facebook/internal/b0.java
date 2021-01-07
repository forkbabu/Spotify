package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

public abstract class b0 implements ServiceConnection {
    private final Context a;
    private final Handler b;
    private b c;
    private boolean f;
    private Messenger n;
    private int o;
    private int p;
    private final String q;
    private final int r;

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!uf.c(this)) {
                try {
                    b0.this.c(message);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    public interface b {
        void a(Bundle bundle);
    }

    public b0(Context context, int i, int i2, int i3, String str) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.o = i;
        this.p = i2;
        this.q = str;
        this.r = i3;
        this.b = new a();
    }

    private void a(Bundle bundle) {
        if (this.f) {
            this.f = false;
            b bVar = this.c;
            if (bVar != null) {
                bVar.a(bundle);
            }
        }
    }

    public void b() {
        this.f = false;
    }

    /* access modifiers changed from: protected */
    public void c(Message message) {
        if (message.what == this.p) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                a(null);
            } else {
                a(data);
            }
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void d(Bundle bundle);

    public void e(b bVar) {
        this.c = bVar;
    }

    public boolean f() {
        Intent g;
        if (this.f || a0.o(this.r) == -1 || (g = a0.g(this.a)) == null) {
            return false;
        }
        this.f = true;
        this.a.bindService(g, this, 1);
        return true;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.n = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.q);
        d(bundle);
        Message obtain = Message.obtain((Handler) null, this.o);
        obtain.arg1 = this.r;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.b);
        try {
            this.n.send(obtain);
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.n = null;
        try {
            this.a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
