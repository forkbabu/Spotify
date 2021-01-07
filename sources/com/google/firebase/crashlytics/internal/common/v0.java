package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.v;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public class v0 {
    private final f0 a;
    private final e00 b;
    private final o00 c;
    private final hz d;
    private final x0 e;
    private String f;

    v0(f0 f0Var, e00 e00, o00 o00, hz hzVar, x0 x0Var) {
        this.a = f0Var;
        this.b = e00;
        this.c = o00;
        this.d = hzVar;
        this.e = x0Var;
    }

    static boolean a(v0 v0Var, g gVar) {
        v0Var.getClass();
        if (gVar.r()) {
            g0 g0Var = (g0) gVar.n();
            ty f2 = ty.f();
            StringBuilder V0 = je.V0("Crashlytics report successfully enqueued to DataTransport: ");
            V0.append(g0Var.c());
            f2.b(V0.toString());
            v0Var.b.d(g0Var.c());
            return true;
        }
        ty.f().c("Crashlytics report could not be enqueued to DataTransport", gVar.m());
        return false;
    }

    private void f(Throwable th, Thread thread, String str, long j, boolean z) {
        String str2 = this.f;
        if (str2 == null) {
            ty.f().b("Cannot persist event, no currently open session");
            return;
        }
        boolean equals = str.equals("crash");
        CrashlyticsReport.d.AbstractC0117d a2 = this.a.a(th, thread, str, j, 4, 8, z);
        CrashlyticsReport.d.AbstractC0117d.b g = a2.g();
        String d2 = this.d.d();
        if (d2 != null) {
            CrashlyticsReport.d.AbstractC0117d.AbstractC0128d.a a3 = CrashlyticsReport.d.AbstractC0117d.AbstractC0128d.a();
            a3.b(d2);
            g.d(a3.a());
        } else {
            ty.f().b("No log data to include with this event.");
        }
        Map<String, String> a4 = this.e.a();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(a4.size());
        for (Map.Entry<String, String> entry : a4.entrySet()) {
            CrashlyticsReport.b.a a5 = CrashlyticsReport.b.a();
            a5.b(entry.getKey());
            a5.c(entry.getValue());
            arrayList.add(a5.a());
        }
        Collections.sort(arrayList, u0.a());
        if (!arrayList.isEmpty()) {
            CrashlyticsReport.d.AbstractC0117d.a.AbstractC0118a f2 = a2.b().f();
            f2.c(v.c(arrayList));
            g.b(f2.a());
        }
        this.b.m(g.a(), str2, equals);
    }

    public void b(String str, List<s0> list) {
        ArrayList arrayList = new ArrayList();
        for (s0 s0Var : list) {
            CrashlyticsReport.c.b a2 = s0Var.a();
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        e00 e00 = this.b;
        CrashlyticsReport.c.a a3 = CrashlyticsReport.c.a();
        a3.b(v.c(arrayList));
        e00.f(str, a3.a());
    }

    public void c(long j) {
        this.b.e(this.f, j);
    }

    public void d(String str, long j) {
        this.f = str;
        this.b.n(this.a.b(str, j));
    }

    public void e() {
        this.f = null;
    }

    public void g(Throwable th, Thread thread, long j) {
        f(th, thread, "crash", j, true);
    }

    public void h(Throwable th, Thread thread, long j) {
        f(th, thread, AppProtocol.LogMessage.SEVERITY_ERROR, j, false);
    }

    public void i() {
        String str = this.f;
        if (str == null) {
            ty.f().b("Could not persist user ID; no current session");
            return;
        }
        String b2 = this.e.b();
        if (b2 == null) {
            ty.f().b("Could not persist user ID; no user ID available");
        } else {
            this.b.o(b2, str);
        }
    }

    public void j() {
        this.b.c();
    }

    /* access modifiers changed from: package-private */
    public g<Void> k(Executor executor, DataTransportState dataTransportState) {
        CrashlyticsReport.Type type;
        CrashlyticsReport.Type type2 = CrashlyticsReport.Type.NATIVE;
        if (dataTransportState == DataTransportState.NONE) {
            ty.f().b("Send via DataTransport disabled. Removing DataTransport reports.");
            this.b.c();
            return j.e(null);
        }
        List<g0> l = this.b.l();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) l).iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            CrashlyticsReport b2 = g0Var.b();
            if (b2.j() != null) {
                type = CrashlyticsReport.Type.JAVA;
            } else if (b2.g() != null) {
                type = type2;
            } else {
                type = CrashlyticsReport.Type.INCOMPLETE;
            }
            if (type != type2 || dataTransportState == DataTransportState.ALL) {
                arrayList.add(this.c.d(g0Var).k(executor, t0.b(this)));
            } else {
                ty.f().b("Send native reports via DataTransport disabled. Removing DataTransport reports.");
                this.b.d(g0Var.c());
            }
        }
        return j.f(arrayList);
    }
}
