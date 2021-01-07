package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.upstream.a0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.v0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public abstract class l implements t {
    private final ArrayList<t.b> a = new ArrayList<>(1);
    private final HashSet<t.b> b = new HashSet<>(1);
    private final v.a c = new v.a();
    private Looper f;
    private v0 n;

    @Override // com.google.android.exoplayer2.source.t
    public final void a(t.b bVar) {
        this.a.remove(bVar);
        if (this.a.isEmpty()) {
            this.f = null;
            this.n = null;
            this.b.clear();
            k();
            return;
        }
        boolean z = !this.b.isEmpty();
        this.b.remove(bVar);
        if (z) {
            this.b.isEmpty();
        }
    }

    @Override // com.google.android.exoplayer2.source.t
    public final void b(Handler handler, v vVar) {
        this.c.a(handler, vVar);
    }

    @Override // com.google.android.exoplayer2.source.t
    public final void c(v vVar) {
        this.c.p(vVar);
    }

    @Override // com.google.android.exoplayer2.source.t
    public final void e(t.b bVar, a0 a0Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f;
        g.a(looper == null || looper == myLooper);
        v0 v0Var = this.n;
        this.a.add(bVar);
        if (this.f == null) {
            this.f = myLooper;
            this.b.add(bVar);
            i(a0Var);
        } else if (v0Var != null) {
            this.b.isEmpty();
            this.b.add(bVar);
            bVar.b(this, v0Var);
        }
    }

    /* access modifiers changed from: protected */
    public final v.a h(t.a aVar) {
        return this.c.r(0, aVar, 0);
    }

    /* access modifiers changed from: protected */
    public abstract void i(a0 a0Var);

    /* access modifiers changed from: protected */
    public final void j(v0 v0Var) {
        this.n = v0Var;
        Iterator<t.b> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(this, v0Var);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void k();
}
