package com.spotify.music.features.followfeed.hubs.components;

import defpackage.o25;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class StaticReleaseComponentBinder$bindView$1 extends Lambda implements cmf<f> {
    final /* synthetic */ String $artistUri;
    final /* synthetic */ String $entityUri;
    final /* synthetic */ int $itemPosition;
    final /* synthetic */ k this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StaticReleaseComponentBinder$bindView$1(k kVar, int i, String str, String str2) {
        super(0);
        this.this$0 = kVar;
        this.$itemPosition = i;
        this.$entityUri = str;
        this.$artistUri = str2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        this.this$0.b.a(new o25.a(this.$itemPosition, this.$entityUri, this.$artistUri));
        return f.a;
    }
}
