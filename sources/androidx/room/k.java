package androidx.room;

import androidx.lifecycle.LiveData;
import androidx.room.g;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
public class k<T> extends LiveData<T> {
    final RoomDatabase k;
    final boolean l;
    final Callable<T> m;
    private final f n;
    final g.c o;
    final AtomicBoolean p = new AtomicBoolean(true);
    final AtomicBoolean q = new AtomicBoolean(false);
    final AtomicBoolean r = new AtomicBoolean(false);
    final Runnable s = new a();
    final Runnable t = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            if (k.this.r.compareAndSet(false, true)) {
                g j = k.this.k.j();
                g.c cVar = k.this.o;
                j.getClass();
                j.a(new g.e(j, cVar));
            }
            do {
                if (k.this.q.compareAndSet(false, true)) {
                    T t = null;
                    z = false;
                    while (k.this.p.compareAndSet(true, false)) {
                        try {
                            try {
                                t = k.this.m.call();
                                z = true;
                            } catch (Exception e) {
                                throw new RuntimeException("Exception while computing database live data.", e);
                            }
                        } finally {
                            k.this.q.set(false);
                        }
                    }
                    if (z) {
                        k.this.l(t);
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } while (k.this.p.get());
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executor;
            boolean g = k.this.g();
            if (k.this.p.compareAndSet(false, true) && g) {
                k kVar = k.this;
                if (kVar.l) {
                    executor = kVar.k.m();
                } else {
                    executor = kVar.k.l();
                }
                executor.execute(k.this.s);
            }
        }
    }

    class c extends g.c {
        c(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.g.c
        public void a(Set<String> set) {
            y0 e = y0.e();
            Runnable runnable = k.this.t;
            if (e.b()) {
                runnable.run();
            } else {
                e.c(runnable);
            }
        }
    }

    k(RoomDatabase roomDatabase, f fVar, boolean z, Callable<T> callable, String[] strArr) {
        this.k = roomDatabase;
        this.l = z;
        this.m = callable;
        this.n = fVar;
        this.o = new c(strArr);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void j() {
        Executor executor;
        this.n.a.add(this);
        if (this.l) {
            executor = this.k.m();
        } else {
            executor = this.k.l();
        }
        executor.execute(this.s);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void k() {
        this.n.a.remove(this);
    }
}
