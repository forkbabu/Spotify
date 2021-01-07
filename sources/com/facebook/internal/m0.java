package com.facebook.internal;

import com.facebook.k;
import java.util.concurrent.Executor;

public class m0 {
    private final Object a = new Object();
    private b b;
    private final int c;
    private final Executor d;
    private b e = null;
    private int f = 0;

    public interface a {
    }

    /* access modifiers changed from: private */
    public class b implements a {
        private final Runnable a;
        private b b;
        private b c;
        private boolean d;

        b(Runnable runnable) {
            this.a = runnable;
        }

        /* access modifiers changed from: package-private */
        public b a(b bVar, boolean z) {
            if (bVar == null) {
                this.c = this;
                this.b = this;
                bVar = this;
            } else {
                this.b = bVar;
                b bVar2 = bVar.c;
                this.c = bVar2;
                bVar2.b = this;
                bVar.c = this;
            }
            return z ? this : bVar;
        }

        public boolean b() {
            synchronized (m0.this.a) {
                if (this.d) {
                    return false;
                }
                m0 m0Var = m0.this;
                m0Var.b = e(m0Var.b);
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public Runnable c() {
            return this.a;
        }

        public void d() {
            synchronized (m0.this.a) {
                if (!this.d) {
                    m0 m0Var = m0.this;
                    m0Var.b = e(m0Var.b);
                    m0 m0Var2 = m0.this;
                    m0Var2.b = a(m0Var2.b, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public b e(b bVar) {
            if (bVar == this && (bVar = this.b) == this) {
                bVar = null;
            }
            b bVar2 = this.b;
            bVar2.c = this.c;
            this.c.b = bVar2;
            this.c = null;
            this.b = null;
            return bVar;
        }

        /* access modifiers changed from: package-private */
        public void f(boolean z) {
            this.d = z;
        }
    }

    public m0(int i) {
        Executor l = k.l();
        this.c = i;
        this.d = l;
    }

    /* access modifiers changed from: private */
    public void f(b bVar) {
        b bVar2;
        synchronized (this.a) {
            if (bVar != null) {
                this.e = bVar.e(this.e);
                this.f--;
            }
            if (this.f < this.c) {
                bVar2 = this.b;
                if (bVar2 != null) {
                    this.b = bVar2.e(bVar2);
                    this.e = bVar2.a(this.e, false);
                    this.f++;
                    bVar2.f(true);
                }
            } else {
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            this.d.execute(new l0(this, bVar2));
        }
    }

    public a e(Runnable runnable) {
        b bVar = new b(runnable);
        synchronized (this.a) {
            this.b = bVar.a(this.b, true);
        }
        f(null);
        return bVar;
    }
}
