package io.reactivex.subjects;

import io.reactivex.disposables.b;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.internal.util.a;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class a<T> extends c<T> {
    private static final Object[] q = new Object[0];
    static final C0623a[] r = new C0623a[0];
    static final C0623a[] s = new C0623a[0];
    final AtomicReference<Object> a = new AtomicReference<>();
    final AtomicReference<C0623a<T>[]> b = new AtomicReference<>(r);
    final ReadWriteLock c;
    final Lock f;
    final Lock n;
    final AtomicReference<Throwable> o = new AtomicReference<>();
    long p;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.subjects.a$a  reason: collision with other inner class name */
    public static final class C0623a<T> implements b, a.AbstractC0621a<Object> {
        final x<? super T> a;
        final a<T> b;
        boolean c;
        boolean f;
        io.reactivex.internal.util.a<Object> n;
        boolean o;
        volatile boolean p;
        long q;

        C0623a(x<? super T> xVar, a<T> aVar) {
            this.a = xVar;
            this.b = aVar;
        }

        /* access modifiers changed from: package-private */
        public void a(Object obj, long j) {
            if (!this.p) {
                if (!this.o) {
                    synchronized (this) {
                        if (!this.p) {
                            if (this.q != j) {
                                if (this.f) {
                                    io.reactivex.internal.util.a<Object> aVar = this.n;
                                    if (aVar == null) {
                                        aVar = new io.reactivex.internal.util.a<>(4);
                                        this.n = aVar;
                                    }
                                    aVar.c(obj);
                                    return;
                                }
                                this.c = true;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    this.o = true;
                }
                test(obj);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.p;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (!this.p) {
                this.p = true;
                this.b.l1(this);
            }
        }

        @Override // io.reactivex.internal.util.a.AbstractC0621a, io.reactivex.functions.n
        public boolean test(Object obj) {
            return this.p || NotificationLite.d(obj, this.a);
        }
    }

    a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock;
        this.f = reentrantReadWriteLock.readLock();
        this.n = reentrantReadWriteLock.writeLock();
    }

    public static <T> a<T> h1() {
        return new a<>();
    }

    public static <T> a<T> i1(T t) {
        a<T> aVar = new a<>();
        AtomicReference<Object> atomicReference = aVar.a;
        if (t != null) {
            atomicReference.lazySet(t);
            return aVar;
        }
        throw new NullPointerException("defaultValue is null");
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        boolean z;
        Object obj;
        io.reactivex.internal.util.a<Object> aVar;
        C0623a<T> aVar2 = new C0623a<>(xVar, this);
        xVar.onSubscribe(aVar2);
        while (true) {
            C0623a<T>[] aVarArr = this.b.get();
            if (aVarArr != s) {
                int length = aVarArr.length;
                C0623a<T>[] aVarArr2 = new C0623a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar2;
                if (this.b.compareAndSet(aVarArr, aVarArr2)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            Throwable th = this.o.get();
            if (th == ExceptionHelper.a) {
                xVar.onComplete();
            } else {
                xVar.onError(th);
            }
        } else if (aVar2.p) {
            l1(aVar2);
        } else if (!aVar2.p) {
            synchronized (aVar2) {
                if (!aVar2.p) {
                    if (!aVar2.c) {
                        a<T> aVar3 = aVar2.b;
                        Lock lock = aVar3.f;
                        lock.lock();
                        aVar2.q = aVar3.p;
                        obj = aVar3.a.get();
                        lock.unlock();
                        aVar2.f = obj != null;
                        aVar2.c = true;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (obj != null && !aVar2.test(obj)) {
                while (!aVar2.p) {
                    synchronized (aVar2) {
                        aVar = aVar2.n;
                        if (aVar == null) {
                            aVar2.f = false;
                            return;
                        }
                        aVar2.n = null;
                    }
                    aVar.d(aVar2);
                }
            }
        }
    }

    public T j1() {
        T t = (T) this.a.get();
        if (NotificationLite.m(t) || NotificationLite.n(t)) {
            return null;
        }
        return t;
    }

    public boolean k1() {
        Object obj = this.a.get();
        return obj != null && !NotificationLite.m(obj) && !NotificationLite.n(obj);
    }

    /* access modifiers changed from: package-private */
    public void l1(C0623a<T> aVar) {
        C0623a<T>[] aVarArr;
        C0623a<T>[] aVarArr2;
        do {
            aVarArr = this.b.get();
            int length = aVarArr.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (aVarArr[i] == aVar) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = r;
                    } else {
                        C0623a<T>[] aVarArr3 = new C0623a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.b.compareAndSet(aVarArr, aVarArr2));
    }

    /* access modifiers changed from: package-private */
    public void m1(Object obj) {
        this.n.lock();
        this.p++;
        this.a.lazySet(obj);
        this.n.unlock();
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onComplete() {
        if (this.o.compareAndSet(null, ExceptionHelper.a)) {
            NotificationLite notificationLite = NotificationLite.COMPLETE;
            AtomicReference<C0623a<T>[]> atomicReference = this.b;
            C0623a<T>[] aVarArr = s;
            C0623a<T>[] andSet = atomicReference.getAndSet(aVarArr);
            if (andSet != aVarArr) {
                m1(notificationLite);
            }
            for (C0623a<T> aVar : andSet) {
                aVar.a(notificationLite, this.p);
            }
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onError(Throwable th) {
        if (th == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!this.o.compareAndSet(null, th)) {
            io.reactivex.plugins.a.g(th);
        } else {
            Object k = NotificationLite.k(th);
            AtomicReference<C0623a<T>[]> atomicReference = this.b;
            C0623a<T>[] aVarArr = s;
            C0623a<T>[] andSet = atomicReference.getAndSet(aVarArr);
            if (andSet != aVarArr) {
                m1(k);
            }
            for (C0623a<T> aVar : andSet) {
                aVar.a(k, this.p);
            }
        }
    }

    @Override // io.reactivex.x
    public void onNext(T t) {
        if (t == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (this.o.get() == null) {
            m1(t);
            for (C0623a<T> aVar : this.b.get()) {
                aVar.a(t, this.p);
            }
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onSubscribe(b bVar) {
        if (this.o.get() != null) {
            bVar.dispose();
        }
    }
}
