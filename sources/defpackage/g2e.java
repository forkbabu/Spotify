package defpackage;

import com.adjust.sdk.Constants;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.spotify.mobile.android.util.Assertion;
import defpackage.c2e;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.jvm.internal.h;

/* renamed from: g2e  reason: default package */
public final class g2e implements c2e.a {
    private static final long k = TimeUnit.SECONDS.toMillis(1);
    public static final g2e l = null;
    private final Charset a = Charset.forName(Constants.ENCODING);
    private final Object b = new Object();
    private final t1<Long, Pair<Future<Long>, Future<Boolean>>> c = new t1<>(10);
    private ScheduledFuture<?> d;
    private volatile long e;
    private final Future<Path> f;
    private final ScheduledExecutorService g;
    private final Random h;
    private final cqe i;
    private final boolean j;

    /* renamed from: g2e$a */
    static final class a<V> implements Callable<Long> {
        final /* synthetic */ g2e a;
        final /* synthetic */ long b;
        final /* synthetic */ String c;

        a(g2e g2e, boolean z, long j, long j2, String str) {
            this.a = g2e;
            this.b = j2;
            this.c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Long call() {
            return this.a.d(this.b, this.c);
        }
    }

    /* renamed from: g2e$b */
    static final class b<V> implements Callable<Boolean> {
        final /* synthetic */ Future a;
        final /* synthetic */ g2e b;

        b(Future future, g2e g2e, boolean z, long j, long j2, String str) {
            this.a = future;
            this.b = g2e;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            return Boolean.valueOf(g2e.c(this.b, this.a));
        }
    }

    /* renamed from: g2e$c */
    static final class c implements Runnable {
        final /* synthetic */ g2e a;

        c(g2e g2e) {
            this.a = g2e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.e();
        }
    }

    /* renamed from: g2e$d */
    static final class d implements Runnable {
        final /* synthetic */ g2e a;
        final /* synthetic */ long b;

        d(g2e g2e, long j) {
            this.a = g2e;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g2e g2e = this.a;
            ListenableFuture immediateFuture = Futures.immediateFuture(Long.valueOf(this.b));
            h.d(immediateFuture, "Futures.immediateFuture(id)");
            g2e.c(g2e, immediateFuture);
        }
    }

    public g2e(Future<Path> future, ScheduledExecutorService scheduledExecutorService, Random random, cqe cqe, boolean z) {
        h.e(future, "graveyard");
        h.e(scheduledExecutorService, "scheduler");
        h.e(random, "random");
        h.e(cqe, "clock");
        this.f = future;
        this.g = scheduledExecutorService;
        this.h = random;
        this.i = cqe;
        this.j = z;
    }

    public static final boolean c(g2e g2e, Future future) {
        g2e.getClass();
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Long l2 = (Long) future.get(0, timeUnit);
            if (l2 != null) {
                return Files.deleteIfExists(g2e.f.get(0, timeUnit).resolve(String.valueOf(l2.longValue())));
            }
            return false;
        } catch (InterruptedException e2) {
            Assertion.i("Unable to remove tombstone", e2);
            return false;
        } catch (ExecutionException e3) {
            Assertion.i("Unable to remove tombstone", e3);
            return false;
        } catch (IOException e4) {
            Assertion.i("Unable to remove tombstone", e4);
            return false;
        } catch (TimeoutException e5) {
            Assertion.i("Unable to remove tombstone", e5);
            return false;
        }
    }

