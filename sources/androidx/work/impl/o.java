package androidx.work.impl;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.e;
import androidx.work.j;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class o implements Runnable {
    static final String C = j.f("WorkerWrapper");
    ListenableFuture<ListenableWorker.a> A = null;
    private volatile boolean B;
    Context a;
    private String b;
    private List<e> c;
    private WorkerParameters.a f;
    ga n;
    ListenableWorker o;
    ListenableWorker.a p = new ListenableWorker.a.C0051a();
    private androidx.work.a q;
    private na r;
    private androidx.work.impl.foreground.a s;
    private WorkDatabase t;
    private ha u;
    private s9 v;
    private ka w;
    private List<String> x;
    private String y;
    androidx.work.impl.utils.futures.a<Boolean> z = androidx.work.impl.utils.futures.a.y();

    public static class a {
        Context a;
        androidx.work.impl.foreground.a b;
        na c;
        androidx.work.a d;
        WorkDatabase e;
        String f;
        List<e> g;
        WorkerParameters.a h = new WorkerParameters.a();

        public a(Context context, androidx.work.a aVar, na naVar, androidx.work.impl.foreground.a aVar2, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.c = naVar;
            this.b = aVar2;
            this.d = aVar;
            this.e = workDatabase;
            this.f = str;
        }
    }

    o(a aVar) {
        this.a = aVar.a;
        this.r = aVar.c;
        this.s = aVar.b;
        this.b = aVar.f;
        this.c = aVar.g;
        this.f = aVar.h;
        this.o = null;
        this.q = aVar.d;
        WorkDatabase workDatabase = aVar.e;
        this.t = workDatabase;
        this.u = workDatabase.z();
        this.v = this.t.t();
        this.w = this.t.A();
    }

    private void a(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            j.c().d(C, String.format("Worker result SUCCESS for %s", this.y), new Throwable[0]);
            if (this.n.c()) {
                f();
                return;
            }
            this.t.c();
            try {
                ((ia) this.u).z(WorkInfo.State.SUCCEEDED, this.b);
                ((ia) this.u).x(this.b, ((ListenableWorker.a.c) this.p).a());
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((ArrayList) ((t9) this.v).a(this.b)).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (((ia) this.u).n(str) == WorkInfo.State.BLOCKED && ((t9) this.v).b(str)) {
                        j.c().d(C, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                        ((ia) this.u).z(WorkInfo.State.ENQUEUED, str);
                        ((ia) this.u).y(str, currentTimeMillis);
                    }
                }
                this.t.s();
            } finally {
                this.t.h();
                g(false);
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            j.c().d(C, String.format("Worker result RETRY for %s", this.y), new Throwable[0]);
            e();
        } else {
            j.c().d(C, String.format("Worker result FAILURE for %s", this.y), new Throwable[0]);
            if (this.n.c()) {
                f();
            } else {
                i();
            }
        }
    }

    private void c(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((ia) this.u).n(str2) != WorkInfo.State.CANCELLED) {
                ((ia) this.u).z(WorkInfo.State.FAILED, str2);
            }
            linkedList.addAll(((t9) this.v).a(str2));
        }
    }

    private void e() {
        this.t.c();
        try {
            ((ia) this.u).z(WorkInfo.State.ENQUEUED, this.b);
            ((ia) this.u).y(this.b, System.currentTimeMillis());
            ((ia) this.u).u(this.b, -1);
            this.t.s();
        } finally {
            this.t.h();
            g(true);
        }
    }

    private void f() {
        this.t.c();
        try {
            ((ia) this.u).y(this.b, System.currentTimeMillis());
            ((ia) this.u).z(WorkInfo.State.ENQUEUED, this.b);
            ((ia) this.u).w(this.b);
            ((ia) this.u).u(this.b, -1);
            this.t.s();
        } finally {
            this.t.h();
            g(false);
        }
    }

    /* JADX INFO: finally extract failed */
    private void g(boolean z2) {
        ListenableWorker listenableWorker;
        this.t.c();
        try {
            if (((ArrayList) ((ia) this.t.z()).h()).isEmpty()) {
                e.a(this.a, RescheduleReceiver.class, false);
            }
            if (z2) {
                ((ia) this.u).u(this.b, -1);
            }
            if (!(this.n == null || (listenableWorker = this.o) == null || !listenableWorker.i())) {
                ((d) this.s).k(this.b);
            }
            this.t.s();
            this.t.h();
            this.z.t(Boolean.valueOf(z2));
        } catch (Throwable th) {
            this.t.h();
            throw th;
        }
    }

    private void h() {
        WorkInfo.State n2 = ((ia) this.u).n(this.b);
        if (n2 == WorkInfo.State.RUNNING) {
            j.c().a(C, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.b), new Throwable[0]);
            g(true);
            return;
        }
        j.c().a(C, String.format("Status for %s is %s; not doing any work", this.b, n2), new Throwable[0]);
        g(false);
    }

    private boolean j() {
        if (!this.B) {
            return false;
        }
        j.c().a(C, String.format("Work interrupted for %s", this.y), new Throwable[0]);
        WorkInfo.State n2 = ((ia) this.u).n(this.b);
        if (n2 == null) {
            g(false);
        } else {
            g(!n2.d());
        }
        return true;
    }

    public void b() {
        boolean z2;
        this.B = true;
        j();
        ListenableFuture<ListenableWorker.a> listenableFuture = this.A;
        if (listenableFuture != null) {
            z2 = listenableFuture.isDone();
            this.A.cancel(true);
        } else {
            z2 = false;
        }
        ListenableWorker listenableWorker = this.o;
        if (listenableWorker == null || z2) {
            j.c().a(C, String.format("WorkSpec %s is already done. Not interrupting.", this.n), new Throwable[0]);
        } else {
            listenableWorker.k();
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (!j()) {
            this.t.c();
            try {
                WorkInfo.State n2 = ((ia) this.u).n(this.b);
                ((fa) this.t.y()).a(this.b);
                if (n2 == null) {
                    g(false);
                } else if (n2 == WorkInfo.State.RUNNING) {
                    a(this.p);
                } else if (!n2.d()) {
                    e();
                }
                this.t.s();
            } finally {
                this.t.h();
            }
        }
        List<e> list = this.c;
        if (list != null) {
            for (e eVar : list) {
                eVar.a(this.b);
            }
            f.b(this.q, this.t, this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        this.t.c();
        try {
            c(this.b);
            ((ia) this.u).x(this.b, ((ListenableWorker.a.C0051a) this.p).a());
            this.t.s();
        } finally {
            this.t.h();
            g(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c1, code lost:
        if ((r0.b == r4 && r0.k > 0) != false) goto L_0x00c3;
     */
    @Override // java.lang.Runnable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 632
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.o.run():void");
    }
}
