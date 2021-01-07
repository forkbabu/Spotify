package com.spotify.music.features.followfeed.mobius;

import com.spotify.mobius.e0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class FollowFeedLoopFactory$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<r25, o25, e0<r25, n25>> {
    public static final FollowFeedLoopFactory$createLoopFactory$1 a = new FollowFeedLoopFactory$createLoopFactory$1();

    FollowFeedLoopFactory$createLoopFactory$1() {
        super(2, q25.class, "update", "update(Lcom/spotify/music/features/followfeed/mobius/domain/FeedModel;Lcom/spotify/music/features/followfeed/mobius/domain/FeedEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<r25, n25> invoke(r25 r25, o25 o25) {
        r25 r252 = r25;
        o25 o252 = o25;
        h.e(r252, "p1");
        h.e(o252, "p2");
        return q25.c(r252, o252);
    }
}
