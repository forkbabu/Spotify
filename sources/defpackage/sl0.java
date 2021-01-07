package defpackage;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.s;
import io.reactivex.schedulers.a;
import java.util.concurrent.TimeUnit;

/* renamed from: sl0  reason: default package */
public class sl0 implements il0 {
    private final kl0 a;
    private final rl0 b;
    private volatile b c = EmptyDisposable.INSTANCE;

    public sl0(kl0 kl0, rl0 rl0) {
        this.a = kl0;
        this.b = rl0;
    }

    public /* synthetic */ void a() {
        this.a.d("Periodic scheduler completed.");
    }

    public /* synthetic */ void b(Throwable th) {
        this.a.a(th, "Error running periodic scheduler.");
    }

    public synchronized void c(Runnable runnable) {
        if (this.c.d()) {
            s<R> Q = s.f0(30, 30, TimeUnit.SECONDS, a.a()).o0(a.c()).a1(this.b.a().s0(Boolean.FALSE), ql0.a).Q(nl0.a);
            ml0 ml0 = new ml0(runnable);
            io.reactivex.internal.functions.a.d(2, "capacityHint");
            this.c = new ObservableConcatMapCompletable(Q, ml0, ErrorMode.IMMEDIATE, 2).subscribe(new ol0(this), new pl0(this));
        }
    }

    public synchronized void d() {
        this.c.dispose();
    }
}
