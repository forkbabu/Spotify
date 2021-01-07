package com.spotify.music.appprotocol.superbird.earcon;

import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.earcon.model.EarconAppProtocol;
import io.reactivex.s;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class EarconEndpoints$setupEndpoints$1 extends FunctionReferenceImpl implements nmf<EarconAppProtocol.PlayEarconRequest, s<AppProtocolBase.Empty>> {
    EarconEndpoints$setupEndpoints$1(EarconEndpoints earconEndpoints) {
        super(1, earconEndpoints, EarconEndpoints.class, "playEarcon", "playEarcon(Lcom/spotify/music/appprotocol/superbird/earcon/model/EarconAppProtocol$PlayEarconRequest;)Lio/reactivex/Observable;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<AppProtocolBase.Empty> invoke(EarconAppProtocol.PlayEarconRequest playEarconRequest) {
        EarconAppProtocol.PlayEarconRequest playEarconRequest2 = playEarconRequest;
        h.e(playEarconRequest2, "p1");
        return EarconEndpoints.d((EarconEndpoints) this.receiver, playEarconRequest2);
    }
}
