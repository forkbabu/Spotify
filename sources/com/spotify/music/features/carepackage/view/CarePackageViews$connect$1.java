package com.spotify.music.features.carepackage.view;

import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class CarePackageViews$connect$1 extends Lambda implements cmf<f> {
    final /* synthetic */ da2 $eventConsumer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CarePackageViews$connect$1(da2 da2) {
        super(0);
        this.$eventConsumer = da2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        this.$eventConsumer.accept(vg4.a);
        return f.a;
    }
}
