package com.spotify.music.features.nowplayingbar;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* access modifiers changed from: package-private */
public final /* synthetic */ class NowPlayingBarInjector$createEventSource$1 extends FunctionReferenceImpl implements cmf<Long> {
    NowPlayingBarInjector$createEventSource$1(cqe cqe) {
        super(0, cqe, cqe.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public Long invoke() {
        return Long.valueOf(((cqe) this.receiver).d());
    }
}
