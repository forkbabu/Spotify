package io.netty.buffer;

import io.netty.util.internal.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

final class u<T> implements Object {
    private static final Iterator<Object> p = Collections.emptyList().iterator();
    private final u<T> a;
    private final int b;
    private final int c;
    private final int f;
    private t<T> n;
    private u<T> o;

    u(u<T> uVar, int i, int i2, int i3) {
        int i4;
        this.a = uVar;
        this.b = i;
        this.c = i2;
        int max = Math.max(1, i);
        if (max == 100) {
            i4 = 0;
        } else {
            i4 = (int) (((100 - ((long) max)) * ((long) i3)) / 100);
        }
        this.f = i4;
    }

    private boolean i(t<T> tVar) {
        u<T> uVar = this.o;
        if (uVar == null) {
            return false;
        }
        if (tVar.l() < uVar.b) {
            return uVar.i(tVar);
        }
        uVar.d(tVar);
        return true;
    }

    private void k(t<T> tVar) {
        if (tVar == this.n) {
            t<T> tVar2 = tVar.r;
            this.n = tVar2;
            if (tVar2 != null) {
                tVar2.q = null;
                return;
            }
            return;
        }
        t<T> tVar3 = tVar.r;
        t<T> tVar4 = tVar.q;
        tVar4.r = tVar3;
        if (tVar3 != null) {
            tVar3.q = tVar4;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(t<T> tVar) {
        if (tVar.l() >= this.c) {
            this.a.c(tVar);
        } else {
            d(tVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(t<T> tVar) {
        tVar.p = this;
        t<T> tVar2 = this.n;
        if (tVar2 == null) {
            this.n = tVar;
            tVar.q = null;
            tVar.r = null;
            return;
        }
        tVar.q = null;
        tVar.r = tVar2;
        tVar2.q = tVar;
        this.n = tVar;
    }

    /* access modifiers changed from: package-private */
    public boolean e(x<T> xVar, int i, int i2) {
        t<T> tVar = this.n;
        if (tVar == null || i2 > this.f) {
            return false;
        }
        do {
            long a2 = tVar.a(i2);
            if (a2 < 0) {
                tVar = tVar.r;
            } else {
                tVar.f(xVar, a2, i);
                if (tVar.l() < this.c) {
                    return true;
                }
                k(tVar);
                this.a.c(tVar);
                return true;
            }
        } while (tVar != null);
        return false;
    }

    /* access modifiers changed from: package-private */
    public void f(PoolArena<T> poolArena) {
        for (t<T> tVar = this.n; tVar != null; tVar = tVar.r) {
            poolArena.e(tVar);
        }
        this.n = null;
    }

    /* access modifiers changed from: package-private */
    public boolean h(t<T> tVar, long j) {
        tVar.e(j);
        if (tVar.l() >= this.b) {
            return true;
        }
        k(tVar);
        return i(tVar);
    }

    public Iterator<Object> iterator() {
        if (this.n == null) {
            return p;
        }
        ArrayList arrayList = new ArrayList();
        t<T> tVar = this.n;
        do {
            arrayList.add(tVar);
            tVar = tVar.r;
        } while (tVar != null);
        return arrayList.iterator();
    }

    /* access modifiers changed from: package-private */
    public void j(u<T> uVar) {
        this.o = uVar;
    }

    @Override // java.lang.Object
    public String toString() {
        if (this.n == null) {
            return "none";
        }
        StringBuilder sb = new StringBuilder();
        t<T> tVar = this.n;
        while (true) {
            sb.append(tVar);
            tVar = tVar.r;
            if (tVar == null) {
                return sb.toString();
            }
            sb.append(r.a);
        }
    }
}
