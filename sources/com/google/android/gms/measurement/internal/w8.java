package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.a9;

public final class w8<T extends Context & a9> {
    private final T a;

    public w8(T t) {
        this.a = t;
    }

    private final a4 i() {
        return f5.a(this.a, null, null).l();
    }

    public final int a(Intent intent, int i) {
        a4 l = f5.a(this.a, null, null).l();
        if (intent == null) {
            l.H().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        l.M().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            z8 z8Var = new z8(this, i, l, intent);
            r9 b = r9.b(this.a);
            b.k().y(new b9(b, z8Var));
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            i().E().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new g5(r9.b(this.a));
        }
        i().H().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        f5.a(this.a, null, null).l().M().a("Local AppMeasurementService is starting up");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(int i, a4 a4Var, Intent intent) {
        if (this.a.g(i)) {
            a4Var.M().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            i().M().a("Completed wakeful intent.");
            this.a.a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(a4 a4Var, JobParameters jobParameters) {
        a4Var.M().a("AppMeasurementJobService processed last upload request.");
        this.a.b(jobParameters, false);
    }

    public final boolean f(JobParameters jobParameters) {
        a4 l = f5.a(this.a, null, null).l();
        String string = jobParameters.getExtras().getString("action");
        l.M().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        y8 y8Var = new y8(this, l, jobParameters);
        r9 b = r9.b(this.a);
        b.k().y(new b9(b, y8Var));
        return true;
    }

    public final void g() {
        f5.a(this.a, null, null).l().M().a("Local AppMeasurementService is shutting down");
    }

    public final boolean h(Intent intent) {
        if (intent == null) {
            i().E().a("onUnbind called with null intent");
            return true;
        }
        i().M().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final void j(Intent intent) {
        if (intent == null) {
            i().E().a("onRebind called with null intent");
            return;
        }
        i().M().b("onRebind called. action", intent.getAction());
    }
}
