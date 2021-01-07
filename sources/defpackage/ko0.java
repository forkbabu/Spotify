package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.mobius.e0;
import com.spotify.mobius.s;
import defpackage.io0;
import defpackage.jo0;
import defpackage.lo0;
import defpackage.mo0;
import java.util.HashSet;

/* renamed from: ko0 */
public final class ko0 {
    public static s<lo0, io0> a(lo0 lo0) {
        return s.c(lo0, z42.l(new io0.b(lo0.b(), lo0.f())));
    }

    static e0 b(lo0 lo0, jo0.e eVar) {
        mo0.b bVar = new mo0.b(eVar.h());
        lo0.a d = lo0.d();
        d.e(bVar);
        lo0 b = d.b();
        HashSet hashSet = new HashSet();
        hashSet.add(new io0.d());
        if (b.c() != null) {
            hashSet.addAll(d(b, new jo0.c(b.c().a(), b.c().b())).b());
        }
        lo0.a d2 = b.d();
        d2.d(null);
        return e0.g(d2.b(), hashSet);
    }

    public static e0<lo0, io0> d(lo0 lo0, jo0.c cVar) {
        mo0 e = lo0.e();
        e.getClass();
        if (e instanceof mo0.a) {
            fo0 fo0 = new fo0(cVar.h(), cVar.i());
            lo0.a d = lo0.d();
            d.d(fo0);
            return e0.f(d.b());
        }
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        mo0 e2 = lo0.e();
        e2.getClass();
        UnmodifiableListIterator<gp0> listIterator = ((mo0.b) e2).a().listIterator();
        while (listIterator.hasNext()) {
            gp0 next = listIterator.next();
            if (next.e() == cVar.i() && next.f(cVar.h()) && lo0.b().contains(next.b())) {
                builder.mo53add((ImmutableList.Builder) next);
            }
        }
        ImmutableList build = builder.build();
        if (!build.isEmpty()) {
            return e0.a(z42.l(new io0.c(cVar.h(), cVar.i(), build, lo0.b(), lo0.a())));
        }
        return e0.h();
    }
}
