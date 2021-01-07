package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobius.e0;
import com.spotify.music.sociallistening.models.b;
import defpackage.h6d;
import defpackage.i6d;
import defpackage.k6d;
import java.util.Collection;

/* renamed from: j6d  reason: default package */
public final class j6d {
    private static boolean a(k6d k6d) {
        return k6d.a().isPresent() && !k6d.a().get().booleanValue();
    }

    static e0 b(k6d k6d, i6d.m mVar) {
        b p = mVar.p();
        k6d.a c = k6d.c();
        c.c(Optional.of(p));
        return e0.f(h(c.a()));
    }

    static e0 c(k6d k6d, i6d.g gVar) {
        return e0.a(z42.l(new h6d.l(a(k6d))));
    }

    static e0 d(k6d k6d, i6d.c cVar) {
        return e0.a(z42.l(new h6d.h(a(k6d))));
    }

    static e0 e(k6d k6d, i6d.e eVar) {
        return e0.a(z42.l(new h6d.i(a(k6d))));
    }

    static e0 f(k6d k6d, i6d.f fVar) {
        return e0.a(z42.l(new h6d.k(a(k6d))));
    }

    static e0 g(k6d k6d, i6d.o oVar) {
        return e0.g(h(k6d), z42.l(new h6d.c(false)));
    }

    private static k6d h(k6d k6d) {
        b or = k6d.b().or((Optional<b>) b.n);
        boolean g = or.g();
        boolean a = or.a();
        boolean z = false;
        boolean z2 = or.d().size() >= 2;
        boolean z3 = or.k() || or.j() || or.l();
        boolean e = or.e();
        boolean z4 = !or.d().isEmpty();
        k6d.a c = k6d.c();
        k6d.b.a n = k6d.d().n();
        n.a(g);
        n.j(ImmutableList.copyOf((Collection) or.d()));
        n.f(z2);
        n.m(e);
        n.h(z3);
        n.e(!a && !z3 && z4);
        n.n(!a && !z3 && !g);
        n.l(!a && !z3 && g);
        n.k(!a && !z3 && !g);
        n.g(!a && !z3 && g && !or.h());
        n.c(!a && !z3 && g && or.h());
        if (!z3 && a) {
            z = true;
        }
        n.d(z);
        c.d(n.b());
        return c.a();
    }
}
