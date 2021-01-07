package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class n<T> {
    public static Executor e = Executors.newCachedThreadPool();
    private final Set<h<T>> a = new LinkedHashSet(1);
    private final Set<h<Throwable>> b = new LinkedHashSet(1);
    private final Handler c = new Handler(Looper.getMainLooper());
    private volatile l<T> d = null;

    private class a extends FutureTask<l<T>> {
        a(Callable<l<T>> callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (!isCancelled()) {
                try {
                    n.this.i((l) get());
                } catch (InterruptedException | ExecutionException e) {
                    n.this.i(new l(e));
                }
            }
        }
    }

    public n(Callable<l<T>> callable) {
        e.execute(new a(callable));
    }

    static void b(n nVar, Object obj) {
        synchronized (nVar) {
            Iterator it = new ArrayList(nVar.a).iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(obj);
            }
        }
    }

    static void c(n nVar, Throwable th) {
        synchronized (nVar) {
            ArrayList arrayList = new ArrayList(nVar.b);
            if (arrayList.isEmpty()) {
                ae.d("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void i(l<T> lVar) {
        if (this.d == null) {
            this.d = lVar;
            this.c.post(new m(this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized n<T> e(h<Throwable> hVar) {
        if (!(this.d == null || this.d.a() == null)) {
            hVar.a(this.d.a());
        }
        this.b.add(hVar);
        return this;
    }

    public synchronized n<T> f(h<T> hVar) {
        if (!(this.d == null || this.d.b() == null)) {
            hVar.a(this.d.b());
        }
        this.a.add(hVar);
        return this;
    }

    public synchronized n<T> g(h<Throwable> hVar) {
        this.b.remove(hVar);
        return this;
    }

    public synchronized n<T> h(h<T> hVar) {
        this.a.remove(hVar);
        return this;
    }
}
