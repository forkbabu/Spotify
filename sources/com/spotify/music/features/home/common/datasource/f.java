package com.spotify.music.features.home.common.datasource;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.home.common.cache.a;
import com.spotify.music.features.home.common.cache.b;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;
import java.io.IOException;
import okhttp3.e0;
import okio.g;

public class f implements pf5 {
    private final y a;
    private final nf5 b;
    private final boolean c;
    private final boolean d;
    private final wlf<h81> e;
    private final h f;
    private final j g;
    private final a<byte[]> h;
    private final b i;

    public f(y yVar, boolean z, boolean z2, nf5 nf5, wlf<h81> wlf, h hVar, j jVar, a<byte[]> aVar, b bVar) {
        this.a = yVar;
        this.c = z;
        this.d = z2;
        this.b = nf5;
        this.e = wlf;
        this.f = hVar;
        this.g = jVar;
        this.h = aVar;
        this.i = bVar;
    }

    @Override // defpackage.pf5
    public s<b91> a() {
        s sVar = o.a;
        if (this.d) {
            return sVar;
        }
        s<byte[]> I0 = this.h.read().v().I0(this.a);
        j jVar = this.g;
        jVar.getClass();
        return I0.j0(new a(jVar)).j0(new c(this)).j0(this.i).p0(sVar);
    }

    @Override // defpackage.pf5
    public s<b91> b() {
        if (this.c) {
            return new v(this.e.get().a());
        }
        return a().x(f());
    }

    public /* synthetic */ b91 c(b91 b91) {
        return this.b.a(b91, "cached", Boolean.TRUE);
    }

    public void d(retrofit2.v vVar) {
        e0 e0Var = (e0) vVar.a();
        if (!this.d && e0Var != null) {
            try {
                g l = e0Var.l();
                l.n(2147483647L);
                byte[] B = l.L().C().B();
                if (B.length > 0) {
                    this.h.n(B);
                }
            } catch (IOException e2) {
                Assertion.i("Failed to get response bytes", e2);
            }
        }
    }

    public /* synthetic */ b91 e(b91 b91) {
        return this.b.a(b91, "remote", Boolean.TRUE);
    }

    public s<b91> f() {
        s<retrofit2.v<e0>> N = this.f.a().I0(this.a).N(new b(this));
        j jVar = this.g;
        jVar.getClass();
        return N.j0(new e(jVar)).j0(new d(this));
    }
}
