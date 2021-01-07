package com.spotify.nowplaying.container;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class NowPlayingModeTransformer$apply$3 extends FunctionReferenceImpl implements nmf<cqd, String> {
    public static final NowPlayingModeTransformer$apply$3 a = new NowPlayingModeTransformer$apply$3();

    NowPlayingModeTransformer$apply$3() {
        super(1, cqd.class, "name", "name()Ljava/lang/String;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public String invoke(cqd cqd) {
        cqd cqd2 = cqd;
        h.e(cqd2, "p1");
        return cqd2.name();
    }
}
