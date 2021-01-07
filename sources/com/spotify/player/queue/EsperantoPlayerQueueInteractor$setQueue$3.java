package com.spotify.player.queue;

import com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import com.spotify.player.proto.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class EsperantoPlayerQueueInteractor$setQueue$3 extends FunctionReferenceImpl implements nmf<EsResponseWithReasons$ResponseWithReasons, zwd> {
    public static final EsperantoPlayerQueueInteractor$setQueue$3 a = new EsperantoPlayerQueueInteractor$setQueue$3();

    EsperantoPlayerQueueInteractor$setQueue$3() {
        super(1, a.class, "commandResultFromProto", "commandResultFromProto(Lcom/spotify/player/esperanto/proto/EsResponseWithReasons$ResponseWithReasons;)Lcom/spotify/player/CommandResult;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public zwd invoke(EsResponseWithReasons$ResponseWithReasons esResponseWithReasons$ResponseWithReasons) {
        EsResponseWithReasons$ResponseWithReasons esResponseWithReasons$ResponseWithReasons2 = esResponseWithReasons$ResponseWithReasons;
        h.e(esResponseWithReasons$ResponseWithReasons2, "p1");
        return a.a(esResponseWithReasons$ResponseWithReasons2);
    }
}
