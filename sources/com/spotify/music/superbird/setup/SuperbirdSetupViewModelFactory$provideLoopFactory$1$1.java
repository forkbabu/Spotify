package com.spotify.music.superbird.setup;

import com.spotify.mobius.e0;
import com.spotify.music.superbird.setup.domain.d;
import com.spotify.music.superbird.setup.domain.f;
import com.spotify.music.superbird.setup.domain.o;
import com.spotify.music.superbird.setup.domain.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class SuperbirdSetupViewModelFactory$provideLoopFactory$1$1 extends FunctionReferenceImpl implements rmf<p, f, e0<p, d>> {
    SuperbirdSetupViewModelFactory$provideLoopFactory$1$1(o oVar) {
        super(2, oVar, o.class, "update", "update(Lcom/spotify/music/superbird/setup/domain/SetupModel;Lcom/spotify/music/superbird/setup/domain/SetupEvent;)Lcom/spotify/mobius/Next;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<p, d> invoke(p pVar, f fVar) {
        p pVar2 = pVar;
        f fVar2 = fVar;
        h.e(pVar2, "p1");
        h.e(fVar2, "p2");
        return ((o) this.receiver).a(pVar2, fVar2);
    }
}
