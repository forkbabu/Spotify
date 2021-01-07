package com.spotify.music.features.search.mobius;

import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.music.connection.g;
import defpackage.dza;

public final /* synthetic */ class i implements ti0 {
    public final /* synthetic */ u0 a;
    public final /* synthetic */ bza b;

    public /* synthetic */ i(u0 u0Var, bza bza) {
        this.a = u0Var;
        this.b = bza;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        u0 u0Var = this.a;
        bza bza = this.b;
        dza.b bVar = (dza.b) obj;
        u0Var.getClass();
        Optional<yya> c = bza.c();
        String d = bza.d();
        g b2 = bza.b();
        b2.getClass();
        boolean z = b2 instanceof g.c;
        boolean c2 = bza.a().c();
        if (c.isPresent()) {
            return (b91) c.get().b(new h(u0Var, d), new l(u0Var, d), new j(u0Var, z, c2));
        }
        return HubsImmutableViewModel.EMPTY;
    }
}
