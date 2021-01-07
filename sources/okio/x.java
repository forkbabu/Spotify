package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class x {
    public static final x d = new a();
    private boolean a;
    private long b;
    private long c;

    class a extends x {
        a() {
        }

        @Override // okio.x
        public x d(long j) {
            return this;
        }

        @Override // okio.x
        public void f() {
        }

        @Override // okio.x
        public x g(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    public x a() {
        this.a = false;
        return this;
    }

    public x b() {
        this.c = 0;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(je.t0("timeout < 0: ", j));
        } else if (timeUnit != null) {
            this.c = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long h() {
        return this.c;
    }
}
