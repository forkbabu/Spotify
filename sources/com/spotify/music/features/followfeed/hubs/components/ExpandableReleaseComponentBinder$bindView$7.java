package com.spotify.music.features.followfeed.hubs.components;

import defpackage.o25;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class ExpandableReleaseComponentBinder$bindView$7 extends Lambda implements nmf<Boolean, f> {
    final /* synthetic */ String $itemId;
    final /* synthetic */ c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExpandableReleaseComponentBinder$bindView$7(c cVar, String str) {
        super(1);
        this.this$0 = cVar;
        this.$itemId = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Boolean bool) {
        this.this$0.b.a(new o25.h(this.$itemId, bool.booleanValue()));
        return f.a;
    }
}
