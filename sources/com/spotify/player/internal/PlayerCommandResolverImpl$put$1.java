package com.spotify.player.internal;

import com.spotify.cosmos.router.Response;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class PlayerCommandResolverImpl$put$1 extends FunctionReferenceImpl implements nmf<Response, zwd> {
    public static final PlayerCommandResolverImpl$put$1 a = new PlayerCommandResolverImpl$put$1();

    PlayerCommandResolverImpl$put$1() {
        super(1, f.class, "parseCommandResult", "parseCommandResult(Lcom/spotify/cosmos/router/Response;)Lcom/spotify/player/CommandResult;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public zwd invoke(Response response) {
        Response response2 = response;
        h.e(response2, "p1");
        return f.a(response2);
    }
}
