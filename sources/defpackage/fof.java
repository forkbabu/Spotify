package defpackage;

import java.util.List;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.i;
import okhttp3.internal.connection.c;
import okhttp3.internal.connection.f;
import okhttp3.p;
import okhttp3.v;

/* renamed from: fof  reason: default package */
public final class fof implements v.a {
    private final List<v> a;
    private final f b;
    private final cof c;
    private final c d;
    private final int e;
    private final a0 f;
    private final e g;
    private final p h;
    private final int i;
    private final int j;
    private final int k;
    private int l;

    public fof(List<v> list, f fVar, cof cof, c cVar, int i2, a0 a0Var, e eVar, p pVar, int i3, int i4, int i5) {
        this.a = list;
        this.d = cVar;
        this.b = fVar;
        this.c = cof;
        this.e = i2;
        this.f = a0Var;
        this.g = eVar;
        this.h = pVar;
        this.i = i3;
        this.j = i4;
        this.k = i5;
    }

    public e a() {
        return this.g;
    }

    public int b() {
        return this.i;
    }

    public i c() {
        return this.d;
    }

    public p d() {
        return this.h;
    }

    public cof e() {
        return this.c;
    }

    public d0 f(a0 a0Var) {
        return g(a0Var, this.b, this.c, this.d);
    }

    public d0 g(a0 a0Var, f fVar, cof cof, c cVar) {
        if (this.e < this.a.size()) {
            this.l++;
            if (this.c != null && !this.d.p(a0Var.k())) {
                StringBuilder V0 = je.V0("network interceptor ");
                V0.append(this.a.get(this.e - 1));
                V0.append(" must retain the same host and port");
                throw new IllegalStateException(V0.toString());
            } else if (this.c == null || this.l <= 1) {
                List<v> list = this.a;
                int i2 = this.e;
                fof fof = new fof(list, fVar, cof, cVar, i2 + 1, a0Var, this.g, this.h, this.i, this.j, this.k);
                v vVar = list.get(i2);
                d0 a2 = vVar.a(fof);
                if (cof != null && this.e + 1 < this.a.size() && fof.l != 1) {
                    throw new IllegalStateException("network interceptor " + vVar + " must call proceed() exactly once");
                } else if (a2 == null) {
                    throw new NullPointerException("interceptor " + vVar + " returned null");
                } else if (a2.a() != null) {
                    return a2;
                } else {
                    throw new IllegalStateException("interceptor " + vVar + " returned a response with no body");
                }
            } else {
                StringBuilder V02 = je.V0("network interceptor ");
                V02.append(this.a.get(this.e - 1));
                V02.append(" must call proceed() exactly once");
                throw new IllegalStateException(V02.toString());
            }
        } else {
            throw new AssertionError();
        }
    }

    public int h() {
        return this.j;
    }

    public a0 i() {
        return this.f;
    }

    public f j() {
        return this.b;
    }

    public int k() {
        return this.k;
    }
}
