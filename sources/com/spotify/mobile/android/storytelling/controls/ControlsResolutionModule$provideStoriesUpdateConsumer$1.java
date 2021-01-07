package com.spotify.mobile.android.storytelling.controls;

import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class ControlsResolutionModule$provideStoriesUpdateConsumer$1 extends Lambda implements nmf<gx1, f> {
    final /* synthetic */ nx1 $controls;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ControlsResolutionModule$provideStoriesUpdateConsumer$1(nx1 nx1) {
        super(1);
        this.$controls = nx1;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(gx1 gx1) {
        gx1 gx12 = gx1;
        h.e(gx12, "update");
        this.$controls.b(gx12);
        return f.a;
    }
}
