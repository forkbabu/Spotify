package com.spotify.music.features.followfeed.entrypoint;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* access modifiers changed from: package-private */
public final /* synthetic */ class FollowFeedButtonManagerImpl$onViewAvailable$1 extends FunctionReferenceImpl implements nmf<Boolean, f> {
    FollowFeedButtonManagerImpl$onViewAvailable$1(FollowFeedButtonManagerImpl followFeedButtonManagerImpl) {
        super(1, followFeedButtonManagerImpl, FollowFeedButtonManagerImpl.class, "logEntryPointImpression", "logEntryPointImpression(Z)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Boolean bool) {
        FollowFeedButtonManagerImpl.a((FollowFeedButtonManagerImpl) this.receiver, bool.booleanValue());
        return f.a;
    }
}
