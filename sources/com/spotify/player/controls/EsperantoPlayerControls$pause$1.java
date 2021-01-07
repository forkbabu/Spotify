package com.spotify.player.controls;

import com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import com.spotify.player.proto.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class EsperantoPlayerControls$pause$1 extends FunctionReferenceImpl implements nmf<EsResponseWithReasons$ResponseWithReasons, zwd> {
    public static final EsperantoPlayerControls$pause$1 a = new EsperantoPlayerControls$pause$1();

    EsperantoPlayerControls$pause$1() {
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
