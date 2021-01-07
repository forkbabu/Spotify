package com.spotify.player.di;

import com.spotify.cosmos.router.RxRouter;
import com.spotify.player.esperanto.proto.k;
import kotlin.jvm.internal.h;

public final class d implements fjf<k.b> {
    private final c a;
    private final wlf<RxRouter> b;

    public d(c cVar, wlf<RxRouter> wlf) {
        this.a = cVar;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        c cVar = this.a;
        RxRouter rxRouter = this.b.get();
        cVar.getClass();
        h.e(rxRouter, "rxRouter");
        k.b a2 = k.a(new xj0(new b(new ContextPlayerClientModule$provideContextPlayerClient$1(rxRouter))));
        h.d(a2, "EsContextPlayerEsperanto…sport(rxRouter::resolve))");
        return a2;
    }
}
