package com.spotify.music.libs.fullscreen.story.promo.encore;

import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class FullscreenStoryPromoCardImpl$onEvent$$inlined$apply$lambda$1 extends Lambda implements nmf<Float, f> {
    final /* synthetic */ nmf $event$inlined;
    final /* synthetic */ nga $this_apply;
    final /* synthetic */ FullscreenStoryPromoCardImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FullscreenStoryPromoCardImpl$onEvent$$inlined$apply$lambda$1(nga nga, FullscreenStoryPromoCardImpl fullscreenStoryPromoCardImpl, nmf nmf) {
        super(1);
        this.$this_apply = nga;
        this.this$0 = fullscreenStoryPromoCardImpl;
        this.$event$inlined = nmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Float f) {
        float floatValue = f.floatValue();
        int[] iArr = new int[2];
        this.$this_apply.b.getLocationOnScreen(iArr);
        if (floatValue <= ((float) iArr[0])) {
            this.$event$inlined.invoke(FullscreenStoryPromoCard$Events.StoryClicked);
        } else {
            this.$event$inlined.invoke(FullscreenStoryPromoCard$Events.ItemClicked);
        }
        return f.a;
    }
}