    @Override // defpackage.c2e.a
    public void a(long j2, String str) {
        h.e(str, "serviceStartMetadata");
        if (this.d == null) {
            this.d = this.g.scheduleWithFixedDelay(new c(this), 20, 300, TimeUnit.SECONDS);
        }
        long b2 = this.i.b();
        boolean z = b2 - this.e > k;
        synchronized (this.b) {
            if (!this.j) {
                if (!z || this.h.nextFloat() >= 0.1f) {
                    this.c.put(Long.valueOf(j2), null);
                }
            }
            this.e = b2;
            ScheduledExecutorService scheduledExecutorService = this.g;
            a aVar = new a(this, z, b2, j2, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ScheduledFuture schedule = scheduledExecutorService.schedule(aVar, 2, timeUnit);
            h.d(schedule, "scheduler.schedule<Long?…SECONDS\n                )");
            this.c.put(Long.valueOf(j2), new Pair<>(schedule, this.g.schedule(new b(schedule, this, z, b2, j2, str), 8, timeUnit)));
        }
    }

    @Override // defpackage.c2e.a
    public void b(long j2) {
        Pair<Future<Long>, Future<Boolean>> remove;
        Future<Boolean> d2;
        Future<Long> c2;
        synchronized (this.b) {
            remove = this.c.remove(Long.valueOf(j2));
        }
        if (!(remove == null || (c2 = remove.c()) == null)) {
            c2.cancel(true);
        }
        if (!(remove == null || (d2 = remove.d()) == null)) {
            d2.cancel(true);
        }
        this.g.execute(new d(this, j2));
    }

    public final Long d(long j2, String str) {
        h.e(str, "metadata");
        try {
            Path resolve = this.f.get(0, TimeUnit.MILLISECONDS).resolve(String.valueOf(j2));
            h.d(resolve, "graveyard[0, TimeUnit.MI…solve(stoneId.toString())");
            if (Files.exists(resolve, new LinkOption[0])) {
                return null;
            }
            try {
                Charset charset = this.a;
                h.d(charset, "charset");
                byte[] bytes = str.getBytes(charset);
                h.d(bytes, "(this as java.lang.String).getBytes(charset)");
                Files.write(resolve, bytes, StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE);
                return Long.valueOf(j2);
            } catch (IOException unused) {
                return null;
            }
        } catch (ExecutionException e2) {
            Assertion.i("Unable to create tombstone with contents " + str, e2);
            return null;
        } catch (InterruptedException e3) {
            Assertion.i("Unable to create tombstone with contents " + str, e3);
            return null;
        } catch (TimeoutException e4) {
            Assertion.i("Unable to create tombstone with contents " + str, e4);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        defpackage.yif.j(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r8 = this;
            java.lang.String r0 = "Unable to report tombstone"
            java.util.concurrent.Future<java.nio.file.Path> r1 = r8.f     // Catch:{ IOException -> 0x0067, InterruptedException -> 0x0062, ExecutionException -> 0x005d, TimeoutException -> 0x0058 }
            r2 = 0
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IOException -> 0x0067, InterruptedException -> 0x0062, ExecutionException -> 0x005d, TimeoutException -> 0x0058 }
            java.lang.Object r1 = r1.get(r2, r4)     // Catch:{ IOException -> 0x0067, InterruptedException -> 0x0062, ExecutionException -> 0x005d, TimeoutException -> 0x0058 }
            java.nio.file.Path r1 = (java.nio.file.Path) r1     // Catch:{ IOException -> 0x0067, InterruptedException -> 0x0062, ExecutionException -> 0x005d, TimeoutException -> 0x0058 }
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1)     // Catch:{ IOException -> 0x0067, InterruptedException -> 0x0062, ExecutionException -> 0x005d, TimeoutException -> 0x0058 }
            r2 = 0
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x0051 }
        L_0x0017:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0051 }
            if (r4 == 0) goto L_0x004d
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0051 }
            java.nio.file.Path r4 = (java.nio.file.Path) r4     // Catch:{ all -> 0x0051 }
            byte[] r5 = java.nio.file.Files.readAllBytes(r4)     // Catch:{ IOException -> 0x0017 }
            java.lang.String r6 = "Files.readAllBytes(p)"
            kotlin.jvm.internal.h.d(r5, r6)     // Catch:{ IOException -> 0x0017 }
            java.nio.charset.Charset r6 = r8.a     // Catch:{ IOException -> 0x0017 }
            java.lang.String r7 = "charset"
            kotlin.jvm.internal.h.d(r6, r7)     // Catch:{ IOException -> 0x0017 }
            java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x0017 }
            r7.<init>(r5, r6)     // Catch:{ IOException -> 0x0017 }
            boolean r4 = java.nio.file.Files.deleteIfExists(r4)     // Catch:{ IOException -> 0x0017 }
            int r5 = r7.length()
            if (r5 <= 0) goto L_0x0044
            r5 = 1
            goto L_0x0045
        L_0x0044:
            r5 = 0
        L_0x0045:
            if (r5 == 0) goto L_0x0017
            if (r4 == 0) goto L_0x0017
            com.spotify.mobile.android.util.Assertion.v(r7)
            goto L_0x0017
        L_0x004d:
            defpackage.yif.j(r1, r2)
            goto L_0x006b
        L_0x0051:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r3 = move-exception
            defpackage.yif.j(r1, r2)
            throw r3
        L_0x0058:
            r1 = move-exception
            com.spotify.mobile.android.util.Assertion.i(r0, r1)
            goto L_0x006b
        L_0x005d:
            r1 = move-exception
            com.spotify.mobile.android.util.Assertion.i(r0, r1)
            goto L_0x006b
        L_0x0062:
            r1 = move-exception
            com.spotify.mobile.android.util.Assertion.i(r0, r1)
            goto L_0x006b
        L_0x0067:
            r1 = move-exception
            com.spotify.mobile.android.util.Assertion.i(r0, r1)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g2e.e():void");
    }
}
