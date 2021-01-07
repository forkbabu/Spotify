package io.reactivex.internal.util;

import io.reactivex.disposables.b;
import io.reactivex.functions.e;
import io.reactivex.internal.fuseable.i;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.observers.g;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.a;
import io.reactivex.x;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

public final class c {
    public static <T, U> boolean a(boolean z, boolean z2, x<?> xVar, boolean z3, j<?> jVar, b bVar, g<T, U> gVar) {
        if (gVar.b()) {
            jVar.clear();
            bVar.dispose();
            return true;
        } else if (!z) {
            return false;
        } else {
            if (z3) {
                if (!z2) {
                    return false;
                }
                if (bVar != null) {
                    bVar.dispose();
                }
                xVar.onComplete();
                return true;
            } else if (!z2) {
                return false;
            } else {
                if (bVar != null) {
                    bVar.dispose();
                }
                xVar.onComplete();
                return true;
            }
        }
    }

    public static <T> j<T> b(int i) {
        if (i < 0) {
            return new a(-i);
        }
        return new SpscArrayQueue(i);
    }

    public static <T, U> void c(i<T> iVar, x<? super U> xVar, boolean z, b bVar, g<T, U> gVar) {
        int i = 1;
        while (!a(gVar.c(), iVar.isEmpty(), xVar, z, iVar, bVar, gVar)) {
            while (true) {
                boolean c = gVar.c();
                T poll = iVar.poll();
                boolean z2 = poll == null;
                if (!a(c, z2, xVar, z, iVar, bVar, gVar)) {
                    if (z2) {
                        i = gVar.h(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        gVar.a(xVar, poll);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public static <T> void d(upf<? super T> upf, Queue<T> queue, AtomicLong atomicLong, e eVar) {
        long j;
        long j2;
        if (queue.isEmpty()) {
            upf.onComplete();
        } else if (!e(atomicLong.get(), upf, queue, atomicLong, eVar)) {
            do {
                j = atomicLong.get();
                if ((j & Long.MIN_VALUE) == 0) {
                    j2 = j | Long.MIN_VALUE;
                } else {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, j2));
            if (j != 0) {
                e(j2, upf, queue, atomicLong, eVar);
            }
        }
    }

    static <T> boolean e(long j, upf<? super T> upf, Queue<T> queue, AtomicLong atomicLong, e eVar) {
        boolean z;
        boolean z2;
        long j2 = j & Long.MIN_VALUE;
        while (true) {
            if (j2 != j) {
                try {
                    z2 = eVar.a();
                } catch (Throwable th) {
                    yif.V(th);
                    z2 = true;
                }
                if (z2) {
                    return true;
                }
                T poll = queue.poll();
                if (poll == null) {
                    upf.onComplete();
                    return true;
                }
                upf.onNext(poll);
                j2++;
            } else {
                try {
                    z = eVar.a();
                } catch (Throwable th2) {
                    yif.V(th2);
                    z = true;
                }
                if (z) {
                    return true;
                }
                if (queue.isEmpty()) {
                    upf.onComplete();
                    return true;
                }
                j = atomicLong.get();
                if (j == j2) {
                    long addAndGet = atomicLong.addAndGet(-(j2 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & addAndGet) == 0) {
                        return false;
                    }
                    j = addAndGet;
                    j2 = addAndGet & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> boolean f(long j, upf<? super T> upf, Queue<T> queue, AtomicLong atomicLong, e eVar) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, yif.c(Long.MAX_VALUE & j2, j) | (j2 & Long.MIN_VALUE)));
        if (j2 != Long.MIN_VALUE) {
            return false;
        }
        e(j | Long.MIN_VALUE, upf, queue, atomicLong, eVar);
        return true;
    }
}
