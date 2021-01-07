package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;
import com.google.android.gms.tasks.j;
import com.google.firebase.crashlytics.internal.settings.d;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class c0 {
    private final Context a;
    private final com.google.firebase.c b;
    private final i0 c;
    private final long d = System.currentTimeMillis();
    private e0 e;
    private e0 f;
    private boolean g;
    private m h;
    private final n0 i;
    private final ez j;
    private final xy k;
    private ExecutorService l;
    private h m;
    private sy n;

    /* access modifiers changed from: package-private */
    public class a implements Callable<g<Void>> {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public g<Void> call() {
            return c0.a(c0.this, this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        final /* synthetic */ d a;

        b(d dVar) {
            this.a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.a(c0.this, this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Callable<Boolean> {
        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            try {
                boolean d = c0.this.e.d();
                ty f = ty.f();
                f.b("Initialization marker file removed: " + d);
                return Boolean.valueOf(d);
            } catch (Exception e) {
                ty.f().e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    public c0(com.google.firebase.c cVar, n0 n0Var, sy syVar, i0 i0Var, ez ezVar, xy xyVar, ExecutorService executorService) {
        this.b = cVar;
        this.c = i0Var;
        this.a = cVar.g();
        this.i = n0Var;
        this.n = syVar;
        this.j = ezVar;
        this.k = xyVar;
        this.l = executorService;
        this.m = new h(executorService);
    }

    static g a(c0 c0Var, d dVar) {
        g<Void> gVar;
        c0Var.m.b();
        c0Var.e.a();
        ty.f().b("Initialization marker file created.");
        c0Var.h.x();
        try {
            c0Var.j.a(b0.b(c0Var));
            com.google.firebase.crashlytics.internal.settings.c cVar = (com.google.firebase.crashlytics.internal.settings.c) dVar;
            t00 l2 = cVar.l();
            if (!l2.a().a) {
                ty.f().b("Collection of crash reports disabled in Crashlytics settings.");
                gVar = j.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            } else {
                if (!c0Var.h.E(l2.b().a)) {
                    ty.f().b("Could not finalize previous sessions.");
                }
                gVar = c0Var.h.V(1.0f, cVar.j());
            }
        } catch (Exception e2) {
            ty.f().e("Crashlytics encountered a problem during asynchronous initialization.", e2);
            gVar = j.d(e2);
        } catch (Throwable th) {
            c0Var.k();
            throw th;
        }
        c0Var.k();
        return gVar;
    }

    private void h(d dVar) {
        Future<?> submit = this.l.submit(new b(dVar));
        ty.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            ty.f().e("Crashlytics was interrupted during initialization.", e2);
        } catch (ExecutionException e3) {
            ty.f().e("Problem encountered during Crashlytics initialization.", e3);
        } catch (TimeoutException e4) {
            ty.f().e("Crashlytics timed out during initialization.", e4);
        }
    }

    public g<Boolean> d() {
        m mVar = this.h;
        if (mVar.y.compareAndSet(false, true)) {
            return mVar.v.a();
        }
        ty.f().b("checkForUnsentReports should only be called once per execution.");
        return j.e(Boolean.FALSE);
    }

    public g<Void> e() {
        m mVar = this.h;
        mVar.w.e(Boolean.FALSE);
        return mVar.x.a();
    }

    public boolean f() {
        return this.g;
    }

    public g<Void> g(d dVar) {
        ExecutorService executorService = this.l;
        a aVar = new a(dVar);
        int i2 = z0.c;
        h hVar = new h();
        executorService.execute(new b1(aVar, hVar));
        return hVar.a();
    }

    public void i(String str) {
        this.h.e0(System.currentTimeMillis() - this.d, str);
    }

    public void j(Throwable th) {
        this.h.a0(Thread.currentThread(), th);
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.m.d(new c());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean l(com.google.firebase.crashlytics.internal.settings.d r27) {
        /*
        // Method dump skipped, instructions count: 408
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.c0.l(com.google.firebase.crashlytics.internal.settings.d):boolean");
    }

    public g<Void> m() {
        m mVar = this.h;
        mVar.w.e(Boolean.TRUE);
        return mVar.x.a();
    }

    public void n(Boolean bool) {
        this.c.d(bool);
    }

    public void o(String str, String str2) {
        this.h.T(str, str2);
    }

    public void p(String str) {
        this.h.U(str);
    }
}
