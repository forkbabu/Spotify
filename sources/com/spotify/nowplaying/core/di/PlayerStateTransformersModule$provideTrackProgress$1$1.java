package com.spotify.nowplaying.core.di;

import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class PlayerStateTransformersModule$provideTrackProgress$1$1 extends FunctionReferenceImpl implements rmf<Long, Long, dqd> {
    public static final PlayerStateTransformersModule$provideTrackProgress$1$1 a = new PlayerStateTransformersModule$provideTrackProgress$1$1();

    PlayerStateTransformersModule$provideTrackProgress$1$1() {
        super(2, dqd.class, "<init>", "<init>(JJ)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public dqd invoke(Long l, Long l2) {
        return new dqd(l.longValue(), l2.longValue());
    }
}
