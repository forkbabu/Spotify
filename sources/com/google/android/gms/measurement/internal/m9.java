package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.measurement.c8;

/* access modifiers changed from: package-private */
public final class m9 {
    final /* synthetic */ e9 a;

    m9(e9 e9Var) {
        this.a = e9Var;
    }

    private final void c(long j, boolean z) {
        this.a.b();
        if (this.a.a.n()) {
            this.a.h().u.b(j);
            ((d) this.a.d()).getClass();
            this.a.l().M().b("Session started, time", Long.valueOf(SystemClock.elapsedRealtime()));
            Long valueOf = Long.valueOf(j / 1000);
            this.a.o().Z("auto", "_sid", valueOf, j);
            this.a.h().r.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.a.j().r(t.m0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.a.o().T("auto", "_s", j, bundle);
            if (c8.b() && this.a.j().r(t.r0)) {
                String a2 = this.a.h().z.a();
                if (!TextUtils.isEmpty(a2)) {
                    this.a.o().T("auto", "_ssr", j, je.E("_ffr", a2));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.a.b();
        n4 h = this.a.h();
        ((d) this.a.d()).getClass();
        if (h.v(System.currentTimeMillis())) {
            this.a.h().r.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.l().M().a("Detected application was in foreground");
                ((d) this.a.d()).getClass();
                c(System.currentTimeMillis(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(long j, boolean z) {
        this.a.b();
        this.a.E();
        if (this.a.h().v(j)) {
            this.a.h().r.a(true);
        }
        this.a.h().u.b(j);
        if (this.a.h().r.b()) {
            c(j, z);
        }
    }
}
