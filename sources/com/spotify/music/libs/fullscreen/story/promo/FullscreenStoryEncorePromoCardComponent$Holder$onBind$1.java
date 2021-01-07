package com.spotify.music.libs.fullscreen.story.promo;

import com.spotify.music.libs.fullscreen.story.promo.FullscreenStoryEncorePromoCardComponent;
import com.spotify.music.libs.fullscreen.story.promo.encore.FullscreenStoryPromoCard$Events;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class FullscreenStoryEncorePromoCardComponent$Holder$onBind$1 extends Lambda implements nmf<FullscreenStoryPromoCard$Events, f> {
    final /* synthetic */ s81 $data;
    final /* synthetic */ FullscreenStoryEncorePromoCardComponent.Holder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FullscreenStoryEncorePromoCardComponent$Holder$onBind$1(FullscreenStoryEncorePromoCardComponent.Holder holder, s81 s81) {
        super(1);
        this.this$0 = holder;
        this.$data = s81;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(FullscreenStoryPromoCard$Events fullscreenStoryPromoCard$Events) {
        FullscreenStoryPromoCard$Events fullscreenStoryPromoCard$Events2 = fullscreenStoryPromoCard$Events;
        h.e(fullscreenStoryPromoCard$Events2, "event");
        int ordinal = fullscreenStoryPromoCard$Events2.ordinal();
        if (ordinal == 0) {
            FullscreenStoryEncorePromoCardComponent.Holder.B(this.this$0).b(this.$data);
        } else if (ordinal == 1) {
            FullscreenStoryEncorePromoCardComponent.Holder.B(this.this$0).a(this.$data);
        }
        return f.a;
    }
}
