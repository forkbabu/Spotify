package io.netty.channel;

import io.netty.buffer.j;
import io.netty.buffer.k;
import io.netty.channel.c;
import io.netty.channel.p0;

public abstract class e0 implements l0 {
    private volatile int a;

    public abstract class a implements p0.a {
        private e a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;

        public a() {
        }

        public j b(k kVar) {
            return kVar.f(((c.a) this).k());
        }

        public int c() {
            return this.e;
        }

        public void d(int i) {
            this.e = i;
        }

        public boolean e() {
            return ((y) this.a).l() && this.e == this.f && this.c < this.b && this.d < Integer.MAX_VALUE;
        }

        public final void f(int i) {
            this.c += i;
        }

        public final int g() {
            return this.f;
        }

        public final void h(int i) {
            this.f = i;
            int i2 = this.d + i;
            this.d = i2;
            if (i2 < 0) {
                this.d = Integer.MAX_VALUE;
            }
        }

        public void i(e eVar) {
            this.a = eVar;
            this.b = e0.this.c();
            this.d = 0;
            this.c = 0;
        }

        /* access modifiers changed from: protected */
        public final int j() {
            return this.d;
        }
    }

    public e0() {
        b(1);
    }

    @Override // io.netty.channel.l0
    public l0 b(int i) {
        if (i > 0) {
            this.a = i;
            return this;
        }
        throw new IllegalArgumentException(je.q0("maxMessagesPerRead: ", i, " (expected: > 0)"));
    }

    @Override // io.netty.channel.l0
    public int c() {
        return this.a;
    }
}
