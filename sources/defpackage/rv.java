package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.j;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: rv  reason: default package */
public class rv {
    private static ScheduledExecutorService k;
    private final Object a;
    private final PowerManager.WakeLock b;
    private WorkSource c;
    private final int d;
    private final String e;
    private final Context f;
    private boolean g;
    private final Map<String, Integer[]> h;
    private int i;
    private AtomicInteger j;

    public rv(Context context, int i2, String str) {
        String packageName = context == null ? null : context.getPackageName();
        this.a = this;
        this.g = true;
        this.h = new HashMap();
        Collections.synchronizedSet(new HashSet());
        this.j = new AtomicInteger(0);
        g.k(context, "WakeLock: context must not be null");
        g.h(str, "WakeLock: wakeLockName must not be empty");
        this.d = i2;
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            this.e = str.length() != 0 ? "*gcore*:".concat(str) : new String("*gcore*:");
        } else {
            this.e = str;
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i2, str);
        this.b = newWakeLock;
        if (j.c(context)) {
            WorkSource a2 = j.a(context, i.a(packageName) ? context.getPackageName() : packageName);
            this.c = a2;
            if (a2 != null && j.c(applicationContext)) {
                WorkSource workSource = this.c;
                if (workSource != null) {
                    workSource.add(a2);
                } else {
                    this.c = a2;
                }
                try {
                    newWakeLock.setWorkSource(this.c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
                    e2.toString();
                }
            }
        }
        if (k == null) {
            k = qr.a().a();
        }
    }

