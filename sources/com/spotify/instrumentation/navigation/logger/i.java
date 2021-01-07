package com.spotify.instrumentation.navigation.logger;

import com.spotify.instrumentation.navigation.logger.g;
import com.spotify.mobius.h;

public final class i implements h<g> {
    final /* synthetic */ m a;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    i(m mVar) {
        this.a = mVar;
    }

    @Override // com.spotify.mobius.h, defpackage.da2
    public void accept(Object obj) {
        g gVar = (g) obj;
        kotlin.jvm.internal.h.e(gVar, "effect");
        if (gVar instanceof g.a) {
            g.a aVar = (g.a) gVar;
            this.a.e().a(aVar.e(), aVar.c(), aVar.a(), aVar.b(), aVar.d());
        }
    }

    @Override // com.spotify.mobius.h, defpackage.w92
    public void dispose() {
    }
}
