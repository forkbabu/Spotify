package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class b<T extends IInterface> {
    private static final com.google.android.gms.common.c[] H = new com.google.android.gms.common.c[0];
    private final int A;
    private final String B;
    private volatile String C;
    private ConnectionResult D;
    private boolean E;
    private volatile t0 F;
    @RecentlyNonNull
    protected AtomicInteger G;
    private volatile String a;
    private c1 b;
    private final Context c;
    private final Looper f;
    private final g n;
    private final com.google.android.gms.common.e o;
    final Handler p;
    private final Object q;
    private final Object r;
    private l s;
    @RecentlyNonNull
    protected c t;
    private T u;
    private final ArrayList<h<?>> v;
    private i w;
    private int x;
    private final a y;
    private final AbstractC0097b z;

    public interface a {
        void g(Bundle bundle);

        void i(int i);
    }

    /* renamed from: com.google.android.gms.common.internal.b$b  reason: collision with other inner class name */
    public interface AbstractC0097b {
        void n(@RecentlyNonNull ConnectionResult connectionResult);
    }

    public interface c {
        void a(@RecentlyNonNull ConnectionResult connectionResult);
    }

    protected class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.b.c
        public void a(@RecentlyNonNull ConnectionResult connectionResult) {
            if (connectionResult.q2()) {
                b bVar = b.this;
                bVar.j(null, bVar.y());
            } else if (b.this.z != null) {
                b.this.z.n(connectionResult);
            }
        }
    }

    public interface e {
        void a();
    }

    private abstract class f extends h<Boolean> {
        private final int d;
        private final Bundle e;

        protected f(int i, Bundle bundle) {
            super(Boolean.TRUE);
            this.d = i;
            this.e = bundle;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.b.h
        public final /* synthetic */ void a(Boolean bool) {
            PendingIntent pendingIntent = null;
            if (this.d != 0) {
                b.this.N(1, null);
                Bundle bundle = this.e;
                if (bundle != null) {
                    pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                }
                f(new ConnectionResult(this.d, pendingIntent));
            } else if (!g()) {
                b.this.N(1, null);
                f(new ConnectionResult(8, null));
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.b.h
        public final void b() {
        }

        /* access modifiers changed from: protected */
        public abstract void f(ConnectionResult connectionResult);

        /* access modifiers changed from: protected */
        public abstract boolean g();
    }

    final class g extends yt {
        public g(Looper looper) {
            super(looper);
        }

        private static boolean a(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
            if (r0 == 5) goto L_0x0031;
         */
        @Override // android.os.Handler
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r7) {
            /*
            // Method dump skipped, instructions count: 292
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.b.g.handleMessage(android.os.Message):void");
        }
    }

    /* access modifiers changed from: protected */
    public abstract class h<TListener> {
        private TListener a;
        private boolean b = false;

        public h(TListener tlistener) {
            this.a = tlistener;
        }

        /* access modifiers changed from: protected */
        public abstract void a(TListener tlistener);

        /* access modifiers changed from: protected */
        public abstract void b();

        public final void c() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.a;
                if (this.b) {
                    String.valueOf(this).length();
                }
            }
            if (tlistener != null) {
                try {
                    a(tlistener);
                } catch (RuntimeException e) {
                    b();
                    throw e;
                }
            } else {
                b();
            }
            synchronized (this) {
                this.b = true;
            }
            d();
        }

        public final void d() {
            synchronized (this) {
                this.a = null;
            }
            synchronized (b.this.v) {
                b.this.v.remove(this);
            }
        }

        public final void e() {
            synchronized (this) {
                this.a = null;
            }
        }
    }

    public final class i implements ServiceConnection {
        private final int a;

        public i(int i) {
            this.a = i;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            l lVar;
            if (iBinder == null) {
                b.O(b.this);
                return;
            }
            synchronized (b.this.r) {
                b bVar = b.this;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof l)) {
                    lVar = new k(iBinder);
                } else {
                    lVar = (l) queryLocalInterface;
                }
                bVar.s = lVar;
            }
            b bVar2 = b.this;
            int i = this.a;
            Handler handler = bVar2.p;
            handler.sendMessage(handler.obtainMessage(7, i, -1, new l(0)));
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (b.this.r) {
                b.this.s = null;
            }
            Handler handler = b.this.p;
            handler.sendMessage(handler.obtainMessage(6, this.a, 1));
        }
    }

    public static final class j extends j.a {
        private b a;
        private final int b;

        public j(b bVar, int i) {
            this.a = bVar;
            this.b = i;
        }

        public final void D3(int i, IBinder iBinder, Bundle bundle) {
            com.google.android.exoplayer2.util.g.k(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.a.F(i, iBinder, bundle, this.b);
            this.a = null;
        }

        public final void E3(int i, IBinder iBinder, t0 t0Var) {
            b bVar = this.a;
            com.google.android.exoplayer2.util.g.k(bVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            if (t0Var != null) {
                b.Q(bVar, t0Var);
                Bundle bundle = t0Var.a;
                com.google.android.exoplayer2.util.g.k(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
                this.a.F(i, iBinder, bundle, this.b);
                this.a = null;
                return;
            }
            throw new NullPointerException("null reference");
        }
    }

    /* access modifiers changed from: protected */
    public final class k extends f {
        private final IBinder g;

        public k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.g = iBinder;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.b.f
        public final void f(ConnectionResult connectionResult) {
            if (b.this.z != null) {
                b.this.z.n(connectionResult);
            }
            b.this.E(connectionResult);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.b.f
        public final boolean g() {
            try {
                IBinder iBinder = this.g;
                com.google.android.exoplayer2.util.g.l(iBinder);
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if (!b.this.A().equals(interfaceDescriptor)) {
                    String A = b.this.A();
                    StringBuilder sb = new StringBuilder(String.valueOf(interfaceDescriptor).length() + String.valueOf(A).length() + 34);
                    sb.append("service descriptor mismatch: ");
                    sb.append(A);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface q = b.this.q(this.g);
                if (q == null) {
                    return false;
                }
                if (!b.R(b.this, 2, 4, q) && !b.R(b.this, 3, 4, q)) {
                    return false;
                }
                b.this.D = null;
                Bundle u = b.this.u();
                if (b.this.y != null) {
                    b.this.y.g(u);
                }
                return true;
            } catch (RemoteException unused) {
                return false;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final class l extends f {
        public l(int i) {
            super(i, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.b.f
        public final void f(ConnectionResult connectionResult) {
            b.this.getClass();
            b.this.t.a(connectionResult);
            b.this.E(connectionResult);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.b.f
        public final boolean g() {
            b.this.t.a(ConnectionResult.n);
            return true;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected b(@androidx.annotation.RecentlyNonNull android.content.Context r10, @androidx.annotation.RecentlyNonNull android.os.Looper r11, int r12, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.b.a r13, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.b.AbstractC0097b r14, @androidx.annotation.RecentlyNonNull java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.g r3 = com.google.android.gms.common.internal.g.a(r10)
            com.google.android.gms.common.e r4 = com.google.android.gms.common.e.b()
            java.lang.String r15 = "null reference"
            if (r13 == 0) goto L_0x001f
            if (r14 == 0) goto L_0x0019
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0019:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r15)
            throw r10
        L_0x001f:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r15)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.b.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.b$a, com.google.android.gms.common.internal.b$b, java.lang.String):void");
    }

    private final String M() {
        String str = this.B;
        return str == null ? this.c.getClass().getName() : str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void N(int i2, T t2) {
        c1 c1Var;
        boolean z2 = false;
        if ((i2 == 4) == (t2 != null)) {
            z2 = true;
        }
        com.google.android.exoplayer2.util.g.c(z2);
        synchronized (this.q) {
            this.x = i2;
            this.u = t2;
            if (i2 == 1) {
                i iVar = this.w;
                if (iVar != null) {
                    g gVar = this.n;
                    String a2 = this.b.a();
                    com.google.android.exoplayer2.util.g.l(a2);
                    String b2 = this.b.b();
                    int c2 = this.b.c();
                    String M = M();
                    boolean d2 = this.b.d();
                    gVar.getClass();
                    gVar.c(new g.a(a2, b2, c2, d2), iVar, M);
                    this.w = null;
                }
            } else if (i2 == 2 || i2 == 3) {
                i iVar2 = this.w;
                if (!(iVar2 == null || (c1Var = this.b) == null)) {
                    String a3 = c1Var.a();
                    String b3 = this.b.b();
                    StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 70 + String.valueOf(b3).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(a3);
                    sb.append(" on ");
                    sb.append(b3);
                    Log.e("GmsClient", sb.toString());
                    g gVar2 = this.n;
                    String a4 = this.b.a();
                    com.google.android.exoplayer2.util.g.l(a4);
                    String b4 = this.b.b();
                    int c3 = this.b.c();
                    String M2 = M();
                    boolean d3 = this.b.d();
                    gVar2.getClass();
                    gVar2.c(new g.a(a4, b4, c3, d3), iVar2, M2);
                    this.G.incrementAndGet();
                }
                i iVar3 = new i(this.G.get());
                this.w = iVar3;
                String B2 = B();
                int i3 = g.c;
                c1 c1Var2 = new c1("com.google.android.gms", B2, false, 4225, D());
                this.b = c1Var2;
                if (!c1Var2.d() || l() >= 17895000) {
                    g gVar3 = this.n;
                    String a5 = this.b.a();
                    com.google.android.exoplayer2.util.g.l(a5);
                    if (!gVar3.b(new g.a(a5, this.b.b(), this.b.c(), this.b.d()), iVar3, M())) {
                        String a6 = this.b.a();
                        String b5 = this.b.b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(a6).length() + 34 + String.valueOf(b5).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(a6);
                        sb2.append(" on ");
                        sb2.append(b5);
                        Log.e("GmsClient", sb2.toString());
                        int i4 = this.G.get();
                        Handler handler = this.p;
                        handler.sendMessage(handler.obtainMessage(7, i4, -1, new l(16)));
                    }
                } else {
                    String valueOf = String.valueOf(this.b.a());
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
            } else if (i2 == 4) {
                if (t2 != null) {
                    System.currentTimeMillis();
                } else {
                    throw new NullPointerException("null reference");
                }
            }
        }
    }

    static void O(b bVar) {
        boolean z2;
        int i2;
        synchronized (bVar.q) {
            z2 = bVar.x == 3;
        }
        if (z2) {
            i2 = 5;
            bVar.E = true;
        } else {
            i2 = 4;
        }
        Handler handler = bVar.p;
        handler.sendMessage(handler.obtainMessage(i2, bVar.G.get(), 16));
    }

    static void Q(b bVar, t0 t0Var) {
        p pVar;
        bVar.F = t0Var;
        if (bVar.I()) {
            d dVar = t0Var.f;
            o b2 = o.b();
            if (dVar == null) {
                pVar = null;
            } else {
                pVar = dVar.q2();
            }
            b2.c(pVar);
        }
    }

    static boolean R(b bVar, int i2, int i3, IInterface iInterface) {
        boolean z2;
        synchronized (bVar.q) {
            if (bVar.x != i2) {
                z2 = false;
            } else {
                bVar.N(i3, iInterface);
                z2 = true;
            }
        }
        return z2;
    }

    static boolean S(b bVar) {
        if (bVar.E || TextUtils.isEmpty(bVar.A()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(bVar.A());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract String A();

    /* access modifiers changed from: protected */
    public abstract String B();

    @RecentlyNullable
    public d C() {
        t0 t0Var = this.F;
        if (t0Var == null) {
            return null;
        }
        return t0Var.f;
    }

    /* access modifiers changed from: protected */
    public boolean D() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void E(@RecentlyNonNull ConnectionResult connectionResult) {
        connectionResult.I1();
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void F(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new k(i2, iBinder, bundle)));
    }

    public void G(@RecentlyNonNull String str) {
        this.C = str;
    }

    public void H(int i2) {
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(6, this.G.get(), i2));
    }

    public boolean I() {
        return false;
    }

    public void a(@RecentlyNonNull String str) {
        this.a = str;
        d();
    }

    @RecentlyNonNull
    public String b() {
        c1 c1Var;
        if (h() && (c1Var = this.b) != null) {
            return c1Var.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void c(@RecentlyNonNull c cVar) {
        com.google.android.exoplayer2.util.g.k(cVar, "Connection progress callbacks cannot be null.");
        this.t = cVar;
        N(2, null);
    }

    @Override // com.google.android.gms.common.api.a.f
    public void d() {
        this.G.incrementAndGet();
        synchronized (this.v) {
            int size = this.v.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.v.get(i2).e();
            }
            this.v.clear();
        }
        synchronized (this.r) {
            this.s = null;
        }
        N(1, null);
    }

    public boolean e() {
        return true;
    }

    @Override // com.google.android.gms.common.api.a.f
    public boolean f() {
        return false;
    }

    public boolean h() {
        boolean z2;
        synchronized (this.q) {
            z2 = this.x == 4;
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        F(8, null, null, r4.G.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(com.google.android.gms.common.internal.i r5, @androidx.annotation.RecentlyNonNull java.util.Set<com.google.android.gms.common.api.Scope> r6) {
        /*
            r4 = this;
            android.os.Bundle r0 = r4.w()
            com.google.android.gms.common.internal.e r1 = new com.google.android.gms.common.internal.e
            int r2 = r4.A
            java.lang.String r3 = r4.C
            r1.<init>(r2, r3)
            android.content.Context r2 = r4.c
            java.lang.String r2 = r2.getPackageName()
            r1.f = r2
            r1.p = r0
            if (r6 == 0) goto L_0x0027
            int r0 = r6.size()
            com.google.android.gms.common.api.Scope[] r0 = new com.google.android.gms.common.api.Scope[r0]
            java.lang.Object[] r6 = r6.toArray(r0)
            com.google.android.gms.common.api.Scope[] r6 = (com.google.android.gms.common.api.Scope[]) r6
            r1.o = r6
        L_0x0027:
            boolean r6 = r4.f()
            if (r6 == 0) goto L_0x0047
            android.accounts.Account r6 = r4.r()
            if (r6 == 0) goto L_0x0034
            goto L_0x003d
        L_0x0034:
            android.accounts.Account r6 = new android.accounts.Account
            java.lang.String r0 = "<<default account>>"
            java.lang.String r2 = "com.google"
            r6.<init>(r0, r2)
        L_0x003d:
            r1.q = r6
            if (r5 == 0) goto L_0x0047
            android.os.IBinder r5 = r5.asBinder()
            r1.n = r5
        L_0x0047:
            com.google.android.gms.common.c[] r5 = com.google.android.gms.common.internal.b.H
            r1.r = r5
            com.google.android.gms.common.c[] r5 = r4.t()
            r1.s = r5
            boolean r5 = r4.I()
            if (r5 == 0) goto L_0x005a
            r5 = 1
            r1.v = r5
        L_0x005a:
            java.lang.Object r5 = r4.r     // Catch:{ DeadObjectException -> 0x0083, SecurityException -> 0x0081 }
            monitor-enter(r5)     // Catch:{ DeadObjectException -> 0x0083, SecurityException -> 0x0081 }
            com.google.android.gms.common.internal.l r6 = r4.s     // Catch:{ all -> 0x0071 }
            if (r6 == 0) goto L_0x006f
            com.google.android.gms.common.internal.b$j r0 = new com.google.android.gms.common.internal.b$j     // Catch:{ all -> 0x0071 }
            java.util.concurrent.atomic.AtomicInteger r2 = r4.G     // Catch:{ all -> 0x0071 }
            int r2 = r2.get()     // Catch:{ all -> 0x0071 }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x0071 }
            r6.k2(r0, r1)     // Catch:{ all -> 0x0071 }
        L_0x006f:
            monitor-exit(r5)     // Catch:{ all -> 0x0071 }
            return
        L_0x0071:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0071 }
            throw r6     // Catch:{ RemoteException | RuntimeException -> 0x0074 }
        L_0x0074:
            r5 = 8
            java.util.concurrent.atomic.AtomicInteger r6 = r4.G
            int r6 = r6.get()
            r0 = 0
            r4.F(r5, r0, r0, r6)
            return
        L_0x0081:
            r5 = move-exception
            throw r5
        L_0x0083:
            r5 = 3
            android.os.Handler r6 = r4.p
            java.util.concurrent.atomic.AtomicInteger r0 = r4.G
            int r0 = r0.get()
            r1 = 6
            android.os.Message r5 = r6.obtainMessage(r1, r0, r5)
            r6.sendMessage(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.b.j(com.google.android.gms.common.internal.i, java.util.Set):void");
    }

    public void k(@RecentlyNonNull e eVar) {
        eVar.a();
    }

    @Override // com.google.android.gms.common.api.a.f
    public int l() {
        return com.google.android.gms.common.e.a;
    }

    @RecentlyNullable
    public final com.google.android.gms.common.c[] m() {
        t0 t0Var = this.F;
        if (t0Var == null) {
            return null;
        }
        return t0Var.b;
    }

    @RecentlyNullable
    public String n() {
        return this.a;
    }

    public void p() {
        int c2 = this.o.c(this.c, l());
        if (c2 != 0) {
            N(1, null);
            d dVar = new d();
            com.google.android.exoplayer2.util.g.k(dVar, "Connection progress callbacks cannot be null.");
            this.t = dVar;
            Handler handler = this.p;
            handler.sendMessage(handler.obtainMessage(3, this.G.get(), c2, null));
            return;
        }
        c(new d());
    }

    /* access modifiers changed from: protected */
    @RecentlyNullable
    public abstract T q(@RecentlyNonNull IBinder iBinder);

    @RecentlyNullable
    public Account r() {
        return null;
    }

    public boolean s() {
        boolean z2;
        synchronized (this.q) {
            int i2 = this.x;
            if (i2 != 2) {
                if (i2 != 3) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    @RecentlyNonNull
    public com.google.android.gms.common.c[] t() {
        return H;
    }

    @RecentlyNullable
    public Bundle u() {
        return null;
    }

    @RecentlyNonNull
    public final Context v() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public Bundle w() {
        return new Bundle();
    }

    @RecentlyNonNull
    public final Looper x() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public Set<Scope> y() {
        return Collections.emptySet();
    }

    @RecentlyNonNull
    public final T z() {
        T t2;
        synchronized (this.q) {
            if (this.x == 5) {
                throw new DeadObjectException();
            } else if (h()) {
                T t3 = this.u;
                com.google.android.exoplayer2.util.g.k(t3, "Client is connected but service is null");
                t2 = t3;
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return t2;
    }

    protected b(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull g gVar, @RecentlyNonNull com.google.android.gms.common.e eVar, int i2, a aVar, AbstractC0097b bVar, String str) {
        this.a = null;
        this.q = new Object();
        this.r = new Object();
        this.v = new ArrayList<>();
        this.x = 1;
        this.D = null;
        this.E = false;
        this.F = null;
        this.G = new AtomicInteger(0);
        com.google.android.exoplayer2.util.g.k(context, "Context must not be null");
        this.c = context;
        com.google.android.exoplayer2.util.g.k(looper, "Looper must not be null");
        this.f = looper;
        com.google.android.exoplayer2.util.g.k(gVar, "Supervisor must not be null");
        this.n = gVar;
        com.google.android.exoplayer2.util.g.k(eVar, "API availability must not be null");
        this.o = eVar;
        this.p = new g(looper);
        this.A = i2;
        this.y = aVar;
        this.z = bVar;
        this.B = str;
    }
}
