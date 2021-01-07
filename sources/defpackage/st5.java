package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.navigation.logger.c;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.features.nowplayingbar.domain.d;
import com.spotify.ubi.specification.factories.v4;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: st5  reason: default package */
public class st5 implements g<d, d> {
    private final ere a;
    private final v4 b;
    private final rt5 c;
    private Optional<vt5> f = Optional.absent();

    /* access modifiers changed from: package-private */
    /* renamed from: st5$a */
    public class a implements h<d> {
        final /* synthetic */ da2 a;

        a(da2 da2) {
            this.a = da2;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            this.a.accept(st5.a(st5.this, (d) obj));
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    public st5(ere ere, v4 v4Var, rt5 rt5) {
        this.a = ere;
        this.b = v4Var;
        this.c = rt5;
    }

    static d a(st5 st5, d dVar) {
        Object obj;
        if (!st5.f.isPresent()) {
            return dVar;
        }
        vt5 vt5 = st5.f.get();
        lt5 lt5 = new lt5(st5, vt5);
        ot5 ot5 = new ot5(st5, vt5);
        qt5 qt5 = new qt5(st5, vt5);
        it5 it5 = new it5(st5, vt5);
        jt5 jt5 = new jt5(st5, vt5);
        ht5 ht5 = new ht5(st5);
        gt5 gt5 = new gt5(st5);
        mt5 mt5 = mt5.a;
        pt5 pt5 = pt5.a;
        kt5 kt5 = kt5.a;
        nt5 nt5 = nt5.a;
        dVar.getClass();
        kotlin.jvm.internal.h.e(lt5, "ntr");
        kotlin.jvm.internal.h.e(ot5, "ptr");
        kotlin.jvm.internal.h.e(qt5, "cbc");
        kotlin.jvm.internal.h.e(it5, "hc");
        kotlin.jvm.internal.h.e(jt5, "pbc");
        kotlin.jvm.internal.h.e(ht5, "cc");
        kotlin.jvm.internal.h.e(gt5, "npbc");
        kotlin.jvm.internal.h.e(mt5, "pic");
        kotlin.jvm.internal.h.e(pt5, "ctc");
        kotlin.jvm.internal.h.e(kt5, "csc");
        kotlin.jvm.internal.h.e(nt5, "slc");
        if (dVar instanceof d.f) {
            obj = lt5.invoke(dVar);
        } else if (dVar instanceof d.j) {
            obj = ot5.invoke(dVar);
        } else if (dVar instanceof d.a) {
            obj = qt5.invoke(dVar);
        } else if (dVar instanceof d.e) {
            obj = it5.invoke(dVar);
        } else if (dVar instanceof d.h) {
            obj = jt5.invoke(dVar);
        } else if (dVar instanceof d.c) {
            obj = ht5.invoke(dVar);
        } else if (dVar instanceof d.g) {
            obj = gt5.invoke(dVar);
        } else if (dVar instanceof d.i) {
            obj = mt5.invoke(dVar);
        } else if (dVar instanceof d.C0237d) {
            obj = pt5.invoke(dVar);
        } else if (dVar instanceof d.b) {
            obj = kt5.invoke(dVar);
        } else if (dVar instanceof d.k) {
            obj = nt5.invoke(dVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return (d) obj;
    }

    public d b(vt5 vt5, d.f fVar) {
        this.a.a(this.b.e(vt5.e()));
        return fVar;
    }

    public d c(vt5 vt5, d.j jVar) {
        this.a.a(this.b.f(vt5.e()));
        return jVar;
    }

    public d d(vt5 vt5, d.a aVar) {
        this.c.a(vt5.a().a().b());
        return aVar;
    }

    public d e(vt5 vt5, d.e eVar) {
        if (vt5.d()) {
            this.a.a(this.b.b().b(vt5.e()));
        } else {
            this.a.a(this.b.b().a(vt5.e()));
        }
        return eVar;
    }

    public d f(vt5 vt5, d.h hVar) {
        String e = vt5.e();
        if (vt5.f()) {
            this.a.a(this.b.d().a(e));
        } else {
            this.a.a(this.b.d().b(e));
        }
        return hVar;
    }

    public d g(d.c cVar) {
        nqe c2 = this.b.c();
        this.a.a(c2);
        return new d.c(new c(c2.b()));
    }

    public d h(d.g gVar) {
        nqe c2 = this.b.c();
        this.a.a(c2);
        return new d.g(new c(c2.b()));
    }

    public void i(vt5 vt5) {
        this.f = Optional.fromNullable(vt5);
    }

    @Override // com.spotify.mobius.g
    public h<d> t(da2<d> da2) {
        return new a(da2);
    }
}
