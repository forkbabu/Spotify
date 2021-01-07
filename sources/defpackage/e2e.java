package defpackage;

import android.content.Context;
import android.os.Build;
import defpackage.h2e;
import java.nio.file.Path;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.h;

/* renamed from: e2e  reason: default package */
public interface e2e {
    public static final a a = a.a;

    /* renamed from: e2e$a */
    public static final class a {
        static final /* synthetic */ a a = new a();

        /* renamed from: e2e$a$a  reason: collision with other inner class name */
        static final class CallableC0589a<V> implements Callable<Path> {
            final /* synthetic */ Context a;

            CallableC0589a(Context context) {
                this.a = context;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public Path call() {
                return this.a.getDir("service-tombstones", 0).toPath();
            }
        }

        private a() {
        }

        public final h2e.a a(Context context, Random random, cqe cqe) {
            h.e(context, "context");
            h.e(random, "random");
            h.e(cqe, "clock");
            if (Build.VERSION.SDK_INT < 26) {
                return new d2e();
            }
            g2e g2e = g2e.l;
            CallableC0589a aVar = new CallableC0589a(context);
            h.e(aVar, "pathComputation");
            h.e(random, "random");
            h.e(cqe, "clock");
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            Future submit = newSingleThreadScheduledExecutor.submit(aVar);
            h.d(submit, "graveyard");
            h.d(newSingleThreadScheduledExecutor, "executor");
            return new c2e(cqe, new g2e(submit, newSingleThreadScheduledExecutor, random, cqe, false));
        }
    }
}
