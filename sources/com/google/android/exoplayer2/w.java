package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.a0;
import com.google.android.exoplayer2.util.i;
import com.google.android.exoplayer2.util.r;

/* access modifiers changed from: package-private */
public final class w implements r {
    private final a0 a;
    private final a b;
    private p0 c;
    private r f;
    private boolean n = true;
    private boolean o;

    public interface a {
    }

    public w(a aVar, i iVar) {
        this.b = aVar;
        this.a = new a0(iVar);
    }

    public void a(p0 p0Var) {
        if (p0Var == this.c) {
            this.f = null;
            this.c = null;
            this.n = true;
        }
    }

    public void b(p0 p0Var) {
        r rVar;
        r h = p0Var.h();
        if (h != null && h != (rVar = this.f)) {
            if (rVar == null) {
                this.f = h;
                this.c = p0Var;
                h.v(this.a.p());
                return;
            }
            throw ExoPlaybackException.d(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public void c(long j) {
        this.a.a(j);
    }

    public void d() {
        this.o = true;
        this.a.b();
    }

    public void e() {
        this.o = false;
        this.a.c();
    }

    @Override // com.google.android.exoplayer2.util.r
    public long f() {
        return this.n ? this.a.f() : this.f.f();
    }

    public long g(boolean z) {
        p0 p0Var = this.c;
        if (p0Var == null || p0Var.b() || (!this.c.d() && (z || this.c.i()))) {
            this.n = true;
            if (this.o) {
                this.a.b();
            }
        } else {
            long f2 = this.f.f();
            if (this.n) {
                if (f2 < this.a.f()) {
                    this.a.c();
                } else {
                    this.n = false;
                    if (this.o) {
                        this.a.b();
                    }
                }
            }
            this.a.a(f2);
            k0 p = this.f.p();
            if (!p.equals(this.a.p())) {
                this.a.v(p);
                ((b0) this.b).A(p);
            }
        }
        return f();
    }

    @Override // com.google.android.exoplayer2.util.r
    public k0 p() {
        r rVar = this.f;
        if (rVar != null) {
            return rVar.p();
        }
        return this.a.p();
    }

    @Override // com.google.android.exoplayer2.util.r
    public void v(k0 k0Var) {
        r rVar = this.f;
        if (rVar != null) {
            rVar.v(k0Var);
            k0Var = this.f.p();
        }
        this.a.v(k0Var);
    }
}
