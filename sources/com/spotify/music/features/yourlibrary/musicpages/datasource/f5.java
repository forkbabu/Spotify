package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.datasource.x3;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.functions.Functions;
import io.reactivex.s;

public abstract class f5 implements w3 {
    private final io.reactivex.subjects.a<s<x3>> a = io.reactivex.subjects.a.h1();
    private final e1 b;
    private s<y3> c;
    private final l<x3, x3> d = new a();

    class a implements l<x3, x3> {
        private int a;

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public x3 apply(x3 x3Var) {
            int i;
            int i2;
            x3 x3Var2 = x3Var;
            int k = f5.this.k();
            int i3 = this.a;
            int j = f5.this.j();
            int i4 = f5.this.i();
            int k2 = x3Var2.k();
            if (x3Var2.j() + k2 >= (i3 + k) - i4) {
                i2 = k - j;
                i = k2 / i2;
            } else {
                if (i3 > 0 && k2 < i3 + i4) {
                    i2 = k - j;
                    i = (k2 - i4) / i2;
                }
                this.a = i3;
                x3.a i5 = x3Var2.i();
                i5.h(i3);
                i5.g(k);
                return i5.b();
            }
            i3 = i2 * i;
            this.a = i3;
            x3.a i52 = x3Var2.i();
            i52.h(i3);
            i52.g(k);
            return i52.b();
        }
    }

    public f5(e1 e1Var) {
        this.b = e1Var;
    }

    public static s e(f5 f5Var) {
        f5Var.getClass();
        io.reactivex.subjects.a i1 = io.reactivex.subjects.a.i1(0);
        return s.b1(f5Var.a.J0(q2.a).G0((R) x3.b).J0(new w2(i1)).j0(f5Var.d).E().J0(new i0(f5Var))).N(new t2(i1));
    }

    private s<y3> h() {
        if (this.c == null) {
            this.c = s.B(new s2(this)).v0(1).h1();
        }
        return this.c;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<Boolean> b() {
        return h().j0(v2.a).E();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> c() {
        return h();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> d(s<x3> sVar) {
        s<x3> h1 = sVar.v0(1).h1();
        return h().J0(new r2(h1)).M(new p2(this, h1), Functions.c).M(Functions.f(), new u2(this));
    }

    public /* synthetic */ void f(s sVar, b bVar) {
        this.a.onNext(sVar);
    }

    public /* synthetic */ void g() {
        this.a.onNext(s.i0(x3.b));
    }

    /* access modifiers changed from: protected */
    public int i() {
        return this.b.a();
    }

    /* access modifiers changed from: protected */
    public int j() {
        return this.b.b();
    }

    /* access modifiers changed from: protected */
    public int k() {
        return this.b.c();
    }

    /* access modifiers changed from: protected */
    public abstract s<y3> l(x3 x3Var);
}
