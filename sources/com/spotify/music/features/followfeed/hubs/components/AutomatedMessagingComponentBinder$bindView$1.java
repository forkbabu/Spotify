package com.spotify.music.features.followfeed.hubs.components;

import defpackage.o25;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class AutomatedMessagingComponentBinder$bindView$1 extends Lambda implements cmf<f> {
    final /* synthetic */ String $itemId;
    final /* synthetic */ int $itemPosition;
    final /* synthetic */ String $uri;
    final /* synthetic */ a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AutomatedMessagingComponentBinder$bindView$1(a aVar, String str, int i, String str2) {
        super(0);
        this.this$0 = aVar;
        this.$itemId = str;
        this.$itemPosition = i;
        this.$uri = str2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        this.this$0.b.a(new o25.c(this.$itemId, this.$itemPosition, this.$uri));
        return f.a;
    }
}
