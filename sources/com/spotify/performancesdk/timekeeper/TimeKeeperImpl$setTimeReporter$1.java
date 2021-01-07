package com.spotify.performancesdk.timekeeper;

import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class TimeKeeperImpl$setTimeReporter$1 extends Lambda implements cmf<f> {
    final /* synthetic */ TimeKeeperImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TimeKeeperImpl$setTimeReporter$1(TimeKeeperImpl timeKeeperImpl) {
        super(0);
        this.this$0 = timeKeeperImpl;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        TimeKeeperImpl.b(this.this$0);
        return f.a;
    }
}
