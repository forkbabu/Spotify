package io.netty.util.internal.chmv8;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public abstract class Striped64 extends Number {
    static final ThreadLocal<int[]> f = new ThreadLocal<>();
    static final Random n = new Random();
    static final int o = Runtime.getRuntime().availableProcessors();
    private static final Unsafe p;
    private static final long q;
    private static final long r;
    volatile transient b[] a;
    volatile transient long b;
    volatile transient int c;

    /* access modifiers changed from: package-private */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        /* renamed from: a */
        public Unsafe run() {
            Field[] declaredFields = Unsafe.class.getDeclaredFields();
            for (Field field : declaredFields) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {
        private static final Unsafe b;
        private static final long c;
        volatile long a;

        static {
            try {
                Unsafe f = Striped64.f();
                b = f;
                c = f.objectFieldOffset(b.class.getDeclaredField("a"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        b(long j) {
            this.a = j;
        }

        /* access modifiers changed from: package-private */
        public final boolean a(long j, long j2) {
            return b.compareAndSwapLong(this, c, j, j2);
        }
    }

    static {
        try {
            Unsafe f2 = f();
            p = f2;
            q = f2.objectFieldOffset(Striped64.class.getDeclaredField("b"));
            r = f2.objectFieldOffset(Striped64.class.getDeclaredField("c"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    Striped64() {
    }

    /* access modifiers changed from: private */
    public static Unsafe f() {
        try {
            return Unsafe.getUnsafe();
        } catch (SecurityException unused) {
            try {
                return (Unsafe) AccessController.doPrivileged(new a());
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d(long j, long j2) {
        return p.compareAndSwapLong(this, q, j, j2);
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return p.compareAndSwapInt(this, r, 0, 1);
    }
}
