package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.f;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import com.google.firebase.crashlytics.internal.report.model.Report;
import java.util.List;
import java.util.concurrent.Executor;

class y implements f<q00, Void> {
    final /* synthetic */ List a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Executor c;
    final /* synthetic */ z d;

    y(z zVar, List list, boolean z, Executor executor) {
        this.d = zVar;
        this.a = list;
        this.b = z;
        this.c = executor;
    }

    /* Return type fixed from 'com.google.android.gms.tasks.g' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.tasks.f
    public g<Void> a(q00 q00) {
        q00 q002 = q00;
        if (q002 == null) {
            ty.f().h("Received null app settings, cannot send reports during app startup.");
            return j.e(null);
        }
        for (Report report : this.a) {
            if (report.getType() == Report.Type.JAVA) {
                m.w(q002.e, report.d());
            }
        }
        m.d(m.this);
        ((a0) m.this.k).a(q002).e(this.a, this.b, this.d.b.b);
        m.this.t.k(this.c, DataTransportState.d(q002));
        m.this.x.e(null);
        return j.e(null);
    }
}
