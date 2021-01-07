package defpackage;

import com.google.gson.internal.r;
import com.google.gson.j;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.u;
import com.google.gson.v;
import com.google.gson.w;
import com.google.gson.x;

/* renamed from: q20  reason: default package */
public final class q20<T> extends w<T> {
    private final v<T> a;
    private final o<T> b;
    final j c;
    private final z20<T> d;
    private final x e;
    private final q20<T>.b f = new b(this, null);
    private w<T> g;

    /* renamed from: q20$b */
    private final class b implements u, n {
        b(q20 q20, a aVar) {
        }
    }

    public q20(v<T> vVar, o<T> oVar, j jVar, z20<T> z20, x xVar) {
        this.a = vVar;
        this.b = oVar;
        this.c = jVar;
        this.d = z20;
        this.e = null;
    }

    @Override // com.google.gson.w
    public T read(com.google.gson.stream.a aVar) {
        if (this.b == null) {
            w<T> wVar = this.g;
            if (wVar == null) {
                wVar = this.c.d(this.e, this.d);
                this.g = wVar;
            }
            return wVar.read(aVar);
        }
        p b2 = r.b(aVar);
        b2.getClass();
        if (b2 instanceof q) {
            return null;
        }
        return this.b.a(b2, this.d.d(), this.f);
    }

    @Override // com.google.gson.w
    public void write(com.google.gson.stream.b bVar, T t) {
        v<T> vVar = this.a;
        if (vVar == null) {
            w<T> wVar = this.g;
            if (wVar == null) {
                wVar = this.c.d(this.e, this.d);
                this.g = wVar;
            }
            wVar.write(bVar, t);
        } else if (t == null) {
            bVar.r();
        } else {
            s20.X.write(bVar, vVar.a(t, this.d.d(), this.f));
        }
    }
}