    /* access modifiers changed from: private */
    public final void d() {
        if (this.b.isHeld()) {
            try {
                this.b.release();
            } catch (RuntimeException e2) {
                if (e2.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.e).concat(" was already released!"), e2);
                } else {
                    throw e2;
                }
            }
            this.b.isHeld();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r3 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (r7.i == 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        com.google.android.gms.cast.framework.f.d(r7.b, null);
        com.google.android.gms.common.util.j.b(r7.c);
        r7.i++;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(long r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r7.j
            r0.incrementAndGet()
            boolean r0 = r7.g
            r1 = 0
            if (r0 == 0) goto L_0x000d
            android.text.TextUtils.isEmpty(r1)
        L_0x000d:
            java.lang.Object r0 = r7.a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r7.h     // Catch:{ all -> 0x0089 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0089 }
            r3 = 0
            if (r2 == 0) goto L_0x001d
            int r2 = r7.i     // Catch:{ all -> 0x0089 }
            if (r2 <= 0) goto L_0x002c
        L_0x001d:
            android.os.PowerManager$WakeLock r2 = r7.b     // Catch:{ all -> 0x0089 }
            boolean r2 = r2.isHeld()     // Catch:{ all -> 0x0089 }
            if (r2 != 0) goto L_0x002c
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r7.h     // Catch:{ all -> 0x0089 }
            r2.clear()     // Catch:{ all -> 0x0089 }
            r7.i = r3     // Catch:{ all -> 0x0089 }
        L_0x002c:
            boolean r2 = r7.g     // Catch:{ all -> 0x0089 }
            r4 = 1
            if (r2 == 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r7.h     // Catch:{ all -> 0x0089 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0089 }
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2     // Catch:{ all -> 0x0089 }
            if (r2 != 0) goto L_0x004a
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r7.h     // Catch:{ all -> 0x0089 }
            java.lang.Integer[] r5 = new java.lang.Integer[r4]     // Catch:{ all -> 0x0089 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0089 }
            r5[r3] = r6     // Catch:{ all -> 0x0089 }
            r2.put(r1, r5)     // Catch:{ all -> 0x0089 }
            r3 = 1
            goto L_0x0057
        L_0x004a:
            r5 = r2[r3]     // Catch:{ all -> 0x0089 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0089 }
            int r5 = r5 + r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0089 }
            r2[r3] = r5     // Catch:{ all -> 0x0089 }
        L_0x0057:
            if (r3 != 0) goto L_0x0061
        L_0x0059:
            boolean r2 = r7.g     // Catch:{ all -> 0x0089 }
            if (r2 != 0) goto L_0x0070
            int r2 = r7.i     // Catch:{ all -> 0x0089 }
            if (r2 != 0) goto L_0x0070
        L_0x0061:
            android.os.PowerManager$WakeLock r2 = r7.b     // Catch:{ all -> 0x0089 }
            com.google.android.gms.cast.framework.f.d(r2, r1)     // Catch:{ all -> 0x0089 }
            android.os.WorkSource r1 = r7.c     // Catch:{ all -> 0x0089 }
            com.google.android.gms.common.util.j.b(r1)     // Catch:{ all -> 0x0089 }
            int r1 = r7.i     // Catch:{ all -> 0x0089 }
            int r1 = r1 + r4
            r7.i = r1     // Catch:{ all -> 0x0089 }
        L_0x0070:
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            android.os.PowerManager$WakeLock r0 = r7.b
            r0.acquire()
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0088
            java.util.concurrent.ScheduledExecutorService r0 = defpackage.rv.k
            sv r1 = new sv
            r1.<init>(r7)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r8, r2)
        L_0x0088:
            return
        L_0x0089:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv.a(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (r4 == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r6.i == 1) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        com.google.android.gms.cast.framework.f.d(r6.b, null);
        com.google.android.gms.common.util.j.b(r6.c);
        r6.i--;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r6.j
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L_0x0019
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r6.e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " release without a matched acquire!"
            java.lang.String r1 = r1.concat(r2)
            android.util.Log.e(r0, r1)
        L_0x0019:
            boolean r0 = r6.g
            r1 = 0
            if (r0 == 0) goto L_0x0021
            android.text.TextUtils.isEmpty(r1)
        L_0x0021:
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            boolean r2 = r6.g     // Catch:{ all -> 0x006f }
            r3 = 1
            if (r2 == 0) goto L_0x0053
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r6.h     // Catch:{ all -> 0x006f }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x006f }
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2     // Catch:{ all -> 0x006f }
            r4 = 0
            if (r2 != 0) goto L_0x0035
            goto L_0x0051
        L_0x0035:
            r5 = r2[r4]     // Catch:{ all -> 0x006f }
            int r5 = r5.intValue()     // Catch:{ all -> 0x006f }
            if (r5 != r3) goto L_0x0044
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r6.h     // Catch:{ all -> 0x006f }
            r2.remove(r1)     // Catch:{ all -> 0x006f }
            r4 = 1
            goto L_0x0051
        L_0x0044:
            r5 = r2[r4]     // Catch:{ all -> 0x006f }
            int r5 = r5.intValue()     // Catch:{ all -> 0x006f }
            int r5 = r5 - r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x006f }
            r2[r4] = r5     // Catch:{ all -> 0x006f }
        L_0x0051:
            if (r4 != 0) goto L_0x005b
        L_0x0053:
            boolean r2 = r6.g     // Catch:{ all -> 0x006f }
            if (r2 != 0) goto L_0x006a
            int r2 = r6.i     // Catch:{ all -> 0x006f }
            if (r2 != r3) goto L_0x006a
        L_0x005b:
            android.os.PowerManager$WakeLock r2 = r6.b     // Catch:{ all -> 0x006f }
            com.google.android.gms.cast.framework.f.d(r2, r1)     // Catch:{ all -> 0x006f }
            android.os.WorkSource r1 = r6.c     // Catch:{ all -> 0x006f }
            com.google.android.gms.common.util.j.b(r1)     // Catch:{ all -> 0x006f }
            int r1 = r6.i     // Catch:{ all -> 0x006f }
            int r1 = r1 - r3
            r6.i = r1     // Catch:{ all -> 0x006f }
        L_0x006a:
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            r6.d()
            return
        L_0x006f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv.b():void");
    }

    public void c(boolean z) {
        this.b.setReferenceCounted(z);
        this.g = z;
    }
}
