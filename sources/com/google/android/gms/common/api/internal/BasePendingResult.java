package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends i> extends e<R> {
    static final ThreadLocal<Boolean> m = new g1();
    private final Object a;
    private final a<R> b;
    private final CountDownLatch c;
    private final ArrayList<e.a> d;
    private j<? super R> e;
    private final AtomicReference<v0> f;
    private R g;
    private Status h;
    private volatile boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    @KeepName
    private b mResultGuardian;

    public static class a<R extends i> extends qt {
        public a(@RecentlyNonNull Looper looper) {
            super(looper);
        }

        public final void a(@RecentlyNonNull j<? super R> jVar, @RecentlyNonNull R r) {
            sendMessage(obtainMessage(1, new Pair(jVar, r)));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.gms.common.api.j */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(@RecentlyNonNull Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                j jVar = (j) pair.first;
                i iVar = (i) pair.second;
                try {
                    jVar.a(iVar);
                } catch (RuntimeException e) {
                    BasePendingResult.k(iVar);
                    throw e;
                }
            } else if (i != 2) {
                new Exception();
            } else {
                ((BasePendingResult) message.obj).g(Status.r);
            }
        }
    }

    /* access modifiers changed from: private */
    public final class b {
        b(g1 g1Var) {
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            BasePendingResult.k(BasePendingResult.this.g);
            super.finalize();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.a = new Object();
        this.c = new CountDownLatch(1);
        this.d = new ArrayList<>();
        this.f = new AtomicReference<>();
        this.l = false;
        this.b = new a<>(Looper.getMainLooper());
        new WeakReference(null);
    }

    public static void k(i iVar) {
        if (iVar instanceof g) {
            try {
                ((g) iVar).d();
            } catch (RuntimeException unused) {
                String.valueOf(iVar).length();
            }
        }
    }

    private final void m(R r) {
        this.g = r;
        this.h = r.h();
        this.c.countDown();
        if (this.j) {
            this.e = null;
        } else {
            j<? super R> jVar = this.e;
            if (jVar != null) {
                this.b.removeMessages(2);
                this.b.a(jVar, n());
            } else if (this.g instanceof g) {
                this.mResultGuardian = new b(null);
            }
        }
        ArrayList<e.a> arrayList = this.d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            e.a aVar = arrayList.get(i2);
            i2++;
            aVar.a(this.h);
        }
        this.d.clear();
    }

    private final R n() {
        R r;
        synchronized (this.a) {
            com.google.android.exoplayer2.util.g.p(!this.i, "Result has already been consumed.");
            com.google.android.exoplayer2.util.g.p(h(), "Result is not ready.");
            r = this.g;
            this.g = null;
            this.e = null;
            this.i = true;
        }
        v0 andSet = this.f.getAndSet(null);
        if (andSet != null) {
            andSet.a(this);
        }
        com.google.android.exoplayer2.util.g.l(r);
        return r;
    }

    @Override // com.google.android.gms.common.api.e
    public final void b(@RecentlyNonNull e.a aVar) {
        com.google.android.exoplayer2.util.g.d(true, "Callback cannot be null.");
        synchronized (this.a) {
            if (h()) {
                aVar.a(this.h);
            } else {
                this.d.add(aVar);
            }
        }
    }

    @Override // com.google.android.gms.common.api.e
    @RecentlyNonNull
    public final R c(long j2, @RecentlyNonNull TimeUnit timeUnit) {
        if (j2 > 0) {
            com.google.android.exoplayer2.util.g.j("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.exoplayer2.util.g.p(!this.i, "Result has already been consumed.");
        com.google.android.exoplayer2.util.g.p(true, "Cannot await if then() has been called.");
        try {
            if (!this.c.await(j2, timeUnit)) {
                g(Status.r);
            }
        } catch (InterruptedException unused) {
            g(Status.p);
        }
        com.google.android.exoplayer2.util.g.p(h(), "Result is not ready.");
        return n();
    }

    @Override // com.google.android.gms.common.api.e
    public void d() {
        synchronized (this.a) {
            if (!this.j) {
                if (!this.i) {
                    k(this.g);
                    this.j = true;
                    m(f(Status.s));
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.e
    public final void e(j<? super R> jVar) {
        boolean z;
        synchronized (this.a) {
            com.google.android.exoplayer2.util.g.p(!this.i, "Result has already been consumed.");
            com.google.android.exoplayer2.util.g.p(true, "Cannot set callbacks if then() has been called.");
            synchronized (this.a) {
                z = this.j;
            }
            if (!z) {
                if (h()) {
                    this.b.a(jVar, n());
                } else {
                    this.e = jVar;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract R f(@RecentlyNonNull Status status);

    @Deprecated
    public final void g(@RecentlyNonNull Status status) {
        synchronized (this.a) {
            if (!h()) {
                a(f(status));
                this.k = true;
            }
        }
    }

    public final boolean h() {
        return this.c.getCount() == 0;
    }

    /* renamed from: i */
    public final void a(@RecentlyNonNull R r) {
        synchronized (this.a) {
            if (this.k || this.j) {
                k(r);
                return;
            }
            h();
            boolean z = true;
            com.google.android.exoplayer2.util.g.p(!h(), "Results have already been set");
            if (this.i) {
                z = false;
            }
            com.google.android.exoplayer2.util.g.p(z, "Result has already been consumed");
            m(r);
        }
    }

    public final void l() {
        this.l = this.l || m.get().booleanValue();
    }

    protected BasePendingResult(c cVar) {
        this.a = new Object();
        this.c = new CountDownLatch(1);
        this.d = new ArrayList<>();
        this.f = new AtomicReference<>();
        this.l = false;
        this.b = new a<>(cVar != null ? cVar.d() : Looper.getMainLooper());
        new WeakReference(cVar);
    }
}
