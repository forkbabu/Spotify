package io.netty.util.concurrent;

public final class z {
    private int a;
    private int b;
    private boolean c;
    private y<Void> d;
    private Throwable e;
    private final s<r<?>> f = new a();

    class a implements s<r<?>> {
        a() {
        }

        @Override // io.netty.util.concurrent.s
        public void a(r<?> rVar) {
            z.b(z.this);
            if (!rVar.x() && z.this.e == null) {
                z.this.e = rVar.r();
            }
            if (z.this.b == z.this.a && z.this.c) {
                z.this.j();
            }
        }
    }

    static /* synthetic */ int b(z zVar) {
        int i = zVar.b + 1;
        zVar.b = i;
        return i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean j() {
        Throwable th = this.e;
        return th == null ? this.d.p(null) : this.d.n(th);
    }

    public void h(y yVar) {
        if (!this.c) {
            this.a++;
            yVar.mo86d((s) this.f);
            return;
        }
        throw new IllegalStateException("Adding promises is not allowed after finished adding");
    }

    public void i(y<Void> yVar) {
        if (!this.c) {
            this.c = true;
            if (yVar != null) {
                this.d = yVar;
                if (this.b == this.a) {
                    j();
                    return;
                }
                return;
            }
            throw new NullPointerException("aggregatePromise");
        }
        throw new IllegalStateException("Already finished");
    }
}
