package com.google.android.gms.wearable;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.c;
import java.util.List;

public class g extends Service implements b {
    private ComponentName a;
    private c b;
    private IBinder c;
    private Intent f;
    private Looper n;
    private final Object o = new Object();
    private wv p = new wv(new a(null));

    class a extends c.b {
        a(h hVar) {
        }

        @Override // com.google.android.gms.wearable.c.b
        public final void a(c.a aVar, int i, int i2) {
            g.this.f();
        }

        @Override // com.google.android.gms.wearable.c.b
        public final void b(c.a aVar) {
            g.this.g();
        }

        @Override // com.google.android.gms.wearable.c.b
        public final void c(c.a aVar, int i, int i2) {
            g.this.k();
        }

        @Override // com.google.android.gms.wearable.c.b
        public final void d(c.a aVar, int i, int i2) {
            g.this.n();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements ServiceConnection {
        b(g gVar) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* access modifiers changed from: package-private */
    public final class c extends Handler {
        private boolean a;
        private final b b;

        c(Looper looper) {
            super(looper);
            this.b = new b(g.this);
        }

        private final synchronized void a(String str) {
            if (this.a) {
                if (Log.isLoggable("WearableLS", 2)) {
                    String valueOf = String.valueOf(g.this.a);
                    str.length();
                    valueOf.length();
                }
                try {
                    g.this.unbindService(this.b);
                } catch (RuntimeException e) {
                    Log.e("WearableLS", "Exception when unbinding from local service", e);
                }
                this.a = false;
            }
        }

        @Override // android.os.Handler
        public final void dispatchMessage(Message message) {
            synchronized (this) {
                if (!this.a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        String.valueOf(g.this.a).length();
                    }
                    g gVar = g.this;
                    gVar.bindService(gVar.f, this.b, 1);
                    this.a = true;
                }
            }
            try {
                super.dispatchMessage(message);
            } finally {
                if (!hasMessages(0)) {
                    a("dispatch");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final class d extends fw {
        private volatile int a = -1;

        d(h hVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x006e A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final boolean C3(java.lang.Runnable r5, java.lang.String r6, java.lang.Object r7) {
            /*
                r4 = this;
                java.lang.String r0 = "WearableLS"
                r1 = 3
                boolean r0 = android.util.Log.isLoggable(r0, r1)
                r2 = 1
                r3 = 0
                if (r0 == 0) goto L_0x0023
                java.lang.String r0 = "%s: %s %s"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r6
                com.google.android.gms.wearable.g r6 = com.google.android.gms.wearable.g.this
                android.content.ComponentName r6 = com.google.android.gms.wearable.g.q(r6)
                java.lang.String r6 = r6.toString()
                r1[r2] = r6
                r6 = 2
                r1[r6] = r7
                java.lang.String.format(r0, r1)
            L_0x0023:
                int r6 = android.os.Binder.getCallingUid()
                int r7 = r4.a
                if (r6 != r7) goto L_0x002c
                goto L_0x0051
            L_0x002c:
                com.google.android.gms.wearable.g r7 = com.google.android.gms.wearable.g.this
                kw r7 = defpackage.kw.a(r7)
                java.lang.String r0 = "com.google.android.wearable.app.cn"
                boolean r7 = r7.d(r0)
                if (r7 == 0) goto L_0x0047
                com.google.android.gms.wearable.g r7 = com.google.android.gms.wearable.g.this
                java.lang.String r0 = "com.google.android.wearable.app.cn"
                boolean r7 = com.google.android.gms.cast.framework.f.h(r7, r6, r0)
                if (r7 == 0) goto L_0x0047
                r4.a = r6
                goto L_0x0051
            L_0x0047:
                com.google.android.gms.wearable.g r7 = com.google.android.gms.wearable.g.this
                boolean r7 = com.google.android.gms.cast.framework.f.e(r7, r6)
                if (r7 == 0) goto L_0x0053
                r4.a = r6
            L_0x0051:
                r6 = 1
                goto L_0x006c
            L_0x0053:
                java.lang.String r7 = "WearableLS"
                r0 = 57
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Caller is not GooglePlayServices; caller UID: "
                r1.append(r0)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                android.util.Log.e(r7, r6)
                r6 = 0
            L_0x006c:
                if (r6 != 0) goto L_0x006f
                return r3
            L_0x006f:
                com.google.android.gms.wearable.g r6 = com.google.android.gms.wearable.g.this
                java.lang.Object r6 = com.google.android.gms.wearable.g.t(r6)
                monitor-enter(r6)
                com.google.android.gms.wearable.g r7 = com.google.android.gms.wearable.g.this     // Catch:{ all -> 0x0086 }
                r7.getClass()     // Catch:{ all -> 0x0086 }
                com.google.android.gms.wearable.g r7 = com.google.android.gms.wearable.g.this     // Catch:{ all -> 0x0086 }
                com.google.android.gms.wearable.g$c r7 = com.google.android.gms.wearable.g.u(r7)     // Catch:{ all -> 0x0086 }
                r7.post(r5)     // Catch:{ all -> 0x0086 }
                monitor-exit(r6)     // Catch:{ all -> 0x0086 }
                return r2
            L_0x0086:
                r5 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x0086 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.g.d.C3(java.lang.Runnable, java.lang.String, java.lang.Object):boolean");
        }

        @Override // defpackage.ew
        public final void B3(List<iw> list) {
            C3(new m(this, list), "onConnectedNodes", list);
        }

        @Override // defpackage.ew
        public final void K2(gw gwVar) {
            C3(new j(this, gwVar), "onMessageReceived", gwVar);
        }

        @Override // defpackage.ew
        public final void L1(xv xvVar) {
            C3(new q(this, xvVar), "onChannelEvent", xvVar);
        }

        @Override // defpackage.ew
        public final void V(DataHolder dataHolder) {
            i iVar = new i(this, dataHolder);
            try {
                String valueOf = String.valueOf(dataHolder);
                int count = dataHolder.getCount();
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append(valueOf);
                sb.append(", rows=");
                sb.append(count);
                if (C3(iVar, "onDataItemChanged", sb.toString())) {
                }
            } finally {
                dataHolder.close();
            }
        }

        @Override // defpackage.ew
        public final void a3(iw iwVar) {
            C3(new l(this, iwVar), "onPeerDisconnected", iwVar);
        }

        @Override // defpackage.ew
        public final void i0(iw iwVar) {
            C3(new k(this, iwVar), "onPeerConnected", iwVar);
        }

        @Override // defpackage.ew
        public final void t2(tv tvVar) {
            C3(new n(this, tvVar), "onConnectedCapabilityChanged", tvVar);
        }

        @Override // defpackage.ew
        public final void u1(nw nwVar) {
            C3(new o(this, nwVar), "onNotificationReceived", nwVar);
        }

        @Override // defpackage.ew
        public final void y0(lw lwVar) {
            C3(new p(this, lwVar), "onEntityUpdate", lwVar);
        }
    }

    @Override // com.google.android.gms.wearable.b
    public void a(a aVar, int i, int i2) {
    }

    @Override // com.google.android.gms.wearable.b
    public void b(a aVar, int i, int i2) {
    }

    @Override // com.google.android.gms.wearable.b
    public void c(a aVar) {
    }

    @Override // com.google.android.gms.wearable.b
    public void d(a aVar, int i, int i2) {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    /* JADX WARN: Incorrect args count in method signature: (Ljava/util/List<Ljava/lang/Object;>;)V */
    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public void l(f fVar) {
        throw null;
    }

    public void m() {
    }

    public void n() {
    }

    public void o() {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction())) {
            return this.c;
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            String.valueOf(this.a).length();
        }
        if (this.n == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.n = handlerThread.getLooper();
        }
        this.b = new c(this.n);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.f = intent;
        intent.setComponent(this.a);
        this.c = new d(null);
    }

    public void p() {
    }
}
