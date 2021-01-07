package com.spotify.music.features.queue.v2;

import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class QueuePageElement$createLoopFactory$1 extends FunctionReferenceImpl implements cmf<Long> {
    QueuePageElement$createLoopFactory$1(cqe cqe) {
        super(0, cqe, cqe.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public Long invoke() {
        return Long.valueOf(((cqe) this.receiver).d());
    }
}
