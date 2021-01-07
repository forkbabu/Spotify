package com.spotify.mobile.android.video.offline;

import com.google.android.exoplayer2.offline.k;
import com.google.android.exoplayer2.offline.n;
import com.google.android.exoplayer2.offline.o;
import com.google.common.collect.ImmutableList;
import com.spotify.android.storage.e;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.video.offline.BetamaxOfflineManager;
import com.spotify.mobile.android.video.offline.exception.BetamaxDownloadException;
import com.spotify.mobile.android.video.offline.exception.ErrorType;
import com.spotify.mobile.android.video.offline.n;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class t {
    private final n a;
    private final x b;
    private final r82 c;
    private final e d;
    private final File e;
    private final boolean f;
    private final a g;
    private final Map<String, k> h;
    private b i = EmptyDisposable.INSTANCE;

    protected class a implements n.d {
        protected a() {
        }

        @Override // com.google.android.exoplayer2.offline.n.d
        public void a(n nVar, k kVar) {
            String str = kVar.a.a;
            BetamaxOfflineManager.BetamaxDownloadState g = t.g((k) t.this.h.get(str));
            BetamaxOfflineManager.BetamaxDownloadState g2 = t.g(kVar);
            t.this.h.put(str, kVar);
            BetamaxOfflineManager.BetamaxDownloadState betamaxDownloadState = BetamaxOfflineManager.BetamaxDownloadState.STATE_DOWNLOADING;
            if (g2 == betamaxDownloadState) {
                t tVar = t.this;
                t.d(tVar, tVar.c);
            } else if (g2 == BetamaxOfflineManager.BetamaxDownloadState.STATE_COMPLETED) {
                t.this.c.g(str, kVar.a());
            } else {
                boolean z = true;
                if (g == betamaxDownloadState && g2 == BetamaxOfflineManager.BetamaxDownloadState.STATE_STOPPED) {
                    t.this.c.k(str, kVar.a());
                    return;
                }
                if (!(g == betamaxDownloadState && (g2 == BetamaxOfflineManager.BetamaxDownloadState.STATE_QUEUED || g2 == BetamaxOfflineManager.BetamaxDownloadState.STATE_FAILED))) {
                    z = false;
                }
                if (z) {
                    t.this.a.l(kVar.a.a, 2);
                    t.this.c.i(str, kVar.a(), t.f(t.this, kVar.a.a, kVar.a(), g2));
                }
            }
        }

        @Override // com.google.android.exoplayer2.offline.n.d
        public void b(n nVar, k kVar) {
            String str = kVar.a.a;
            t.this.c.f(str, kVar.a());
            t.this.h.remove(str);
        }

        @Override // com.google.android.exoplayer2.offline.n.d
        public /* synthetic */ void c(n nVar, co coVar, int i) {
            o.c(this, nVar, coVar, i);
        }

        @Override // com.google.android.exoplayer2.offline.n.d
        public /* synthetic */ void d(n nVar) {
            o.a(this, nVar);
        }

        @Override // com.google.android.exoplayer2.offline.n.d
        public /* synthetic */ void e(n nVar) {
            o.b(this, nVar);
        }
    }

    public t(n nVar, x xVar, r82 r82, e eVar, File file, boolean z) {
        this.a = nVar;
        this.b = xVar;
        this.c = r82;
        this.d = eVar;
        this.e = file;
        this.f = z;
        this.g = new a();
        this.h = new HashMap();
    }

    static void d(t tVar, r82 r82) {
        if (tVar.i.d()) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int i2 = g.b;
            tVar.i = new FlowableOnBackpressureDrop(g.M(1000, 1000, timeUnit, io.reactivex.schedulers.a.a())).subscribe(new b(tVar, r82));
        }
    }

    static BetamaxDownloadException f(t tVar, String str, long j, BetamaxOfflineManager.BetamaxDownloadState betamaxDownloadState) {
        long j2;
        if (tVar.f) {
            try {
                tVar.d.d(tVar.e.getAbsolutePath());
                j2 = tVar.d.a();
            } catch (IOException e2) {
                Assertion.w("Unable to verify disk space availability.", e2);
                j2 = -1;
            }
            if (j2 != -1 && j2 < 52428800) {
                long i2 = tVar.i(str);
                Locale locale = Locale.US;
                String format = String.format(locale, "availableSpace=%dMB  estimatedMediaSize=%dMB downloaded=%dMB", Long.valueOf(j2 / 1048576), Long.valueOf(i2 / 1048576), Long.valueOf(j / 1048576));
                Logger.b(format, new Object[0]);
                return new BetamaxDownloadException(String.format(locale, "Unable to download media %s. %s", str, format), ErrorType.ERROR_DISK_FULL);
            }
        }
        return new BetamaxDownloadException(betamaxDownloadState.toString(), ErrorType.ERROR_UNKNOWN);
    }

    /* access modifiers changed from: private */
    public static BetamaxOfflineManager.BetamaxDownloadState g(k kVar) {
        BetamaxOfflineManager.BetamaxDownloadState betamaxDownloadState = BetamaxOfflineManager.BetamaxDownloadState.STATE_NOT_STARTED;
        if (kVar == null) {
            return betamaxDownloadState;
        }
        int i2 = kVar.b;
        if (i2 == 0) {
            return BetamaxOfflineManager.BetamaxDownloadState.STATE_QUEUED;
        }
        if (i2 == 1) {
            return BetamaxOfflineManager.BetamaxDownloadState.STATE_STOPPED;
        }
        if (i2 == 2) {
            return BetamaxOfflineManager.BetamaxDownloadState.STATE_DOWNLOADING;
        }
        if (i2 == 3) {
            return BetamaxOfflineManager.BetamaxDownloadState.STATE_COMPLETED;
        }
        return i2 == 4 ? BetamaxOfflineManager.BetamaxDownloadState.STATE_FAILED : betamaxDownloadState;
    }

    public e0 h(String str) {
        k kVar = this.h.get(str);
        if (!(kVar != null && kVar.b == 3)) {
            return null;
        }
        h0 b2 = this.b.b(str);
        n.b bVar = new n.b();
        bVar.d(kVar.a.c.toString());
        bVar.b(b2);
        bVar.c(kVar.a.f);
        bVar.c(ImmutableList.copyOf((Collection) bVar.e()));
        return bVar.a();
    }

    public long i(String str) {
        k kVar = this.h.get(str);
        if (g(kVar) != BetamaxOfflineManager.BetamaxDownloadState.STATE_NOT_STARTED) {
            double b2 = (double) kVar.b();
            long a2 = kVar.a();
            if (b2 > 0.0d) {
                double d2 = (double) a2;
                Double.isNaN(d2);
                Double.isNaN(b2);
                return ((long) (d2 / b2)) * 100;
            }
        }
        return -1;
    }

    public BetamaxOfflineManager.BetamaxDownloadState j(String str) {
        return g(this.h.get(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k() {
        /*
            r5 = this;
            com.google.android.exoplayer2.offline.n r0 = r5.a
            com.google.android.exoplayer2.offline.y r0 = r0.c()
            r1 = 0
            int[] r2 = new int[r1]     // Catch:{ IOException -> 0x002e }
            com.google.android.exoplayer2.offline.i r0 = (com.google.android.exoplayer2.offline.i) r0
            com.google.android.exoplayer2.offline.m r0 = r0.f(r2)
        L_0x000f:
            boolean r2 = r0.V1()     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0023
            com.google.android.exoplayer2.offline.k r2 = r0.D0()     // Catch:{ all -> 0x0027 }
            java.util.Map<java.lang.String, com.google.android.exoplayer2.offline.k> r3 = r5.h     // Catch:{ all -> 0x0027 }
            com.google.android.exoplayer2.offline.DownloadRequest r4 = r2.a     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.a     // Catch:{ all -> 0x0027 }
            r3.put(r4, r2)     // Catch:{ all -> 0x0027 }
            goto L_0x000f
        L_0x0023:
            r0.close()
            goto L_0x0036
        L_0x0027:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x002d }
        L_0x002d:
            throw r2
        L_0x002e:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Failed to load downloads"
            com.spotify.base.java.logging.Logger.e(r0, r2, r1)
        L_0x0036:
            com.google.android.exoplayer2.offline.n r0 = r5.a
            com.spotify.mobile.android.video.offline.t$a r1 = r5.g
            r0.b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.offline.t.k():void");
    }

    public boolean l(String str) {
        k kVar = this.h.get(str);
        return kVar != null && kVar.b == 3;
    }

    public void m(r82 r82, Long l) {
        ArrayList arrayList = new ArrayList();
        for (k kVar : this.h.values()) {
            if (g(kVar) == BetamaxOfflineManager.BetamaxDownloadState.STATE_DOWNLOADING) {
                arrayList.add(kVar);
            }
        }
        if (arrayList.isEmpty()) {
            this.i.dispose();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            r82.j(kVar2.a.a, kVar2.a());
        }
    }

    public void n() {
        if (!this.i.d()) {
            this.i.dispose();
        }
        this.a.h(this.g);
        this.h.clear();
    }
}
