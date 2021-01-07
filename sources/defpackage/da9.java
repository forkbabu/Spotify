package defpackage;

import com.spotify.mobius.rx2.m;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.preview.v;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: da9  reason: default package */
public class da9 implements z99 {
    private final v a;
    private final od9 b;
    private final bec c;
    private final y d;

    public da9(v vVar, od9 od9, bec bec, y yVar) {
        this.a = vVar;
        this.b = od9;
        this.c = bec;
        this.d = yVar;
    }

    public static s b(da9 da9, r0.o0 o0Var) {
        return da9.c.a(o0Var.a().A()).v(new o89(da9, o0Var));
    }

    public static s c(da9 da9, r0.f1 f1Var) {
        return da9.b.c(f1Var.a(), f1Var.b(), f1Var.c()).N().j0(u89.a).r0(s89.a);
    }

    @Override // defpackage.z99
    public void a(m<r0, s0> mVar) {
        mVar.e(r0.n0.class, new q89(this), this.d);
        mVar.e(r0.g1.class, new v89(this), this.d);
        mVar.h(r0.f1.class, new t89(this));
        mVar.h(r0.o0.class, new p89(this));
    }

    public /* synthetic */ io.reactivex.v d(s sVar) {
        return sVar.o0(this.d).J0(new l89(this));
    }

    public /* synthetic */ io.reactivex.v e(s sVar) {
        return sVar.o0(this.d).J0(new n89(this));
    }

    public /* synthetic */ void f(r0.n0 n0Var) {
        this.a.k(n0Var.a());
    }

    public io.reactivex.v g(r0.o0 o0Var, Boolean bool) {
        if (!bool.booleanValue()) {
            return o.a;
        }
        return this.b.b(o0Var.a(), o0Var.b(), o0Var.c(), o0Var.d()).N().j0(r89.a).r0(m89.a);
    }

    public /* synthetic */ void h(r0.g1 g1Var) {
        this.a.j(g1Var.a());
    }
}
