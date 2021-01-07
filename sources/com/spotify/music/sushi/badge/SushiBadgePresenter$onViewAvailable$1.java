package com.spotify.music.sushi.badge;

import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class SushiBadgePresenter$onViewAvailable$1 extends Lambda implements nmf<f, f> {
    final /* synthetic */ SushiBadgePresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SushiBadgePresenter$onViewAvailable$1(SushiBadgePresenter sushiBadgePresenter) {
        super(1);
        this.this$0 = sushiBadgePresenter;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(f fVar) {
        h.e(fVar, "it");
        SushiBadgePresenter.c(this.this$0);
        return f.a;
    }
}
