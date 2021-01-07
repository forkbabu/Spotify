package com.facebook.appevents.internal;

import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.n;
import com.facebook.k;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class c implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ String b;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    if (a.f == null) {
                        l unused = a.f = new l(Long.valueOf(c.this.a), null);
                    }
                    if (a.e.get() <= 0) {
                        m.d(c.this.b, a.f, a.h);
                        l.a();
                        l unused2 = a.f = null;
                    }
                    synchronized (a.d) {
                        ScheduledFuture unused3 = a.c = null;
                    }
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    c(long j, String str) {
        this.a = j;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        if (!uf.c(this)) {
            try {
                if (a.f == null) {
                    l unused = a.f = new l(Long.valueOf(this.a), null);
                }
                a.f.j(Long.valueOf(this.a));
                if (a.e.get() <= 0) {
                    a aVar = new a();
                    synchronized (a.d) {
                        ScheduledExecutorService scheduledExecutorService = a.b;
                        n j = FetchedAppSettingsManager.j(k.e());
                        if (j == null) {
                            i = 60;
                        } else {
                            i = j.m();
                        }
                        ScheduledFuture unused2 = a.c = scheduledExecutorService.schedule(aVar, (long) i, TimeUnit.SECONDS);
                    }
                }
                long j2 = a.i;
                long j3 = 0;
                if (j2 > 0) {
                    j3 = (this.a - j2) / 1000;
                }
                e.b(this.b, j3);
                a.f.k();
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
