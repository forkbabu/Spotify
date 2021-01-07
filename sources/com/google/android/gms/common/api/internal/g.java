package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.f0;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.e;
import com.google.android.gms.tasks.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public class g implements Handler.Callback {
    private static final Object A = new Object();
    private static g B;
    @RecentlyNonNull
    public static final Status y = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status z = new Status(4, "The user must be signed in to make this API call.");
    private long a = 10000;
    private boolean b = false;
    private r c;
    private t f;
    private final Context n;
    private final d o;
    private final b0 p;
    private final AtomicInteger q = new AtomicInteger(1);
    private final AtomicInteger r = new AtomicInteger(0);
    private final Map<b<?>, a<?>> s = new ConcurrentHashMap(5, 0.75f, 1);
    private k1 t = null;
    private final Set<b<?>> u = new o1();
    private final Set<b<?>> v = new o1();
    @NotOnlyInitialized
    private final Handler w;
    private volatile boolean x = true;

    public class a<O extends a.d> implements c.a, c.b {
        private final Queue<v> a = new LinkedList();
        @NotOnlyInitialized
        private final a.f b;
        private final b<O> c;
        private final h1 d;
        private final Set<b1> e = new HashSet();
        private final Map<k.a<?>, j0> f = new HashMap();
        private final int g;
        private final p0 h;
        private boolean i;
        private final List<b> j = new ArrayList();
        private ConnectionResult k = null;
        private int l = 0;

        public a(com.google.android.gms.common.api.b<O> bVar) {
            a.f q = bVar.q(g.this.w.getLooper(), this);
            this.b = q;
            this.c = bVar.b();
            this.d = new h1();
            this.g = bVar.p();
            if (q.f()) {
                this.h = bVar.r(g.this.n, g.this.w);
            } else {
                this.h = null;
            }
        }

        private final void A(v vVar) {
            vVar.d(this.d, I());
            try {
                vVar.c(this);
            } catch (DeadObjectException unused) {
                i(1);
                this.b.a("DeadObjectException thrown while running ApiCallRunner.");
            } catch (Throwable th) {
                throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", this.b.getClass().getName()), th);
            }
        }

        /* access modifiers changed from: private */
        public final void M() {
            B();
            z(ConnectionResult.n);
            O();
            Iterator<j0> it = this.f.values().iterator();
            while (it.hasNext()) {
                j0 next = it.next();
                if (a(next.a.c()) != null) {
                    it.remove();
                } else {
                    try {
                        next.a.d(this.b, new h<>());
                    } catch (DeadObjectException unused) {
                        i(3);
                        this.b.a("DeadObjectException thrown while calling register listener method.");
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            N();
            P();
        }

        private final void N() {
            ArrayList arrayList = new ArrayList(this.a);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                v vVar = (v) obj;
                if (!this.b.h()) {
                    return;
                }
                if (w(vVar)) {
                    this.a.remove(vVar);
                }
            }
        }

        private final void O() {
            if (this.i) {
                g.this.w.removeMessages(11, this.c);
                g.this.w.removeMessages(9, this.c);
                this.i = false;
            }
        }

        private final void P() {
            g.this.w.removeMessages(12, this.c);
            g.this.w.sendMessageDelayed(g.this.w.obtainMessage(12, this.c), g.this.a);
        }

        private final com.google.android.gms.common.c a(com.google.android.gms.common.c[] cVarArr) {
            if (!(cVarArr == null || cVarArr.length == 0)) {
                com.google.android.gms.common.c[] m2 = this.b.m();
                if (m2 == null) {
                    m2 = new com.google.android.gms.common.c[0];
                }
                m1 m1Var = new m1(m2.length);
                for (com.google.android.gms.common.c cVar : m2) {
                    m1Var.put(cVar.getName(), Long.valueOf(cVar.I1()));
                }
                for (com.google.android.gms.common.c cVar2 : cVarArr) {
                    Long l2 = (Long) m1Var.get(cVar2.getName());
                    if (l2 == null || l2.longValue() < cVar2.I1()) {
                        return cVar2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public final void d(int i2) {
            B();
            this.i = true;
            this.d.b(i2, this.b.n());
            Handler handler = g.this.w;
            Message obtain = Message.obtain(g.this.w, 9, this.c);
            g.this.getClass();
            handler.sendMessageDelayed(obtain, 5000);
            Handler handler2 = g.this.w;
            Message obtain2 = Message.obtain(g.this.w, 11, this.c);
            g.this.getClass();
            handler2.sendMessageDelayed(obtain2, 120000);
            g.this.p.c();
            for (j0 j0Var : this.f.values()) {
                j0Var.c.run();
            }
        }

        private final void f(ConnectionResult connectionResult, Exception exc) {
            com.google.android.exoplayer2.util.g.e(g.this.w);
            p0 p0Var = this.h;
            if (p0Var != null) {
                p0Var.D3();
            }
            B();
            g.this.p.c();
            z(connectionResult);
            if (this.b instanceof nr) {
                g.this.b = true;
                g.this.w.sendMessageDelayed(g.this.w.obtainMessage(19), 300000);
            }
            if (connectionResult.I1() == 4) {
                h(g.z);
            } else if (this.a.isEmpty()) {
                this.k = connectionResult;
            } else if (exc != null) {
                com.google.android.exoplayer2.util.g.e(g.this.w);
                j(null, exc, false);
            } else if (!g.this.x) {
                h(g.t(this.c, connectionResult));
            } else {
                j(g.t(this.c, connectionResult), null, true);
                if (!this.a.isEmpty() && !v(connectionResult) && !g.this.p(connectionResult, this.g)) {
                    if (connectionResult.I1() == 18) {
                        this.i = true;
                    }
                    if (this.i) {
                        Handler handler = g.this.w;
                        Message obtain = Message.obtain(g.this.w, 9, this.c);
                        g.this.getClass();
                        handler.sendMessageDelayed(obtain, 5000);
                        return;
                    }
                    h(g.t(this.c, connectionResult));
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void h(Status status) {
            com.google.android.exoplayer2.util.g.e(g.this.w);
            j(status, null, false);
        }

        private final void j(Status status, Exception exc, boolean z) {
            com.google.android.exoplayer2.util.g.e(g.this.w);
            boolean z2 = true;
            boolean z3 = status == null;
            if (exc != null) {
                z2 = false;
            }
            if (z3 != z2) {
                Iterator<v> it = this.a.iterator();
                while (it.hasNext()) {
                    v next = it.next();
                    if (!z || next.a == 2) {
                        if (status != null) {
                            next.b(status);
                        } else {
                            next.e(exc);
                        }
                        it.remove();
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Status XOR exception should be null");
        }

        static void m(a aVar, b bVar) {
            if (!aVar.j.contains(bVar) || aVar.i) {
                return;
            }
            if (!aVar.b.h()) {
                aVar.G();
            } else {
                aVar.N();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final boolean r(boolean z) {
            com.google.android.exoplayer2.util.g.e(g.this.w);
            if (!this.b.h() || this.f.size() != 0) {
                return false;
            }
            if (this.d.f()) {
                if (z) {
                    P();
                }
                return false;
            }
            this.b.a("Timing out service connection.");
            return true;
        }

        static void u(a aVar, b bVar) {
            int i2;
            com.google.android.gms.common.c[] f2;
            if (aVar.j.remove(bVar)) {
                g.this.w.removeMessages(15, bVar);
                g.this.w.removeMessages(16, bVar);
                com.google.android.gms.common.c cVar = bVar.b;
                ArrayList arrayList = new ArrayList(aVar.a.size());
                Iterator<v> it = aVar.a.iterator();
                while (true) {
                    i2 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    v next = it.next();
                    if ((next instanceof w0) && (f2 = ((w0) next).f(aVar)) != null) {
                        int length = f2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                i3 = -1;
                                break;
                            } else if (m.a(f2[i3], cVar)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (i3 >= 0) {
                            i2 = 1;
                        }
                        if (i2 != 0) {
                            arrayList.add(next);
                        }
                    }
                }
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    v vVar = (v) obj;
                    aVar.a.remove(vVar);
                    vVar.e(new UnsupportedApiCallException(cVar));
                }
            }
        }

        private final boolean v(ConnectionResult connectionResult) {
            synchronized (g.A) {
                if (g.this.t == null || !g.this.u.contains(this.c)) {
                    return false;
                }
                g.this.t.m(connectionResult, this.g);
                return true;
            }
        }

        private final boolean w(v vVar) {
            if (!(vVar instanceof w0)) {
                A(vVar);
                return true;
            }
            w0 w0Var = (w0) vVar;
            com.google.android.gms.common.c a2 = a(w0Var.f(this));
            if (a2 == null) {
                A(vVar);
                return true;
            }
            String name = this.b.getClass().getName();
            String name2 = a2.getName();
            name.length();
            String.valueOf(name2).length();
            if (!g.this.x || !w0Var.g(this)) {
                w0Var.e(new UnsupportedApiCallException(a2));
                return true;
            }
            b bVar = new b(this.c, a2, null);
            int indexOf = this.j.indexOf(bVar);
            if (indexOf >= 0) {
                b bVar2 = this.j.get(indexOf);
                g.this.w.removeMessages(15, bVar2);
                Handler handler = g.this.w;
                Message obtain = Message.obtain(g.this.w, 15, bVar2);
                g.this.getClass();
                handler.sendMessageDelayed(obtain, 5000);
                return false;
            }
            this.j.add(bVar);
            Handler handler2 = g.this.w;
            Message obtain2 = Message.obtain(g.this.w, 15, bVar);
            g.this.getClass();
            handler2.sendMessageDelayed(obtain2, 5000);
            Handler handler3 = g.this.w;
            Message obtain3 = Message.obtain(g.this.w, 16, bVar);
            g.this.getClass();
            handler3.sendMessageDelayed(obtain3, 120000);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (v(connectionResult)) {
                return false;
            }
            g.this.p(connectionResult, this.g);
            return false;
        }

        private final void z(ConnectionResult connectionResult) {
            for (b1 b1Var : this.e) {
                String str = null;
                if (m.a(connectionResult, ConnectionResult.n)) {
                    str = this.b.b();
                }
                b1Var.b(this.c, connectionResult, str);
            }
            this.e.clear();
        }

        public final void B() {
            com.google.android.exoplayer2.util.g.e(g.this.w);
            this.k = null;
        }

        public final ConnectionResult C() {
            com.google.android.exoplayer2.util.g.e(g.this.w);
            return this.k;
        }

        public final void D() {
            com.google.android.exoplayer2.util.g.e(g.this.w);
            if (this.i) {
                G();
            }
        }

        public final void E() {
            Status status;
            com.google.android.exoplayer2.util.g.e(g.this.w);
            if (this.i) {
                O();
                if (g.this.o.g(g.this.n) == 18) {
                    status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                } else {
                    status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                }
                h(status);
                this.b.a("Timing out connection while resuming.");
            }
        }

        public final boolean F() {
            return r(true);
        }

        public final void G() {
            com.google.android.exoplayer2.util.g.e(g.this.w);
            if (!this.b.h() && !this.b.s()) {
                try {
                    int b2 = g.this.p.b(g.this.n, this.b);
                    if (b2 != 0) {
                        ConnectionResult connectionResult = new ConnectionResult(b2, null);
                        String name = this.b.getClass().getName();
                        String valueOf = String.valueOf(connectionResult);
                        name.length();
                        valueOf.length();
                        f(connectionResult, null);
                        return;
                    }
                    g gVar = g.this;
                    a.f fVar = this.b;
                    c cVar = new c(fVar, this.c);
                    if (fVar.f()) {
                        p0 p0Var = this.h;
                        com.google.android.exoplayer2.util.g.l(p0Var);
                        p0Var.F3(cVar);
                    }
                    try {
                        this.b.c(cVar);
                    } catch (SecurityException e2) {
                        f(new ConnectionResult(10), e2);
                    }
                } catch (IllegalStateException e3) {
                    f(new ConnectionResult(10), e3);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean H() {
            return this.b.h();
        }

        public final boolean I() {
            return this.b.f();
        }

        public final int J() {
            return this.g;
        }

        /* access modifiers changed from: package-private */
        public final int K() {
            return this.l;
        }

        /* access modifiers changed from: package-private */
        public final void L() {
            this.l++;
        }

        public final void c() {
            com.google.android.exoplayer2.util.g.e(g.this.w);
            h(g.y);
            this.d.h();
            for (k.a aVar : (k.a[]) this.f.keySet().toArray(new k.a[0])) {
                o(new z0(aVar, new h()));
            }
            z(new ConnectionResult(4));
            if (this.b.h()) {
                this.b.k(new a0(this));
            }
        }

        public final void e(ConnectionResult connectionResult) {
            com.google.android.exoplayer2.util.g.e(g.this.w);
            a.f fVar = this.b;
            String name = fVar.getClass().getName();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(valueOf.length() + name.length() + 25);
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(valueOf);
            fVar.a(sb.toString());
            f(connectionResult, null);
        }

        @Override // com.google.android.gms.common.api.internal.f
        public final void g(Bundle bundle) {
            if (Looper.myLooper() == g.this.w.getLooper()) {
                M();
            } else {
                g.this.w.post(new z(this));
            }
        }

        @Override // com.google.android.gms.common.api.internal.f
        public final void i(int i2) {
            if (Looper.myLooper() == g.this.w.getLooper()) {
                d(i2);
            } else {
                g.this.w.post(new y(this, i2));
            }
        }

        @Override // com.google.android.gms.common.api.internal.n
        public final void n(ConnectionResult connectionResult) {
            f(connectionResult, null);
        }

        public final void o(v vVar) {
            com.google.android.exoplayer2.util.g.e(g.this.w);
            if (!this.b.h()) {
                this.a.add(vVar);
                ConnectionResult connectionResult = this.k;
                if (connectionResult == null || !connectionResult.p2()) {
                    G();
                } else {
                    f(this.k, null);
                }
            } else if (w(vVar)) {
                P();
            } else {
                this.a.add(vVar);
            }
        }

        public final void p(b1 b1Var) {
            com.google.android.exoplayer2.util.g.e(g.this.w);
            this.e.add(b1Var);
        }

        public final a.f s() {
            return this.b;
        }

        public final Map<k.a<?>, j0> y() {
            return this.f;
        }
    }

    /* access modifiers changed from: private */
    public static class b {
        private final b<?> a;
        private final com.google.android.gms.common.c b;

        b(b bVar, com.google.android.gms.common.c cVar, x xVar) {
            this.a = bVar;
            this.b = cVar;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (m.a(this.a, bVar.a) && m.a(this.b, bVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b});
        }

        public final String toString() {
            m.a b2 = m.b(this);
            b2.a("key", this.a);
            b2.a("feature", this.b);
            return b2.toString();
        }
    }

    /* access modifiers changed from: private */
    public class c implements s0, b.c {
        private final a.f a;
        private final b<?> b;
        private i c = null;
        private Set<Scope> d = null;
        private boolean e = false;

        public c(a.f fVar, b<?> bVar) {
            this.a = fVar;
            this.b = bVar;
        }

        static void g(c cVar) {
            i iVar;
            if (cVar.e && (iVar = cVar.c) != null) {
                cVar.a.j(iVar, cVar.d);
            }
        }

        @Override // com.google.android.gms.common.internal.b.c
        public final void a(ConnectionResult connectionResult) {
            g.this.w.post(new c0(this, connectionResult));
        }

        public final void c(ConnectionResult connectionResult) {
            a aVar = (a) g.this.s.get(this.b);
            if (aVar != null) {
                aVar.e(connectionResult);
            }
        }

        public final void d(i iVar, Set<Scope> set) {
            if (iVar == null || set == null) {
                new Exception();
                c(new ConnectionResult(4));
                return;
            }
            this.c = iVar;
            this.d = set;
            if (this.e) {
                this.a.j(iVar, set);
            }
        }
    }

    private g(Context context, Looper looper, d dVar) {
        this.n = context;
        qt qtVar = new qt(looper, this);
        this.w = qtVar;
        this.o = dVar;
        this.p = new b0(dVar);
        if (e.e(context)) {
            this.x = false;
        }
        qtVar.sendMessage(qtVar.obtainMessage(6));
    }

    private final void E() {
        r rVar = this.c;
        if (rVar != null) {
            if (rVar.I1() > 0 || y()) {
                if (this.f == null) {
                    this.f = new mr(this.n);
                }
                ((mr) this.f).u(rVar);
            }
            this.c = null;
        }
    }

    public static void a() {
        synchronized (A) {
            g gVar = B;
            if (gVar != null) {
                gVar.r.incrementAndGet();
                Handler handler = gVar.w;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    @RecentlyNonNull
    public static g e() {
        g gVar;
        synchronized (A) {
            com.google.android.exoplayer2.util.g.k(B, "Must guarantee manager is non-null before using getInstance");
            gVar = B;
        }
        return gVar;
    }

    @RecentlyNonNull
    public static g f(@RecentlyNonNull Context context) {
        g gVar;
        synchronized (A) {
            if (B == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                B = new g(context.getApplicationContext(), handlerThread.getLooper(), d.f());
            }
            gVar = B;
        }
        return gVar;
    }

    private final <T> void o(h<T> hVar, int i, com.google.android.gms.common.api.b<?> bVar) {
        h0 b2;
        if (i != 0 && (b2 = h0.b(this, i, bVar.b())) != null) {
            com.google.android.gms.tasks.g<T> a2 = hVar.a();
            Handler handler = this.w;
            handler.getClass();
            a2.c(w.a(handler), b2);
        }
    }

    /* access modifiers changed from: private */
    public static Status t(b<?> bVar, ConnectionResult connectionResult) {
        String b2 = bVar.b();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(b2).length() + 63);
        sb.append("API: ");
        sb.append(b2);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(connectionResult, sb.toString());
    }

    private final a<?> w(com.google.android.gms.common.api.b<?> bVar) {
        b<?> b2 = bVar.b();
        a<?> aVar = this.s.get(b2);
        if (aVar == null) {
            aVar = new a<>(bVar);
            this.s.put(b2, aVar);
        }
        if (aVar.I()) {
            this.v.add(b2);
        }
        aVar.G();
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public final a d(b<?> bVar) {
        return this.s.get(bVar);
    }

    @RecentlyNonNull
    public final <O extends a.d> com.google.android.gms.tasks.g<Boolean> g(@RecentlyNonNull com.google.android.gms.common.api.b<O> bVar, @RecentlyNonNull k.a<?> aVar, int i) {
        h hVar = new h();
        o(hVar, i, bVar);
        z0 z0Var = new z0(aVar, hVar);
        Handler handler = this.w;
        handler.sendMessage(handler.obtainMessage(13, new i0(z0Var, this.r.get(), bVar)));
        return hVar.a();
    }

    @RecentlyNonNull
    public final <O extends a.d> com.google.android.gms.tasks.g<Void> h(@RecentlyNonNull com.google.android.gms.common.api.b<O> bVar, @RecentlyNonNull o<a.b, ?> oVar, @RecentlyNonNull t<a.b, ?> tVar, @RecentlyNonNull Runnable runnable) {
        h hVar = new h();
        o(hVar, oVar.f(), bVar);
        x0 x0Var = new x0(new j0(oVar, tVar, runnable), hVar);
        Handler handler = this.w;
        handler.sendMessage(handler.obtainMessage(8, new i0(x0Var, this.r.get(), bVar)));
        return hVar.a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@RecentlyNonNull Message message) {
        long j = 300000;
        a<?> aVar = null;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.a = j;
                this.w.removeMessages(12);
                for (b<?> bVar : this.s.keySet()) {
                    Handler handler = this.w;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.a);
                }
                break;
            case 2:
                b1 b1Var = (b1) message.obj;
                Iterator<b<?>> it = b1Var.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        b<?> next = it.next();
                        a<?> aVar2 = this.s.get(next);
                        if (aVar2 == null) {
                            b1Var.b(next, new ConnectionResult(13), null);
                            break;
                        } else if (aVar2.H()) {
                            b1Var.b(next, ConnectionResult.n, aVar2.s().b());
                        } else {
                            ConnectionResult C = aVar2.C();
                            if (C != null) {
                                b1Var.b(next, C, null);
                            } else {
                                aVar2.p(b1Var);
                                aVar2.G();
                            }
                        }
                    }
                }
            case 3:
                for (a<?> aVar3 : this.s.values()) {
                    aVar3.B();
                    aVar3.G();
                }
                break;
            case 4:
            case 8:
            case 13:
                i0 i0Var = (i0) message.obj;
                a<?> aVar4 = this.s.get(i0Var.c.b());
                if (aVar4 == null) {
                    aVar4 = w(i0Var.c);
                }
                if (!aVar4.I() || this.r.get() == i0Var.b) {
                    aVar4.o(i0Var.a);
                    break;
                } else {
                    i0Var.a.b(y);
                    aVar4.c();
                    break;
                }
                break;
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<a<?>> it2 = this.s.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        a<?> next2 = it2.next();
                        if (next2.J() == i) {
                            aVar = next2;
                        }
                    }
                }
                if (aVar != null) {
                    if (connectionResult.I1() == 13) {
                        String e = this.o.e(connectionResult.I1());
                        String Q1 = connectionResult.Q1();
                        StringBuilder sb = new StringBuilder(String.valueOf(Q1).length() + String.valueOf(e).length() + 69);
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(e);
                        sb.append(": ");
                        sb.append(Q1);
                        aVar.h(new Status(17, sb.toString()));
                        break;
                    } else {
                        aVar.h(t(((a) aVar).c, connectionResult));
                        break;
                    }
                } else {
                    new Exception();
                    break;
                }
            case 6:
                if (this.n.getApplicationContext() instanceof Application) {
                    c.c((Application) this.n.getApplicationContext());
                    c.b().a(new x(this));
                    if (!c.b().d(true)) {
                        this.a = 300000;
                        break;
                    }
                }
                break;
            case 7:
                w((com.google.android.gms.common.api.b) message.obj);
                break;
            case 9:
                if (this.s.containsKey(message.obj)) {
                    this.s.get(message.obj).D();
                    break;
                }
                break;
            case 10:
                for (b<?> bVar2 : this.v) {
                    a<?> remove = this.s.remove(bVar2);
                    if (remove != null) {
                        remove.c();
                    }
                }
                this.v.clear();
                break;
            case 11:
                if (this.s.containsKey(message.obj)) {
                    this.s.get(message.obj).E();
                    break;
                }
                break;
            case 12:
                if (this.s.containsKey(message.obj)) {
                    this.s.get(message.obj).F();
                    break;
                }
                break;
            case 14:
                ((l1) message.obj).getClass();
                if (!this.s.containsKey(null)) {
                    throw null;
                }
                this.s.get(null).r(false);
                throw null;
            case 15:
                b bVar3 = (b) message.obj;
                if (this.s.containsKey(bVar3.a)) {
                    a.m(this.s.get(bVar3.a), bVar3);
                    break;
                }
                break;
            case 16:
                b bVar4 = (b) message.obj;
                if (this.s.containsKey(bVar4.a)) {
                    a.u(this.s.get(bVar4.a), bVar4);
                    break;
                }
                break;
            case 17:
                E();
                break;
            case 18:
                g0 g0Var = (g0) message.obj;
                if (g0Var.c == 0) {
                    r rVar = new r(g0Var.b, Arrays.asList(g0Var.a));
                    if (this.f == null) {
                        this.f = new mr(this.n);
                    }
                    ((mr) this.f).u(rVar);
                    break;
                } else {
                    r rVar2 = this.c;
                    if (rVar2 != null) {
                        List<f0> o2 = rVar2.o2();
                        if (this.c.I1() != g0Var.b || (o2 != null && o2.size() >= g0Var.d)) {
                            this.w.removeMessages(17);
                            E();
                        } else {
                            this.c.Q1(g0Var.a);
                        }
                    }
                    if (this.c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(g0Var.a);
                        this.c = new r(g0Var.b, arrayList);
                        Handler handler2 = this.w;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), g0Var.c);
                        break;
                    }
                }
                break;
            case 19:
                this.b = false;
                break;
            default:
                return false;
        }
        return true;
    }

    @RecentlyNonNull
    public final com.google.android.gms.tasks.g<Map<b<?>, String>> i(@RecentlyNonNull Iterable<? extends com.google.android.gms.common.api.d<?>> iterable) {
        b1 b1Var = new b1(iterable);
        Handler handler = this.w;
        handler.sendMessage(handler.obtainMessage(2, b1Var));
        return b1Var.c();
    }

    public final void j(@RecentlyNonNull com.google.android.gms.common.api.b<?> bVar) {
        Handler handler = this.w;
        handler.sendMessage(handler.obtainMessage(7, bVar));
    }

    public final <O extends a.d> void k(@RecentlyNonNull com.google.android.gms.common.api.b<O> bVar, int i, @RecentlyNonNull d<? extends com.google.android.gms.common.api.i, a.b> dVar) {
        y0 y0Var = new y0(i, dVar);
        Handler handler = this.w;
        handler.sendMessage(handler.obtainMessage(4, new i0(y0Var, this.r.get(), bVar)));
    }

    public final <O extends a.d, ResultT> void l(@RecentlyNonNull com.google.android.gms.common.api.b<O> bVar, int i, @RecentlyNonNull s<a.b, ResultT> sVar, @RecentlyNonNull h<ResultT> hVar, @RecentlyNonNull a aVar) {
        o(hVar, sVar.e(), bVar);
        a1 a1Var = new a1(i, sVar, hVar, aVar);
        Handler handler = this.w;
        handler.sendMessage(handler.obtainMessage(4, new i0(a1Var, this.r.get(), bVar)));
    }

    public final void m(k1 k1Var) {
        synchronized (A) {
            if (this.t != k1Var) {
                this.t = k1Var;
                this.u.clear();
            }
            this.u.addAll(k1Var.o());
        }
    }

    /* access modifiers changed from: package-private */
    public final void n(f0 f0Var, int i, long j, int i2) {
        Handler handler = this.w;
        handler.sendMessage(handler.obtainMessage(18, new g0(f0Var, i, j, i2)));
    }

    /* access modifiers changed from: package-private */
    public final boolean p(ConnectionResult connectionResult, int i) {
        return this.o.q(this.n, connectionResult, i);
    }

    public final int r() {
        return this.q.getAndIncrement();
    }

    public final void u(@RecentlyNonNull ConnectionResult connectionResult, int i) {
        if (!this.o.q(this.n, connectionResult, i)) {
            Handler handler = this.w;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* access modifiers changed from: package-private */
    public final void v(k1 k1Var) {
        synchronized (A) {
            if (this.t == k1Var) {
                this.t = null;
                this.u.clear();
            }
        }
    }

    public final void x() {
        Handler handler = this.w;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* access modifiers changed from: package-private */
    public final boolean y() {
        if (this.b) {
            return false;
        }
        p a2 = o.b().a();
        if (a2 != null && !a2.o2()) {
            return false;
        }
        int a3 = this.p.a(203390000);
        if (a3 == -1 || a3 == 0) {
            return true;
        }
        return false;
    }
}
