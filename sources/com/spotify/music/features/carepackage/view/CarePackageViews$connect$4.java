package com.spotify.music.features.carepackage.view;

import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class CarePackageViews$connect$4 extends Lambda implements cmf<f> {
    final /* synthetic */ da2 $eventConsumer;
    final /* synthetic */ int $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CarePackageViews$connect$4(da2 da2, int i) {
        super(0);
        this.$eventConsumer = da2;
        this.$position = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        this.$eventConsumer.accept(new ih4(this.$position));
        return f.a;
    }
}
