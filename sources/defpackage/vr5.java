package defpackage;

import com.spotify.mobile.android.waze.model.b;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.v;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: vr5  reason: default package */
public class vr5 {
    private final j4a a;
    private final b b;
    private final Set<wa2> c;
    private final mla d;
    private final s<Boolean> e;
    private final s<Boolean> f;

    public vr5(j4a j4a, mla mla, Set<wa2> set, b bVar, s<Boolean> sVar, s<Boolean> sVar2) {
        this.a = j4a;
        this.d = mla;
        this.c = set;
        this.b = bVar;
        this.e = sVar;
        this.f = sVar2;
    }

    public s<Boolean> a() {
        ArrayList arrayList = new ArrayList(this.c.size());
        for (wa2 wa2 : this.c) {
            wa2.getClass();
            arrayList.add(s.y(new oa2(wa2)).G0(Boolean.valueOf(wa2.E2())));
        }
        return s.p(arrayList, sq5.a).E();
    }

    public s<Boolean> b() {
        return this.d.a().f1(this.e, zq5.a).J0(new uq5(this));
    }

    public s<Boolean> c() {
        return this.b.b().Q(xq5.a).j0(vq5.a);
    }

    public /* synthetic */ v d(Boolean bool) {
        return this.f.P0(tr5.a).j0(new wq5(bool));
    }

    public v e(u3 u3Var) {
        F f2 = u3Var.a;
        f2.getClass();
        S s = u3Var.b;
        s.getClass();
        Boolean valueOf = Boolean.valueOf(!s.booleanValue());
        if (!f2.booleanValue() || !valueOf.booleanValue()) {
            return o.a;
        }
        return this.a.b().J0(new tq5(this)).E();
    }
}
