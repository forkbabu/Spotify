package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import androidx.annotation.RecentlyNonNull;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.internal.b1;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: sr  reason: default package */
public class sr {
    private static final Object b = new Object();
    private static volatile sr c;
    private ConcurrentHashMap<ServiceConnection, ServiceConnection> a = new ConcurrentHashMap<>();

    private sr() {
    }

    @RecentlyNonNull
    public static sr b() {
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    c = new sr();
                }
            }
        }
        sr srVar = c;
        g.l(srVar);
        return srVar;
    }

    public boolean a(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    public void c(@RecentlyNonNull Context context, @RecentlyNonNull ServiceConnection serviceConnection) {
        if (!(!(serviceConnection instanceof b1)) || !this.a.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService(this.a.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                this.a.remove(serviceConnection);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(@androidx.annotation.RecentlyNonNull android.content.Context r5, @androidx.annotation.RecentlyNonNull java.lang.String r6, @androidx.annotation.RecentlyNonNull android.content.Intent r7, @androidx.annotation.RecentlyNonNull android.content.ServiceConnection r8, int r9) {
        /*
            r4 = this;
            android.content.ComponentName r0 = r7.getComponent()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0009
            goto L_0x0023
        L_0x0009:
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r3 = "com.google.android.gms"
            r3.equals(r0)
            wr r3 = defpackage.xr.a(r5)     // Catch:{ NameNotFoundException -> 0x0023 }
            android.content.pm.ApplicationInfo r0 = r3.c(r0, r1)     // Catch:{ NameNotFoundException -> 0x0023 }
            int r0 = r0.flags     // Catch:{ NameNotFoundException -> 0x0023 }
            r3 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            goto L_0x0063
        L_0x0027:
            boolean r0 = r8 instanceof com.google.android.gms.common.internal.b1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x005e
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r0 = r4.a
            java.lang.Object r0 = r0.putIfAbsent(r8, r8)
            android.content.ServiceConnection r0 = (android.content.ServiceConnection) r0
            if (r0 == 0) goto L_0x004b
            if (r8 == r0) goto L_0x004b
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r8
            r0[r2] = r6
            r6 = 2
            java.lang.String r1 = r7.getAction()
            r0[r6] = r1
            java.lang.String r6 = "Duplicate binding with the same ServiceConnection: %s, %s, %s."
            java.lang.String.format(r6, r0)
        L_0x004b:
            boolean r5 = r5.bindService(r7, r8, r9)     // Catch:{ all -> 0x0057 }
            if (r5 != 0) goto L_0x0062
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r6 = r4.a
            r6.remove(r8, r8)
            goto L_0x0062
        L_0x0057:
            r5 = move-exception
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r6 = r4.a
            r6.remove(r8, r8)
            throw r5
        L_0x005e:
            boolean r5 = r5.bindService(r7, r8, r9)
        L_0x0062:
            r1 = r5
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr.d(android.content.Context, java.lang.String, android.content.Intent, android.content.ServiceConnection, int):boolean");
    }
}
