package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.Map;

public abstract class LiveData<T> {
    static final Object j = new Object();
    final Object a;
    private c1<v<? super T>, LiveData<T>.c> b;
    int c;
    private volatile Object d;
    volatile Object e;
    private int f;
    private boolean g;
    private boolean h;
    private final Runnable i;

    class LifecycleBoundObserver extends LiveData<T>.c implements l {
        final n n;

        LifecycleBoundObserver(n nVar, v<? super T> vVar) {
            super(vVar);
            this.n = nVar;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.c
        public void b() {
            this.n.A().c(this);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.c
        public boolean c(n nVar) {
            return this.n == nVar;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.c
        public boolean d() {
            return this.n.A().b().compareTo(Lifecycle.State.STARTED) >= 0;
        }

        @Override // androidx.lifecycle.l
        public void p(n nVar, Lifecycle.Event event) {
            if (this.n.A().b() == Lifecycle.State.DESTROYED) {
                LiveData.this.m(this.a);
            } else {
                a(d());
            }
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: androidx.lifecycle.LiveData */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.e;
                LiveData.this.e = LiveData.j;
            }
            LiveData.this.n(obj);
        }
    }

    private class b extends LiveData<T>.c {
        b(LiveData liveData, v<? super T> vVar) {
            super(vVar);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.c
        public boolean d() {
            return true;
        }
    }

    /* access modifiers changed from: private */
    public abstract class c {
        final v<? super T> a;
        boolean b;
        int c = -1;

        c(v<? super T> vVar) {
            this.a = vVar;
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z) {
            if (z != this.b) {
                this.b = z;
                LiveData liveData = LiveData.this;
                int i = liveData.c;
                int i2 = 1;
                boolean z2 = i == 0;
                if (!z) {
                    i2 = -1;
                }
                liveData.c = i + i2;
                if (z2 && z) {
                    liveData.j();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.c == 0 && !this.b) {
                    liveData2.k();
                }
                if (this.b) {
                    LiveData.this.d(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
        }

        /* access modifiers changed from: package-private */
        public boolean c(n nVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean d();
    }

    public LiveData(T t) {
        this.a = new Object();
        this.b = new c1<>();
        this.c = 0;
        this.e = j;
        this.i = new a();
        this.d = t;
        this.f = 0;
    }

    static void b(String str) {
        if (!y0.e().b()) {
            throw new IllegalStateException(je.y0("Cannot invoke ", str, " on a background thread"));
        }
    }

    private void c(LiveData<T>.c cVar) {
        if (cVar.b) {
            if (!cVar.d()) {
                cVar.a(false);
                return;
            }
            int i2 = cVar.c;
            int i3 = this.f;
            if (i2 < i3) {
                cVar.c = i3;
                cVar.a.a((Object) this.d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(LiveData<T>.c cVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (cVar == null) {
                c1<K, V>.d e2 = this.b.e();
                while (e2.hasNext()) {
                    c((c) ((Map.Entry) e2.next()).getValue());
                    if (this.h) {
                        break;
                    }
                }
            } else {
                c(cVar);
                cVar = null;
            }
        } while (this.h);
        this.g = false;
    }

    public T e() {
        T t = (T) this.d;
        if (t != j) {
            return t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f;
    }

    public boolean g() {
        return this.c > 0;
    }

    public void h(n nVar, v<? super T> vVar) {
        b("observe");
        if (nVar.A().b() != Lifecycle.State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(nVar, vVar);
            LiveData<T>.c i2 = this.b.i(vVar, lifecycleBoundObserver);
            if (i2 != null && !i2.c(nVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (i2 == null) {
                nVar.A().a(lifecycleBoundObserver);
            }
        }
    }

    public void i(v<? super T> vVar) {
        b("observeForever");
        b bVar = new b(this, vVar);
        LiveData<T>.c i2 = this.b.i(vVar, bVar);
        if (i2 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (i2 == null) {
            bVar.a(true);
        }
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public void l(T t) {
        boolean z;
        synchronized (this.a) {
            z = this.e == j;
            this.e = t;
        }
        if (z) {
            y0.e().c(this.i);
        }
    }

    public void m(v<? super T> vVar) {
        b("removeObserver");
        LiveData<T>.c j2 = this.b.j(vVar);
        if (j2 != null) {
            j2.b();
            j2.a(false);
        }
    }

    /* access modifiers changed from: protected */
    public void n(T t) {
        b("setValue");
        this.f++;
        this.d = t;
        d(null);
    }

    public LiveData() {
        this.a = new Object();
        this.b = new c1<>();
        this.c = 0;
        Object obj = j;
        this.e = obj;
        this.i = new a();
        this.d = obj;
        this.f = -1;
    }
}
