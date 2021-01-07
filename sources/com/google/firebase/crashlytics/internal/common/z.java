package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.report.model.Report;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

class z implements Callable<g<Void>> {
    final /* synthetic */ Boolean a;
    final /* synthetic */ m.k b;

    z(m.k kVar, Boolean bool) {
        this.b = kVar;
        this.a = bool;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public g<Void> call() {
        List<Report> b2 = m.this.n.b();
        if (!this.a.booleanValue()) {
            ty.f().b("Reports are being deleted.");
            for (File file : m.this.O()) {
                file.delete();
            }
            m.this.n.getClass();
            for (Report report : b2) {
                report.remove();
            }
            m.this.t.j();
            m.this.x.e(null);
            return j.e(null);
        }
        ty.f().b("Reports are being sent.");
        boolean booleanValue = this.a.booleanValue();
        m.this.c.b(booleanValue);
        Executor c = m.this.f.c();
        return this.b.a.t(c, new y(this, b2, booleanValue, c));
    }
}
