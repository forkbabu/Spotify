package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y8 implements Runnable {
    private final w8 a;
    private final a4 b;
    private final JobParameters c;

    y8(w8 w8Var, a4 a4Var, JobParameters jobParameters) {
        this.a = w8Var;
        this.b = a4Var;
        this.c = jobParameters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(this.b, this.c);
    }
}
