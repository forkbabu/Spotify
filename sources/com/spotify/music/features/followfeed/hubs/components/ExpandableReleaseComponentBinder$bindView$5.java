package com.spotify.music.features.followfeed.hubs.components;

import defpackage.o25;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class ExpandableReleaseComponentBinder$bindView$5 extends Lambda implements cmf<f> {
    final /* synthetic */ List $artists;
    final /* synthetic */ String $entityUri;
    final /* synthetic */ int $itemPosition;
    final /* synthetic */ c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExpandableReleaseComponentBinder$bindView$5(c cVar, int i, String str, List list) {
        super(0);
        this.this$0 = cVar;
        this.$itemPosition = i;
        this.$entityUri = str;
        this.$artists = list;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        this.this$0.b.a(new o25.q(this.$itemPosition, this.$entityUri, this.$artists));
        return f.a;
    }
}
