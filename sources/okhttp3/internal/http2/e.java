package okhttp3.internal.http2;

import com.spotify.mobile.android.core.internal.AudioDriver;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.i;
import okhttp3.internal.http2.m;

public final class e implements Closeable {
    private static final ExecutorService H = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), rnf.z("OkHttp Http2Connection", true));
    long A;
    n B = new n();
    final n C;
    final Socket D;
    final k E;
    final l F;
    final Set<Integer> G;
    final boolean a;
    final j b;
    final Map<Integer, j> c = new LinkedHashMap();
    final String f;
    int n;
    int o;
    private boolean p;
    private final ScheduledExecutorService q;
    private final ExecutorService r;
    final m s;
    private long t = 0;
    private long u = 0;
    private long v = 0;
    private long w = 0;
    private long x = 0;
    private long y = 0;
    long z = 0;

    /* access modifiers changed from: package-private */
    public class a extends qnf {
        final /* synthetic */ int b;
        final /* synthetic */ ErrorCode c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i, ErrorCode errorCode) {
            super(str, objArr);
            this.b = i;
            this.c = errorCode;
        }

        @Override // defpackage.qnf
        public void a() {
            try {
                e eVar = e.this;
                eVar.E.m(this.b, this.c);
            } catch (IOException unused) {
                e.a(e.this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends qnf {
        final /* synthetic */ int b;
        final /* synthetic */ long c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.b = i;
            this.c = j;
        }

        @Override // defpackage.qnf
        public void a() {
            try {
                e.this.E.r(this.b, this.c);
            } catch (IOException unused) {
                e.a(e.this);
            }
        }
    }

    class c extends qnf {
        c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // defpackage.qnf
        public void a() {
            e.this.c0(false, 2, 0);
        }
    }

    class d extends qnf {
        final /* synthetic */ int b;
        final /* synthetic */ List c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.b = i;
            this.c = list;
        }

        @Override // defpackage.qnf
        public void a() {
            e.this.s.getClass();
            try {
                e.this.E.m(this.b, ErrorCode.CANCEL);
                synchronized (e.this) {
                    e.this.G.remove(Integer.valueOf(this.b));
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.e$e  reason: collision with other inner class name */
    class C0660e extends qnf {
        final /* synthetic */ int b;
        final /* synthetic */ List c;
        final /* synthetic */ boolean f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0660e(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.b = i;
            this.c = list;
            this.f = z;
        }

        @Override // defpackage.qnf
        public void a() {
            e.this.s.getClass();
            try {
                e.this.E.m(this.b, ErrorCode.CANCEL);
                synchronized (e.this) {
                    e.this.G.remove(Integer.valueOf(this.b));
                }
            } catch (IOException unused) {
            }
        }
    }

    class f extends qnf {
        final /* synthetic */ int b;
        final /* synthetic */ okio.e c;
        final /* synthetic */ int f;
        final /* synthetic */ boolean n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str, Object[] objArr, int i, okio.e eVar, int i2, boolean z) {
            super(str, objArr);
            this.b = i;
            this.c = eVar;
            this.f = i2;
            this.n = z;
        }

        @Override // defpackage.qnf
        public void a() {
            try {
                m mVar = e.this.s;
                okio.e eVar = this.c;
                int i = this.f;
                ((m.a) mVar).getClass();
                eVar.skip((long) i);
                e.this.E.m(this.b, ErrorCode.CANCEL);
                synchronized (e.this) {
                    e.this.G.remove(Integer.valueOf(this.b));
                }
            } catch (IOException unused) {
            }
        }
    }

    class g extends qnf {
        final /* synthetic */ int b;
        final /* synthetic */ ErrorCode c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(String str, Object[] objArr, int i, ErrorCode errorCode) {
            super(str, objArr);
            this.b = i;
            this.c = errorCode;
        }

        @Override // defpackage.qnf
        public void a() {
            ((m.a) e.this.s).getClass();
            synchronized (e.this) {
                e.this.G.remove(Integer.valueOf(this.b));
            }
        }
    }

    public static class h {
        Socket a;
        String b;
        okio.g c;
        okio.f d;
        j e = j.a;
        int f;

        public h(boolean z) {
        }

        public e a() {
            return new e(this);
        }

        public h b(j jVar) {
            this.e = jVar;
            return this;
        }

        public h c(int i) {
            this.f = i;
            return this;
        }

        public h d(Socket socket, String str, okio.g gVar, okio.f fVar) {
            this.a = socket;
            this.b = str;
            this.c = gVar;
            this.d = fVar;
            return this;
        }
    }

    final class i extends qnf {
        i() {
            super("OkHttp %s ping", e.this.f);
        }

        @Override // defpackage.qnf
        public void a() {
            boolean z;
            synchronized (e.this) {
                if (e.this.u < e.this.t) {
                    z = true;
                } else {
                    e.g(e.this);
                    z = false;
                }
            }
            if (z) {
                e.a(e.this);
            } else {
                e.this.c0(false, 1, 0);
            }
        }
    }

    public static abstract class j {
        public static final j a = new a();

        class a extends j {
            a() {
            }

            @Override // okhttp3.internal.http2.e.j
            public void b(j jVar) {
                jVar.d(ErrorCode.REFUSED_STREAM);
            }
        }

        public void a(e eVar) {
        }

        public abstract void b(j jVar);
    }

    /* access modifiers changed from: package-private */
    public final class k extends qnf {
        final boolean b;
        final int c;
        final int f;

        k(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", e.this.f, Integer.valueOf(i), Integer.valueOf(i2));
            this.b = z;
            this.c = i;
            this.f = i2;
        }

        @Override // defpackage.qnf
        public void a() {
            e.this.c0(this.b, this.c, this.f);
        }
    }

    /* access modifiers changed from: package-private */
    public class l extends qnf implements i.b {
        final i b;

        l(i iVar) {
            super("OkHttp %s", e.this.f);
            this.b = iVar;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.qnf
        public void a() {
            Throwable th;
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            try {
                this.b.d(this);
                while (this.b.b(false, this)) {
                }
                errorCode = ErrorCode.NO_ERROR;
                try {
                    try {
                        e.this.r(errorCode, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    try {
                        ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                        e.this.r(errorCode3, errorCode3);
                        rnf.g(this.b);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            e.this.r(errorCode, errorCode2);
                        } catch (IOException unused3) {
                        }
                        rnf.g(this.b);
                        throw th;
                    }
                }
            } catch (IOException unused4) {
                errorCode = errorCode2;
                ErrorCode errorCode32 = ErrorCode.PROTOCOL_ERROR;
                e.this.r(errorCode32, errorCode32);
                rnf.g(this.b);
            } catch (Throwable th3) {
                th = th3;
                errorCode = errorCode2;
                e.this.r(errorCode, errorCode2);
                rnf.g(this.b);
                throw th;
            }
            rnf.g(this.b);
        }
    }

    e(h hVar) {
        n nVar = new n();
        this.C = nVar;
        this.G = new LinkedHashSet();
        this.s = m.a;
        this.a = true;
        this.b = hVar.e;
        this.o = 1;
        this.o = 3;
        this.B.i(7, 16777216);
        String str = hVar.b;
        this.f = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, rnf.z(rnf.o("OkHttp %s Writer", str), false));
        this.q = scheduledThreadPoolExecutor;
        if (hVar.f != 0) {
            i iVar = new i();
            long j2 = (long) hVar.f;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, j2, j2, TimeUnit.MILLISECONDS);
        }
        this.r = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), rnf.z(rnf.o("OkHttp %s Push Observer", str), true));
        nVar.i(7, AudioDriver.SPOTIFY_MAX_VOLUME);
        nVar.i(5, 16384);
        this.A = (long) nVar.d();
        this.D = hVar.a;
        this.E = new k(hVar.d, true);
        this.F = new l(new i(hVar.c, true));
    }

    private synchronized void D(qnf qnf) {
        if (!this.p) {
            this.r.execute(qnf);
        }
    }

    static void a(e eVar) {
        eVar.getClass();
        try {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            eVar.r(errorCode, errorCode);
        } catch (IOException unused) {
        }
    }

    static /* synthetic */ long d(e eVar) {
        long j2 = eVar.u;
        eVar.u = 1 + j2;
        return j2;
    }

    static /* synthetic */ long g(e eVar) {
        long j2 = eVar.t;
        eVar.t = 1 + j2;
        return j2;
    }

    static /* synthetic */ long p(e eVar) {
        long j2 = eVar.w;
        eVar.w = 1 + j2;
        return j2;
    }

    static /* synthetic */ long q(e eVar) {
        long j2 = eVar.x;
        eVar.x = 1 + j2;
        return j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.internal.http2.j B(java.util.List<okhttp3.internal.http2.a> r11, boolean r12) {
        /*
            r10 = this;
            r6 = r12 ^ 1
            okhttp3.internal.http2.k r7 = r10.E
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0062 }
            int r0 = r10.o     // Catch:{ all -> 0x005f }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0012
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x005f }
            r10.Q(r0)     // Catch:{ all -> 0x005f }
        L_0x0012:
            boolean r0 = r10.p     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x0059
            int r8 = r10.o     // Catch:{ all -> 0x005f }
            int r0 = r8 + 2
            r10.o = r0     // Catch:{ all -> 0x005f }
            okhttp3.internal.http2.j r9 = new okhttp3.internal.http2.j     // Catch:{ all -> 0x005f }
            r5 = 0
            r4 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x005f }
            if (r12 == 0) goto L_0x003a
            long r0 = r10.A     // Catch:{ all -> 0x005f }
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x003a
            long r0 = r9.b     // Catch:{ all -> 0x005f }
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r12 = 0
            goto L_0x003b
        L_0x003a:
            r12 = 1
        L_0x003b:
            boolean r0 = r9.j()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x004a
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.j> r0 = r10.c     // Catch:{ all -> 0x005f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x005f }
            r0.put(r1, r9)     // Catch:{ all -> 0x005f }
        L_0x004a:
            monitor-exit(r10)     // Catch:{ all -> 0x005f }
            okhttp3.internal.http2.k r0 = r10.E
            r0.q(r6, r8, r11)
            monitor-exit(r7)
            if (r12 == 0) goto L_0x0058
            okhttp3.internal.http2.k r11 = r10.E
            r11.flush()
        L_0x0058:
            return r9
        L_0x0059:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException
            r11.<init>()
            throw r11
        L_0x005f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L_0x0062:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.B(java.util.List, boolean):okhttp3.internal.http2.j");
    }

    /* access modifiers changed from: package-private */
    public void C(int i2, okio.g gVar, int i3, boolean z2) {
        okio.e eVar = new okio.e();
        long j2 = (long) i3;
        gVar.L0(j2);
        gVar.c2(eVar, j2);
        if (eVar.size() == j2) {
            D(new f("OkHttp %s Push Data[%s]", new Object[]{this.f, Integer.valueOf(i2)}, i2, eVar, i3, z2));
            return;
        }
        throw new IOException(eVar.size() + " != " + i3);
    }

    /* access modifiers changed from: package-private */
    public void F(int i2, List<a> list, boolean z2) {
        try {
            D(new C0660e("OkHttp %s Push Headers[%s]", new Object[]{this.f, Integer.valueOf(i2)}, i2, list, z2));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void G(int i2, List<a> list) {
        synchronized (this) {
            if (this.G.contains(Integer.valueOf(i2))) {
                d0(i2, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.G.add(Integer.valueOf(i2));
            try {
                D(new d("OkHttp %s Push Request[%s]", new Object[]{this.f, Integer.valueOf(i2)}, i2, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void I(int i2, ErrorCode errorCode) {
        D(new g("OkHttp %s Push Reset[%s]", new Object[]{this.f, Integer.valueOf(i2)}, i2, errorCode));
    }

    /* access modifiers changed from: package-private */
    public boolean J(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    /* access modifiers changed from: package-private */
    public synchronized j M(int i2) {
        j remove;
        remove = this.c.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    /* access modifiers changed from: package-private */
    public void O() {
        synchronized (this) {
            long j2 = this.w;
            long j3 = this.v;
            if (j2 >= j3) {
                this.v = j3 + 1;
                this.y = System.nanoTime() + 1000000000;
                try {
                    this.q.execute(new c("OkHttp %s ping", this.f));
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    public void Q(ErrorCode errorCode) {
        synchronized (this.E) {
            synchronized (this) {
                if (!this.p) {
                    this.p = true;
                    this.E.g(this.n, errorCode, rnf.a);
                }
            }
        }
    }

    public void U() {
        this.E.b();
        this.E.p(this.B);
        int d2 = this.B.d();
        if (d2 != 65535) {
            this.E.r(0, (long) (d2 - AudioDriver.SPOTIFY_MAX_VOLUME));
        }
        new Thread(this.F).start();
    }

    /* access modifiers changed from: package-private */
    public synchronized void W(long j2) {
        long j3 = this.z + j2;
        this.z = j3;
        if (j3 >= ((long) (this.B.d() / 2))) {
            f0(0, this.z);
            this.z = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.E.i());
        r6 = (long) r3;
        r8.A -= r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b0(int r9, boolean r10, okio.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            okhttp3.internal.http2.k r12 = r8.E
            r12.d(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0067
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.A     // Catch:{ InterruptedException -> 0x0058 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.j> r3 = r8.c     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0030:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0056 }
            int r4 = (int) r3     // Catch:{ all -> 0x0056 }
            okhttp3.internal.http2.k r3 = r8.E     // Catch:{ all -> 0x0056 }
            int r3 = r3.i()     // Catch:{ all -> 0x0056 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0056 }
            long r4 = r8.A     // Catch:{ all -> 0x0056 }
            long r6 = (long) r3     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.A = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            okhttp3.internal.http2.k r4 = r8.E
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            r4.d(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x0065
        L_0x0058:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException
            r9.<init>()
            throw r9
        L_0x0065:
            monitor-exit(r8)
            throw r9
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.b0(int, boolean, okio.e, long):void");
    }

    /* access modifiers changed from: package-private */
    public void c0(boolean z2, int i2, int i3) {
        try {
            this.E.l(z2, i2, i3);
        } catch (IOException unused) {
            try {
                ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                r(errorCode, errorCode);
            } catch (IOException unused2) {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        r(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    /* access modifiers changed from: package-private */
    public void d0(int i2, ErrorCode errorCode) {
        try {
            this.q.execute(new a("OkHttp %s stream %d", new Object[]{this.f, Integer.valueOf(i2)}, i2, errorCode));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void f0(int i2, long j2) {
        try {
            this.q.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void r(ErrorCode errorCode, ErrorCode errorCode2) {
        IOException e;
        j[] jVarArr = null;
        try {
            Q(errorCode);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.c.isEmpty()) {
                jVarArr = (j[]) this.c.values().toArray(new j[this.c.size()]);
                this.c.clear();
            }
        }
        if (jVarArr != null) {
            for (j jVar : jVarArr) {
                try {
                    jVar.d(errorCode2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.E.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.D.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.q.shutdown();
        this.r.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized j s(int i2) {
        return this.c.get(Integer.valueOf(i2));
    }

    public synchronized boolean v(long j2) {
        if (this.p) {
            return false;
        }
        if (this.w >= this.v || j2 < this.y) {
            return true;
        }
        return false;
    }

    public synchronized int w() {
        return this.C.e(Integer.MAX_VALUE);
    }
}
