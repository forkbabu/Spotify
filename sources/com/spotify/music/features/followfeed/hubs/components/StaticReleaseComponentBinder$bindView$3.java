package com.spotify.music.features.followfeed.hubs.components;

import defpackage.o25;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class StaticReleaseComponentBinder$bindView$3 extends Lambda implements cmf<f> {
    final /* synthetic */ String $entityUri;
    final /* synthetic */ String $firstTrackUri;
    final /* synthetic */ String $itemId;
    final /* synthetic */ int $itemPosition;
    final /* synthetic */ k this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StaticReleaseComponentBinder$bindView$3(k kVar, String str, int i, String str2, String str3) {
        super(0);
        this.this$0 = kVar;
        this.$itemId = str;
        this.$itemPosition = i;
        this.$entityUri = str2;
        this.$firstTrackUri = str3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        this.this$0.b.a(new o25.r(this.$itemId, this.$itemPosition, this.$entityUri, this.$firstTrackUri));
        return f.a;
    }
}
