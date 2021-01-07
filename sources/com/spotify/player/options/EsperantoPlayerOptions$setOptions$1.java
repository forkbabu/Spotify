package com.spotify.player.options;

import com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import com.spotify.player.proto.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class EsperantoPlayerOptions$setOptions$1 extends FunctionReferenceImpl implements nmf<EsResponseWithReasons$ResponseWithReasons, zwd> {
    public static final EsperantoPlayerOptions$setOptions$1 a = new EsperantoPlayerOptions$setOptions$1();

    EsperantoPlayerOptions$setOptions$1() {
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
