package com.spotify.music.features.followfeed.hubs.components;

import defpackage.o25;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class ExpandableReleaseComponentBinder$bindView$4 extends Lambda implements cmf<f> {
    final /* synthetic */ String $entityUri;
    final /* synthetic */ int $itemPosition;
    final /* synthetic */ String $title;
    final /* synthetic */ c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExpandableReleaseComponentBinder$bindView$4(c cVar, int i, String str, String str2) {
        super(0);
        this.this$0 = cVar;
        this.$itemPosition = i;
        this.$entityUri = str;
        this.$title = str2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        this.this$0.b.a(new o25.g(this.$itemPosition, this.$entityUri, this.$title));
        return f.a;
    }
}
