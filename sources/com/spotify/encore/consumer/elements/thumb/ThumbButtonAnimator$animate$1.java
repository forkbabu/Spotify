package com.spotify.encore.consumer.elements.thumb;

import kotlin.f;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class ThumbButtonAnimator$animate$1 extends Lambda implements cmf<f> {
    final /* synthetic */ ThumbButtonView $thumb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ThumbButtonAnimator$animate$1(ThumbButtonView thumbButtonView) {
        super(0);
        this.$thumb = thumbButtonView;
    }

    @Override // defpackage.cmf
    public final void invoke() {
        ThumbButtonAnimator.rotateAndBloat$default(ThumbButtonAnimator.INSTANCE, this.$thumb, 25.0f, -0.2f, ThumbButtonAnimatorKt.access$getDECELERATE$p(), null, 8, null);
    }
}
