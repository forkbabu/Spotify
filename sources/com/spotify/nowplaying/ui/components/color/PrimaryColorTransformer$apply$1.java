package com.spotify.nowplaying.ui.components.color;

import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class PrimaryColorTransformer$apply$1 extends FunctionReferenceImpl implements nmf<ContextTrack, String> {
    public static final PrimaryColorTransformer$apply$1 a = new PrimaryColorTransformer$apply$1();

    PrimaryColorTransformer$apply$1() {
        super(1, ContextTrack.class, "uri", "uri()Ljava/lang/String;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public String invoke(ContextTrack contextTrack) {
        ContextTrack contextTrack2 = contextTrack;
        h.e(contextTrack2, "p1");
        return contextTrack2.uri();
    }
}
