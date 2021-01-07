package com.spotify.music.features.search.mobius;

import com.google.common.base.Optional;
import defpackage.dza;

public final /* synthetic */ class b implements ea2 {
    public final /* synthetic */ u0 a;

    public /* synthetic */ b(u0 u0Var) {
        this.a = u0Var;
    }

    @Override // defpackage.ea2
    public final Object apply(Object obj) {
        Optional optional;
        u0 u0Var = this.a;
        bza bza = (bza) obj;
        u0Var.getClass();
        b91 b91 = (b91) bza.e().b(new i(u0Var, bza), new k(u0Var, bza), new g(u0Var, bza), new f(u0Var, bza));
        dza e = bza.e();
        e.getClass();
        if (e instanceof dza.d) {
            dza e2 = bza.e();
            e2.getClass();
            optional = Optional.of(((dza.d) e2).f().b());
        } else {
            optional = Optional.absent();
        }
        dza e3 = bza.e();
        e3.getClass();
        return new o(b91, optional, e3 instanceof dza.a);
    }
}
