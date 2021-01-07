package com.jakewharton.rxrelay2;

import com.jakewharton.rxrelay2.a;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class b<T> extends c<T> {
    private static final Object[] o = new Object[0];
    private static final a[] p = new a[0];
    final AtomicReference<T> a = new AtomicReference<>();
    private final AtomicReference<a<T>[]> b = new AtomicReference<>(p);
    final Lock c;
    private final Lock f;
    long n;

    /* access modifiers changed from: package-private */
    public static final class a<T> implements io.reactivex.disposables.b, a.AbstractC0141a<T> {
        final x<? super T> a;
        final b<T> b;
        boolean c;
        boolean f;
        a<T> n;
        boolean o;
        volatile boolean p;
        long q;

        a(x<? super T> xVar, b<T> bVar) {
            this.a = xVar;
            this.b = bVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.p;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (!this.p) {
                this.p = true;
                this.b.j1(this);
            }
        }

        @Override // io.reactivex.functions.n
        public boolean test(T t) {
            if (this.p) {
                return false;
            }
            this.a.onNext(t);
            return false;
        }
    }

    private b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock.readLock();
        this.f = reentrantReadWriteLock.writeLock();
    }

    public static <T> b<T> g1() {
        return new b<>();
    }

    public static <T> b<T> h1(T t) {
        b<T> bVar = new b<>();
        bVar.a.lazySet(t);
        return bVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        a<T>[] aVarArr;
        a<T>[] aVarArr2;
        T t;
        a<T> aVar;
        a<T> aVar2 = new a<>(xVar, this);
        xVar.onSubscribe(aVar2);
        do {
            aVarArr = this.b.get();
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar2;
        } while (!this.b.compareAndSet(aVarArr, aVarArr2));
        if (aVar2.p) {
            j1(aVar2);
        } else if (!aVar2.p) {
            synchronized (aVar2) {
                if (!aVar2.p) {
                    if (!aVar2.c) {
                        b<T> bVar = aVar2.b;
                        Lock lock = bVar.c;
                        lock.lock();
                        aVar2.q = bVar.n;
                        t = bVar.a.get();
                        lock.unlock();
                        aVar2.f = t != null;
                        aVar2.c = true;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (t != null) {
                if (!aVar2.p) {
                    aVar2.a.onNext(t);
                }
                while (!aVar2.p) {
                    synchronized (aVar2) {
                        aVar = aVar2.n;
                        if (aVar == null) {
                            aVar2.f = false;
                            return;
                        }
                        aVar2.n = null;
                    }
                    aVar.b(aVar2);
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.jakewharton.rxrelay2.c, io.reactivex.functions.g
    public void accept(T t) {
        if (t != null) {
            this.f.lock();
            try {
                this.n++;
                this.a.lazySet(t);
                this.f.unlock();
                a<T>[] aVarArr = this.b.get();
                for (a<T> aVar : aVarArr) {
                    long j = this.n;
                    if (!aVar.p) {
                        if (!aVar.o) {
                            synchronized (aVar) {
                                if (!aVar.p) {
                                    if (aVar.q != j) {
                                        if (aVar.f) {
                                            a<T> aVar2 = aVar.n;
                                            if (aVar2 == null) {
                                                aVar2 = new a<>(4);
                                                aVar.n = aVar2;
                                            }
                                            aVar2.a(t);
                                        } else {
                                            aVar.c = true;
                                            aVar.o = true;
                                        }
                                    }
                                }
                            }
                        }
                        if (!aVar.p) {
                            aVar.a.onNext(t);
                        }
                    }
                }
            } catch (Throwable th) {
                this.f.unlock();
                throw th;
            }
        } else {
            throw new NullPointerException("value == null");
        }
    }

    public boolean i1() {
        return this.a.get() != null;
    }

    /* access modifiers changed from: package-private */
    public void j1(a<T> aVar) {
        a<T>[] aVarArr;
        a<T>[] aVarArr2;
        a<T>[] aVarArr3 = p;
        do {
            aVarArr = this.b.get();
            if (aVarArr != aVarArr3) {
                int length = aVarArr.length;
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
                        aVarArr2 = aVarArr3;
                    } else {
                        aVarArr2 = new a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.b.compareAndSet(aVarArr, aVarArr2));
    }
}
