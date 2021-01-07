package io.reactivex.internal.operators.flowable;

import com.spotify.base.java.logging.Logger;
import io.reactivex.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class b0<T> extends a<T, T> implements c0 {
    private final String f;
    private final AtomicInteger n = new AtomicInteger(0);
    private final AtomicInteger o = new AtomicInteger(0);
    private final Map<Integer, String> p = Collections.synchronizedMap(new HashMap(50));

    private final class a implements j<T>, vpf {
        private final upf<? super T> a;
        private vpf b;
        private boolean c;
        private String f;
        private final int n;

        a(upf<? super T> upf, int i) {
            this.a = upf;
            this.n = i;
        }

        private ArrayList<StackTraceElement> a(StackTraceElement[] stackTraceElementArr) {
            ArrayList<StackTraceElement> arrayList = new ArrayList<>();
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                String className = stackTraceElement.getClassName();
                if (className.startsWith("com.spotify") && !className.startsWith("com.spotify.rxjava")) {
                    arrayList.add(stackTraceElement);
                }
            }
            return arrayList;
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.b.cancel();
            synchronized (this) {
                Logger.b("Decreased counter (%s) to %d", b0.this.f, Integer.valueOf(b0.this.n.decrementAndGet()));
            }
            ArrayList<StackTraceElement> a2 = a(Thread.currentThread().getStackTrace());
            if (!a2.isEmpty()) {
                Logger.g("%s: Unsubscribed (%d): %s. Original subscription line: %s", b0.this.f, Integer.valueOf(b0.this.n.get()), a2.get(0).toString(), this.f);
            }
            b0.this.p.remove(Integer.valueOf(this.n));
            this.f = null;
        }

        @Override // defpackage.vpf
        public void n(long j) {
            this.b.n(j);
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (!this.c) {
                this.c = true;
                this.a.onComplete();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.c) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.c = true;
            this.a.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.c) {
                this.a.onNext(t);
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.b, vpf)) {
                this.b = vpf;
                this.a.onSubscribe(this);
                Logger.b("Increased counter (%s) to %d", b0.this.f, Integer.valueOf(b0.this.n.incrementAndGet()));
                ArrayList<StackTraceElement> a2 = a(Thread.currentThread().getStackTrace());
                if (!a2.isEmpty()) {
                    StackTraceElement stackTraceElement = a2.get(0);
                    this.f = stackTraceElement.toString();
                    Logger.g("%s: Subscribed (%d): %s", b0.this.f, Integer.valueOf(b0.this.n.get()), stackTraceElement.toString());
                }
                if (this.f != null) {
                    b0.this.p.put(Integer.valueOf(this.n), this.f);
                }
            }
        }
    }

    public b0(g<T> gVar, String str) {
        super(gVar);
        this.f = str;
    }

    @Override // io.reactivex.internal.operators.flowable.c0
    public List<String> b() {
        return gf0.a(this.p.values());
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe((j) new a(upf, this.o.incrementAndGet()));
    }
}
