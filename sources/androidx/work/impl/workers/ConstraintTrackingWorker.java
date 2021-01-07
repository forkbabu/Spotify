package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.l;
import androidx.work.j;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements a9 {
    private static final String s = j.f("ConstraintTrkngWrkr");
    private WorkerParameters n;
    final Object o = new Object();
    volatile boolean p = false;
    androidx.work.impl.utils.futures.a<ListenableWorker.a> q = androidx.work.impl.utils.futures.a.y();
    private ListenableWorker r;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.r();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        final /* synthetic */ ListenableFuture a;

        b(ListenableFuture listenableFuture) {
            this.a = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.o) {
                if (ConstraintTrackingWorker.this.p) {
                    ConstraintTrackingWorker.this.q();
                } else {
                    ConstraintTrackingWorker.this.q.A(this.a);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.n = workerParameters;
    }

    @Override // defpackage.a9
    public void b(List<String> list) {
        j.c().a(s, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.o) {
            this.p = true;
        }
    }

    @Override // defpackage.a9
    public void f(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public na g() {
        return l.k(a()).q();
    }

    @Override // androidx.work.ListenableWorker
    public boolean i() {
        ListenableWorker listenableWorker = this.r;
        return listenableWorker != null && listenableWorker.i();
    }

    @Override // androidx.work.ListenableWorker
    public void k() {
        ListenableWorker listenableWorker = this.r;
        if (listenableWorker != null) {
            listenableWorker.o();
        }
    }

    @Override // androidx.work.ListenableWorker
    public ListenableFuture<ListenableWorker.a> n() {
        c().execute(new a());
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        this.q.t(new ListenableWorker.a.C0051a());
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.q.t(new ListenableWorker.a.b());
    }

    /* access modifiers changed from: package-private */
    public void r() {
        String e = e().e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(e)) {
            j.c().b(s, "No worker to delegate to.", new Throwable[0]);
            p();
            return;
        }
        ListenableWorker a2 = h().a(a(), e, this.n);
        this.r = a2;
        if (a2 == null) {
            j.c().a(s, "No worker to delegate to.", new Throwable[0]);
            p();
            return;
        }
        ga p2 = ((ia) l.k(a()).o().z()).p(d().toString());
        if (p2 == null) {
            p();
            return;
        }
        b9 b9Var = new b9(a(), l.k(a()).q(), this);
        b9Var.d(Collections.singletonList(p2));
        if (b9Var.a(d().toString())) {
            j.c().a(s, String.format("Constraints met for delegate %s", e), new Throwable[0]);
            try {
                ListenableFuture<ListenableWorker.a> n2 = this.r.n();
                n2.addListener(new b(n2), c());
            } catch (Throwable th) {
                j c = j.c();
                String str = s;
                c.a(str, String.format("Delegated worker %s threw exception in startWork.", e), th);
                synchronized (this.o) {
                    if (this.p) {
                        j.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        q();
                    } else {
                        p();
                    }
                }
            }
        } else {
            j.c().a(s, String.format("Constraints not met for delegate %s. Requesting retry.", e), new Throwable[0]);
            q();
        }
    }
}
