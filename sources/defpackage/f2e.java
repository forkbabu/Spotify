package defpackage;

import android.content.Context;
import android.os.Build;
import defpackage.e2e;
import defpackage.h2e;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.h;

/* renamed from: f2e  reason: default package */
public final class f2e implements fjf<h2e.a> {
    private final wlf<Context> a;
    private final wlf<Random> b;
    private final wlf<cqe> c;

    public f2e(wlf<Context> wlf, wlf<Random> wlf2, wlf<cqe> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.a.get();
        Random random = this.b.get();
        cqe cqe = this.c.get();
        e2e.a aVar = e2e.a;
        h.e(context, "context");
        h.e(random, "random");
        h.e(cqe, "clock");
        if (Build.VERSION.SDK_INT < 26) {
            return new d2e();
        }
        g2e g2e = g2e.l;
        e2e.a.CallableC0589a aVar2 = new e2e.a.CallableC0589a(context);
        h.e(aVar2, "pathComputation");
        h.e(random, "random");
        h.e(cqe, "clock");
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Future submit = newSingleThreadScheduledExecutor.submit(aVar2);
        h.d(submit, "graveyard");
        h.d(newSingleThreadScheduledExecutor, "executor");
        return new c2e(cqe, new g2e(submit, newSingleThreadScheduledExecutor, random, cqe, false));
    }
}
