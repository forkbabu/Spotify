package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.SystemClock;
import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.measurement.o3;

public final class o9 extends p9 {
    private final AlarmManager d = ((AlarmManager) super.i().getSystemService("alarm"));
    private final j e;
    private Integer f;

    protected o9(r9 r9Var) {
        super(r9Var);
        this.e = new n9(this, r9Var.f0(), r9Var);
    }

    private final int w() {
        if (this.f == null) {
            String valueOf = String.valueOf(super.i().getPackageName());
            this.f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f.intValue();
    }

    private final PendingIntent x() {
        Context i = super.i();
        return PendingIntent.getBroadcast(i, 0, new Intent().setClassName(i, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.p9
    public final boolean r() {
        this.d.cancel(x());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        ((JobScheduler) super.i().getSystemService("jobscheduler")).cancel(w());
        return false;
    }

    public final void u(long j) {
        o();
        Context i = super.i();
        if (!x4.b(i)) {
            super.l().L().a("Receiver not registered/enabled");
        }
        if (!z9.W(i)) {
            super.l().L().a("Service not registered/enabled");
        }
        v();
        super.l().M().b("Scheduling upload, millis", Long.valueOf(j));
        ((d) super.d()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        if (j < Math.max(0L, t.x.a(null).longValue()) && !this.e.d()) {
            this.e.c(j);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Context i2 = super.i();
            ComponentName componentName = new ComponentName(i2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int w = w();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            o3.a(i2, new JobInfo.Builder(w, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        this.d.setInexactRepeating(2, elapsedRealtime, Math.max(t.s.a(null).longValue(), j), x());
    }

    public final void v() {
        o();
        super.l().M().a("Unscheduling upload");
        this.d.cancel(x());
        this.e.e();
        if (Build.VERSION.SDK_INT >= 24) {
            ((JobScheduler) super.i().getSystemService("jobscheduler")).cancel(w());
        }
    }
}
