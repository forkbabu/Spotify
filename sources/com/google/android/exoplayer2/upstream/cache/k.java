package com.google.android.exoplayer2.upstream.cache;

import android.util.Pair;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.m;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class k {
    public static final /* synthetic */ int a = 0;

    public interface a {
        void a(long j, long j2, long j3);
    }

    /* access modifiers changed from: private */
    public static final class b {
        private final a a;
        private long b;
        private long c;

        public b(a aVar) {
            this.a = aVar;
        }

        public void a(long j, long j2) {
            this.b = j;
            this.c = j2;
            this.a.a(j, j2, 0);
        }

        public void b(long j) {
            long j2 = this.c + j;
            this.c = j2;
            this.a.a(this.b, j2, j);
        }

        public void c(long j) {
            if (this.b == -1 && j != -1) {
                this.b = j;
                this.a.a(j, this.c, 0);
            }
        }
    }

    private static String a(m mVar, i iVar) {
        if (iVar == null) {
            iVar = a.a;
        }
        return iVar.a(mVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (r6 != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00be, code lost:
        if (e(r0) != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c0, code lost:
        r0 = com.google.android.exoplayer2.util.f0.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r31.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e8, code lost:
        r26 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x011c, code lost:
        r1 = com.google.android.exoplayer2.util.f0.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r31.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0123, code lost:
        r26 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0125, code lost:
        r0 = com.google.android.exoplayer2.util.f0.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r31.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0133 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b4 A[ExcHandler: all (r0v23 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:36:0x00aa] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f0 A[SYNTHETIC, Splitter:B:63:0x00f0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(com.google.android.exoplayer2.upstream.m r28, com.google.android.exoplayer2.upstream.cache.Cache r29, com.google.android.exoplayer2.upstream.cache.i r30, com.google.android.exoplayer2.upstream.cache.d r31, byte[] r32, com.google.android.exoplayer2.util.PriorityTaskManager r33, int r34, com.google.android.exoplayer2.upstream.cache.k.a r35, java.util.concurrent.atomic.AtomicBoolean r36, boolean r37) {
        /*
        // Method dump skipped, instructions count: 349
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.k.b(com.google.android.exoplayer2.upstream.m, com.google.android.exoplayer2.upstream.cache.Cache, com.google.android.exoplayer2.upstream.cache.i, com.google.android.exoplayer2.upstream.cache.d, byte[], com.google.android.exoplayer2.util.PriorityTaskManager, int, com.google.android.exoplayer2.upstream.cache.k$a, java.util.concurrent.atomic.AtomicBoolean, boolean):void");
    }

    public static Pair<Long, Long> c(m mVar, Cache cache, i iVar) {
        String a2 = a(mVar, iVar);
        long j = mVar.e;
        long d = d(mVar, cache, a2);
        long j2 = j;
        long j3 = d;
        long j4 = 0;
        while (j3 != 0) {
            long d2 = cache.d(a2, j2, j3 != -1 ? j3 : Long.MAX_VALUE);
            if (d2 <= 0) {
                d2 = -d2;
                if (d2 == Long.MAX_VALUE) {
                    break;
                }
            } else {
                j4 += d2;
            }
            j2 += d2;
            if (j3 == -1) {
                d2 = 0;
            }
            j3 -= d2;
        }
        return Pair.create(Long.valueOf(d), Long.valueOf(j4));
    }

    private static long d(m mVar, Cache cache, String str) {
        long j = mVar.g;
        if (j != -1) {
            return j;
        }
        long a2 = n.a(cache.b(str));
        if (a2 == -1) {
            return -1;
        }
        return a2 - mVar.e;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable] */
    static boolean e(IOException iOException) {
        while (iOException != 0) {
            if ((iOException instanceof DataSourceException) && ((DataSourceException) iOException).reason == 0) {
                return true;
            }
            iOException = iOException.getCause();
        }
        return false;
    }

    public static void f(m mVar, Cache cache, i iVar) {
        for (j jVar : cache.l(a(mVar, iVar))) {
            try {
                cache.h(jVar);
            } catch (Cache.CacheException unused) {
            }
        }
    }

    private static void g(AtomicBoolean atomicBoolean) {
        if (Thread.interrupted() || (atomicBoolean != null && atomicBoolean.get())) {
            throw new InterruptedException();
        }
    }
}
