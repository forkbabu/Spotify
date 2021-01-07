package io.netty.util.internal;

import java.lang.Thread;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

public final class ThreadLocalRandom extends Random {
    private static final io.netty.util.internal.logging.b a = io.netty.util.internal.logging.c.b(ThreadLocalRandom.class.getName());
    private static final AtomicLong b = new AtomicLong();
    private static volatile long c = 0;
    private static final Thread f;
    private static final BlockingQueue<Long> n;
    private static final long o;
    private static volatile long p = 0;
    private static final long serialVersionUID = -5851777807851030925L;
    boolean initialized;
    private long pad0;
    private long pad1;
    private long pad2;
    private long pad3;
    private long pad4;
    private long pad5;
    private long pad6;
    private long pad7;
    private long rnd;

    static class a implements PrivilegedAction<Long> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.security.PrivilegedAction
        public Long run() {
            return Long.getLong("io.netty.initialSeedUniquifier", (long) ThreadLocalRandom.o);
        }
    }

    static class b implements PrivilegedAction<Boolean> {
        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.security.PrivilegedAction
        public Boolean run() {
            return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
        }
    }

    static class c extends Thread {
        c(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            byte[] generateSeed = new SecureRandom().generateSeed(8);
            long unused = ThreadLocalRandom.p = System.nanoTime();
            ThreadLocalRandom.n.add(Long.valueOf((((long) generateSeed[7]) & 255) | ((((long) generateSeed[0]) & 255) << 56) | ((((long) generateSeed[1]) & 255) << 48) | ((((long) generateSeed[2]) & 255) << 40) | ((((long) generateSeed[3]) & 255) << 32) | ((((long) generateSeed[4]) & 255) << 24) | ((((long) generateSeed[5]) & 255) << 16) | ((((long) generateSeed[6]) & 255) << 8)));
        }
    }

    static class d implements Thread.UncaughtExceptionHandler {
        d() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            ThreadLocalRandom.a.b("An exception has been raised by {}", thread.getName(), th);
        }
    }

    static {
        int i = io.netty.util.internal.logging.c.b;
        c = ((Long) AccessController.doPrivileged(new a())).longValue();
        if (c != o) {
            f = null;
            n = null;
            o = o;
        } else if (((Boolean) AccessController.doPrivileged(new b())).booleanValue()) {
            n = new LinkedBlockingQueue();
            o = System.nanoTime();
            c cVar = new c("initialSeedUniquifierGenerator");
            f = cVar;
            cVar.setDaemon(true);
            cVar.setUncaughtExceptionHandler(new d());
            cVar.start();
        } else {
            c = e(System.currentTimeMillis()) ^ e(System.nanoTime());
            f = null;
            n = null;
            o = o;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        io.netty.util.internal.ThreadLocalRandom.f.interrupt();
        io.netty.util.internal.ThreadLocalRandom.a.l("Failed to generate a seed from SecureRandom within {} seconds. Not enough entropy?", 3L);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    ThreadLocalRandom() {
        /*
        // Method dump skipped, instructions count: 282
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.ThreadLocalRandom.<init>():void");
    }

    public static ThreadLocalRandom d() {
        e e = e.e();
        ThreadLocalRandom threadLocalRandom = e.e;
        if (threadLocalRandom != null) {
            return threadLocalRandom;
        }
        ThreadLocalRandom threadLocalRandom2 = new ThreadLocalRandom();
        e.e = threadLocalRandom2;
        return threadLocalRandom2;
    }

    private static long e(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
        return j3 ^ (j3 >>> 33);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.Random
    public int next(int i) {
        long j = ((this.rnd * 25214903917L) + 11) & 281474976710655L;
        this.rnd = j;
        return (int) (j >>> (48 - i));
    }

    @Override // java.util.Random
    public void setSeed(long j) {
        if (!this.initialized) {
            this.rnd = (j ^ 25214903917L) & 281474976710655L;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
