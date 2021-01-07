package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.f0;
import java.util.ArrayList;
import java.util.Map;

public abstract class g implements k {
    private final boolean a;
    private final ArrayList<a0> b = new ArrayList<>(1);
    private int c;
    private m d;

    protected g(boolean z) {
        this.a = z;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public final void b(a0 a0Var) {
        if (!this.b.contains(a0Var)) {
            this.b.add(a0Var);
            this.c++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public /* synthetic */ Map c() {
        return j.a(this);
    }

    /* access modifiers changed from: protected */
    public final void d(int i) {
        m mVar = this.d;
        int i2 = f0.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            this.b.get(i3).e(this, mVar, this.a, i);
        }
    }

    /* access modifiers changed from: protected */
    public final void e() {
        m mVar = this.d;
        int i = f0.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            this.b.get(i2).a(this, mVar, this.a);
        }
        this.d = null;
    }

    /* access modifiers changed from: protected */
    public final void f(m mVar) {
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).h(this, mVar, this.a);
        }
    }

    /* access modifiers changed from: protected */
    public final void g(m mVar) {
        this.d = mVar;
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).g(this, mVar, this.a);
        }
    }
}
