package com.spotify.music.features.followfeed.hubs.components;

import defpackage.o25;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class ExpandableReleaseComponentBinder$bindView$2 extends Lambda implements cmf<f> {
    final /* synthetic */ String $entityUri;
    final /* synthetic */ String $itemId;
    final /* synthetic */ int $itemPosition;
    final /* synthetic */ c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExpandableReleaseComponentBinder$bindView$2(c cVar, String str, int i, String str2) {
        super(0);
        this.this$0 = cVar;
        this.$itemId = str;
        this.$itemPosition = i;
        this.$entityUri = str2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        this.this$0.b.a(new o25.f(this.$itemId, this.$itemPosition, this.$entityUri));
        return f.a;
    }
}
