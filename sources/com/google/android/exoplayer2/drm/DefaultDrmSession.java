package com.google.android.exoplayer2.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.drm.q;
import com.google.android.exoplayer2.drm.r;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.m;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* access modifiers changed from: package-private */
public class DefaultDrmSession<T extends q> implements DrmSession<T> {
    public final List<l.b> a;
    private final r<T> b;
    private final a<T> c;
    private final b<T> d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final HashMap<String, String> h;
    private final m<k> i;
    private final v j;
    final u k;
    final UUID l;
    final DefaultDrmSession<T>.e m;
    private int n;
    private int o;
    private HandlerThread p;
    private DefaultDrmSession<T>.c q;
    private T r;
    private DrmSession.DrmSessionException s;
    private byte[] t;
    private byte[] u;
    private r.a v;
    private r.d w;

    public static final class UnexpectedDrmSessionException extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnexpectedDrmSessionException(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Unexpected "
                java.lang.StringBuilder r0 = defpackage.je.V0(r0)
                java.lang.Class r1 = r3.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.UnexpectedDrmSessionException.<init>(java.lang.Throwable):void");
        }
    }

    public interface a<T extends q> {
    }

    public interface b<T extends q> {
    }

    /* access modifiers changed from: private */
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x008d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
        @Override // android.os.Handler
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r14.obj
                com.google.android.exoplayer2.drm.DefaultDrmSession$d r0 = (com.google.android.exoplayer2.drm.DefaultDrmSession.d) r0
                r1 = 1
                int r2 = r14.what     // Catch:{ Exception -> 0x0034 }
                if (r2 == 0) goto L_0x0023
                if (r2 != r1) goto L_0x001d
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this     // Catch:{ Exception -> 0x0034 }
                com.google.android.exoplayer2.drm.u r3 = r2.k     // Catch:{ Exception -> 0x0034 }
                java.util.UUID r2 = r2.l     // Catch:{ Exception -> 0x0034 }
                java.lang.Object r4 = r0.c     // Catch:{ Exception -> 0x0034 }
                com.google.android.exoplayer2.drm.r$a r4 = (com.google.android.exoplayer2.drm.r.a) r4     // Catch:{ Exception -> 0x0034 }
                com.spotify.mobile.android.video.drm.j r3 = (com.spotify.mobile.android.video.drm.j) r3
                byte[] r1 = r3.a(r2, r4)
                goto L_0x008f
            L_0x001d:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                r2.<init>()
                throw r2
            L_0x0023:
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this
                com.google.android.exoplayer2.drm.u r3 = r2.k
                java.util.UUID r2 = r2.l
                java.lang.Object r4 = r0.c
                com.google.android.exoplayer2.drm.r$d r4 = (com.google.android.exoplayer2.drm.r.d) r4
                com.spotify.mobile.android.video.drm.j r3 = (com.spotify.mobile.android.video.drm.j) r3
                byte[] r1 = r3.b(r2, r4)
                goto L_0x008f
            L_0x0034:
                r2 = move-exception
                java.lang.Object r3 = r14.obj
                com.google.android.exoplayer2.drm.DefaultDrmSession$d r3 = (com.google.android.exoplayer2.drm.DefaultDrmSession.d) r3
                boolean r4 = r3.a
                r5 = 0
                if (r4 != 0) goto L_0x0040
            L_0x003e:
                r1 = 0
                goto L_0x008b
            L_0x0040:
                int r4 = r3.d
                int r4 = r4 + r1
                r3.d = r4
                com.google.android.exoplayer2.drm.DefaultDrmSession r6 = com.google.android.exoplayer2.drm.DefaultDrmSession.this
                com.google.android.exoplayer2.upstream.v r6 = com.google.android.exoplayer2.drm.DefaultDrmSession.i(r6)
                r7 = 3
                com.google.android.exoplayer2.upstream.t r6 = (com.google.android.exoplayer2.upstream.t) r6
                int r6 = r6.b(r7)
                if (r4 <= r6) goto L_0x0055
                goto L_0x003e
            L_0x0055:
                boolean r4 = r2 instanceof java.io.IOException
                if (r4 == 0) goto L_0x005d
                r4 = r2
                java.io.IOException r4 = (java.io.IOException) r4
                goto L_0x0062
            L_0x005d:
                com.google.android.exoplayer2.drm.DefaultDrmSession$UnexpectedDrmSessionException r4 = new com.google.android.exoplayer2.drm.DefaultDrmSession$UnexpectedDrmSessionException
                r4.<init>(r2)
            L_0x0062:
                r10 = r4
                com.google.android.exoplayer2.drm.DefaultDrmSession r4 = com.google.android.exoplayer2.drm.DefaultDrmSession.this
                com.google.android.exoplayer2.upstream.v r4 = com.google.android.exoplayer2.drm.DefaultDrmSession.i(r4)
                r7 = 3
                long r8 = android.os.SystemClock.elapsedRealtime()
                long r11 = r3.b
                long r8 = r8 - r11
                int r11 = r3.d
                r6 = r4
                com.google.android.exoplayer2.upstream.t r6 = (com.google.android.exoplayer2.upstream.t) r6
                long r3 = r6.c(r7, r8, r10, r11)
                r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r8 != 0) goto L_0x0084
                goto L_0x003e
            L_0x0084:
                android.os.Message r5 = android.os.Message.obtain(r14)
                r13.sendMessageDelayed(r5, r3)
            L_0x008b:
                if (r1 == 0) goto L_0x008e
                return
            L_0x008e:
                r1 = r2
            L_0x008f:
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this
                com.google.android.exoplayer2.drm.DefaultDrmSession<T>$e r2 = r2.m
                int r14 = r14.what
                java.lang.Object r0 = r0.c
                android.util.Pair r0 = android.util.Pair.create(r0, r1)
                android.os.Message r14 = r2.obtainMessage(r14, r0)
                r14.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.c.handleMessage(android.os.Message):void");
        }
    }

    /* access modifiers changed from: private */
    public static final class d {
        public final boolean a;
        public final long b;
        public final Object c;
        public int d;

        public d(boolean z, long j, Object obj) {
            this.a = z;
            this.b = j;
            this.c = obj;
        }
    }

    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession.g(DefaultDrmSession.this, obj, obj2);
            } else if (i == 1) {
                DefaultDrmSession.h(DefaultDrmSession.this, obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, r<T> rVar, a<T> aVar, b<T> bVar, List<l.b> list, int i2, boolean z, boolean z2, byte[] bArr, HashMap<String, String> hashMap, u uVar, Looper looper, m<k> mVar, v vVar) {
        if (i2 == 1 || i2 == 3) {
            bArr.getClass();
        }
        this.l = uuid;
        this.c = aVar;
        this.d = bVar;
        this.b = rVar;
        this.e = i2;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.u = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.h = hashMap;
        this.k = uVar;
        this.i = mVar;
        this.j = vVar;
        this.n = 2;
        this.m = new e(looper);
    }

    static void g(DefaultDrmSession defaultDrmSession, Object obj, Object obj2) {
        if (obj != defaultDrmSession.w) {
            return;
        }
        if (defaultDrmSession.n == 2 || defaultDrmSession.l()) {
            defaultDrmSession.w = null;
            if (obj2 instanceof Exception) {
                ((DefaultDrmSessionManager.e) defaultDrmSession.c).a((Exception) obj2);
                return;
            }
            try {
                defaultDrmSession.b.i((byte[]) obj2);
                DefaultDrmSessionManager.e eVar = (DefaultDrmSessionManager.e) defaultDrmSession.c;
                for (DefaultDrmSession defaultDrmSession2 : DefaultDrmSessionManager.this.m) {
                    defaultDrmSession2.p();
                }
                DefaultDrmSessionManager.this.m.clear();
            } catch (Exception e2) {
                ((DefaultDrmSessionManager.e) defaultDrmSession.c).a(e2);
            }
        }
    }

    static void h(DefaultDrmSession defaultDrmSession, Object obj, Object obj2) {
        if (obj == defaultDrmSession.v && defaultDrmSession.l()) {
            defaultDrmSession.v = null;
            if (obj2 instanceof Exception) {
                defaultDrmSession.n((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (defaultDrmSession.e == 3) {
                    r<T> rVar = defaultDrmSession.b;
                    byte[] bArr2 = defaultDrmSession.u;
                    int i2 = f0.a;
                    rVar.k(bArr2, bArr);
                    defaultDrmSession.i.b(g.a);
                    return;
                }
                byte[] k2 = defaultDrmSession.b.k(defaultDrmSession.t, bArr);
                int i3 = defaultDrmSession.e;
                if (!((i3 != 2 && (i3 != 0 || defaultDrmSession.u == null)) || k2 == null || k2.length == 0)) {
                    defaultDrmSession.u = k2;
                }
                defaultDrmSession.n = 4;
                defaultDrmSession.i.b(h.a);
            } catch (Exception e2) {
                defaultDrmSession.n(e2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f A[Catch:{ NumberFormatException -> 0x0093 }] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sessionId"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j(boolean r11) {
        /*
            r10 = this;
            boolean r0 = r10.g
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            byte[] r0 = r10.t
            int r1 = com.google.android.exoplayer2.util.f0.a
            int r1 = r10.e
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x003e
            if (r1 == r2) goto L_0x003e
            if (r1 == r3) goto L_0x002f
            r0 = 3
            if (r1 == r0) goto L_0x0018
            goto L_0x00d8
        L_0x0018:
            byte[] r1 = r10.u
            r1.getClass()
            byte[] r1 = r10.t
            r1.getClass()
            boolean r1 = r10.v()
            if (r1 == 0) goto L_0x00d8
            byte[] r1 = r10.u
            r10.s(r1, r0, r11)
            goto L_0x00d8
        L_0x002f:
            byte[] r1 = r10.u
            if (r1 == 0) goto L_0x0039
            boolean r1 = r10.v()
            if (r1 == 0) goto L_0x00d8
        L_0x0039:
            r10.s(r0, r3, r11)
            goto L_0x00d8
        L_0x003e:
            byte[] r1 = r10.u
            if (r1 != 0) goto L_0x0047
            r10.s(r0, r2, r11)
            goto L_0x00d8
        L_0x0047:
            int r1 = r10.n
            r2 = 4
            if (r1 == r2) goto L_0x0052
            boolean r1 = r10.v()
            if (r1 == 0) goto L_0x00d8
        L_0x0052:
            java.util.UUID r1 = com.google.android.exoplayer2.u.d
            java.util.UUID r4 = r10.l
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0062
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00b2
        L_0x0062:
            java.util.Map r1 = r10.u()
            if (r1 != 0) goto L_0x006a
            r1 = 0
            goto L_0x009b
        L_0x006a:
            android.util.Pair r4 = new android.util.Pair
            java.lang.String r5 = "LicenseDurationRemaining"
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.Object r5 = r1.get(r5)     // Catch:{ NumberFormatException -> 0x0080 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ NumberFormatException -> 0x0080 }
            if (r5 == 0) goto L_0x0080
            long r8 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0080 }
            goto L_0x0081
        L_0x0080:
            r8 = r6
        L_0x0081:
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            java.lang.String r8 = "PlaybackDurationRemaining"
            java.lang.Object r1 = r1.get(r8)     // Catch:{ NumberFormatException -> 0x0093 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x0093 }
            if (r1 == 0) goto L_0x0093
            long r6 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0093 }
        L_0x0093:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r4.<init>(r5, r1)
            r1 = r4
        L_0x009b:
            r1.getClass()
            java.lang.Object r4 = r1.first
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r6 = r1.longValue()
            long r4 = java.lang.Math.min(r4, r6)
        L_0x00b2:
            int r1 = r10.e
            if (r1 != 0) goto L_0x00c0
            r6 = 60
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x00c0
            r10.s(r0, r3, r11)
            goto L_0x00d8
        L_0x00c0:
            r0 = 0
            int r11 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x00cf
            com.google.android.exoplayer2.drm.KeysExpiredException r11 = new com.google.android.exoplayer2.drm.KeysExpiredException
            r11.<init>()
            r10.m(r11)
            goto L_0x00d8
        L_0x00cf:
            r10.n = r2
            com.google.android.exoplayer2.util.m<com.google.android.exoplayer2.drm.k> r11 = r10.i
            com.google.android.exoplayer2.drm.g r0 = com.google.android.exoplayer2.drm.g.a
            r11.b(r0)
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.j(boolean):void");
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean l() {
        int i2 = this.n;
        return i2 == 3 || i2 == 4;
    }

    private void m(Exception exc) {
        this.s = new DrmSession.DrmSessionException(exc);
        this.i.b(new b(exc));
        if (this.n != 4) {
            this.n = 1;
        }
    }

    private void n(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            ((DefaultDrmSessionManager.e) this.c).b(this);
        } else {
            m(exc);
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean r(boolean z) {
        if (l()) {
            return true;
        }
        try {
            byte[] f2 = this.b.f();
            this.t = f2;
            this.r = this.b.c(f2);
            this.i.b(i.a);
            this.n = 3;
            this.t.getClass();
            return true;
        } catch (NotProvisionedException e2) {
            if (z) {
                ((DefaultDrmSessionManager.e) this.c).b(this);
                return false;
            }
            m(e2);
            return false;
        } catch (Exception e3) {
            m(e3);
            return false;
        }
    }

    private void s(byte[] bArr, int i2, boolean z) {
        try {
            r.a l2 = this.b.l(bArr, this.a, i2, this.h);
            this.v = l2;
            DefaultDrmSession<T>.c cVar = this.q;
            int i3 = f0.a;
            l2.getClass();
            cVar.getClass();
            cVar.obtainMessage(1, new d(z, SystemClock.elapsedRealtime(), l2)).sendToTarget();
        } catch (Exception e2) {
            n(e2);
        }
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    private boolean v() {
        try {
            this.b.g(this.t, this.u);
            return true;
        } catch (Exception e2) {
            Log.e("DefaultDrmSession", "Error trying to restore keys.", e2);
            m(e2);
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void a() {
        boolean z = false;
        g.m(this.o >= 0);
        int i2 = this.o + 1;
        this.o = i2;
        if (i2 == 1) {
            if (this.n == 2) {
                z = true;
            }
            g.m(z);
            HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
            this.p = handlerThread;
            handlerThread.start();
            this.q = new c(this.p.getLooper());
            if (r(true)) {
                j(true);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean b() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final T c() {
        return this.r;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void d() {
        int i2 = this.o - 1;
        this.o = i2;
        if (i2 == 0) {
            this.n = 0;
            DefaultDrmSession<T>.e eVar = this.m;
            int i3 = f0.a;
            eVar.removeCallbacksAndMessages(null);
            this.q.removeCallbacksAndMessages(null);
            this.q = null;
            this.p.quit();
            this.p = null;
            this.r = null;
            this.s = null;
            this.v = null;
            this.w = null;
            byte[] bArr = this.t;
            if (bArr != null) {
                this.b.j(bArr);
                this.t = null;
                this.i.b(a.a);
            }
            DefaultDrmSessionManager.l(((c) this.d).a, this);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public byte[] e() {
        return this.u;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException f() {
        if (this.n == 1) {
            return this.s;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.n;
    }

    public boolean k(byte[] bArr) {
        return Arrays.equals(this.t, bArr);
    }

    public void o(int i2) {
        if (i2 == 2 && this.e == 0 && this.n == 4) {
            int i3 = f0.a;
            j(false);
        }
    }

    public void p() {
        if (r(false)) {
            j(true);
        }
    }

    public void q(Exception exc) {
        m(exc);
    }

    public void t() {
        r.d e2 = this.b.e();
        this.w = e2;
        DefaultDrmSession<T>.c cVar = this.q;
        int i2 = f0.a;
        e2.getClass();
        cVar.getClass();
        cVar.obtainMessage(0, new d(true, SystemClock.elapsedRealtime(), e2)).sendToTarget();
    }

    public Map<String, String> u() {
        byte[] bArr = this.t;
        if (bArr == null) {
            return null;
        }
        return this.b.b(bArr);
    }
}
