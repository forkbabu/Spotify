package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.k0;
import com.google.android.exoplayer2.u;

public final class a0 implements r {
    private final i a;
    private boolean b;
    private long c;
    private long f;
    private k0 n = k0.e;

    public a0(i iVar) {
        this.a = iVar;
    }

    public void a(long j) {
        this.c = j;
        if (this.b) {
            this.f = this.a.b();
        }
    }

    public void b() {
        if (!this.b) {
            this.f = this.a.b();
            this.b = true;
        }
    }

    public void c() {
        if (this.b) {
            a(f());
            this.b = false;
        }
    }

    @Override // com.google.android.exoplayer2.util.r
    public long f() {
        long j;
        long j2 = this.c;
        if (!this.b) {
            return j2;
        }
        long b2 = this.a.b() - this.f;
        k0 k0Var = this.n;
        if (k0Var.a == 1.0f) {
            j = u.a(b2);
        } else {
            j = k0Var.a(b2);
        }
        return j2 + j;
    }

    @Override // com.google.android.exoplayer2.util.r
    public k0 p() {
        return this.n;
    }

    @Override // com.google.android.exoplayer2.util.r
    public void v(k0 k0Var) {
        if (this.b) {
            a(f());
        }
        this.n = k0Var;
    }
}
