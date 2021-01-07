package io.netty.util.internal;

import io.netty.util.concurrent.q;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class e extends u {
    public static final Object m = new Object();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private e() {
        /*
            r2 = this;
            r0 = 32
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r1 = io.netty.util.internal.e.m
            java.util.Arrays.fill(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.e.<init>():void");
    }

    public static e e() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof q) {
            q qVar = (q) currentThread;
            e b = qVar.b();
            if (b != null) {
                return b;
            }
            e eVar = new e();
            qVar.a(eVar);
            return eVar;
        }
        ThreadLocal<e> threadLocal = u.k;
        e eVar2 = threadLocal.get();
        if (eVar2 != null) {
            return eVar2;
        }
        e eVar3 = new e();
        threadLocal.set(eVar3);
        return eVar3;
    }

    public static e f() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof q) {
            return ((q) currentThread).b();
        }
        return u.k.get();
    }

    public static int i() {
        AtomicInteger atomicInteger = u.l;
        int andIncrement = atomicInteger.getAndIncrement();
        if (andIncrement >= 0) {
            return andIncrement;
        }
        atomicInteger.decrementAndGet();
        throw new IllegalStateException("too many thread-local indexed variables");
    }

    public static void j() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof q) {
            ((q) currentThread).a(null);
        } else {
            u.k.remove();
        }
    }

    public Map<Charset, CharsetDecoder> a() {
        Map<Charset, CharsetDecoder> map = this.j;
        if (map != null) {
            return map;
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        this.j = identityHashMap;
        return identityHashMap;
    }

    public Map<Charset, CharsetEncoder> b() {
        Map<Charset, CharsetEncoder> map = this.i;
        if (map != null) {
            return map;
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        this.i = identityHashMap;
        return identityHashMap;
    }

    public d c() {
        return this.d;
    }

    public int d() {
        return this.b;
    }

    public Map<Class<?>, Boolean> g() {
        Map<Class<?>, Boolean> map = this.c;
        if (map != null) {
            return map;
        }
        WeakHashMap weakHashMap = new WeakHashMap(4);
        this.c = weakHashMap;
        return weakHashMap;
    }

    public Object h(int i) {
        Object[] objArr = this.a;
        return i < objArr.length ? objArr[i] : m;
    }

    public Object k(int i) {
        Object obj = m;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return obj;
        }
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public void l(d dVar) {
        this.d = dVar;
    }

    public void m(int i) {
        this.b = i;
    }

    public boolean n(int i, Object obj) {
        Object obj2 = m;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            Object obj3 = objArr[i];
            objArr[i] = obj;
            if (obj3 == obj2) {
                return true;
            }
            return false;
        }
        int length = objArr.length;
        int i2 = (i >>> 1) | i;
        int i3 = i2 | (i2 >>> 2);
        int i4 = i3 | (i3 >>> 4);
        int i5 = i4 | (i4 >>> 8);
        Object[] copyOf = Arrays.copyOf(objArr, (i5 | (i5 >>> 16)) + 1);
        Arrays.fill(copyOf, length, copyOf.length, obj2);
        copyOf[i] = obj;
        this.a = copyOf;
        return true;
    }
}
