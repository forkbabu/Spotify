package com.spotify.music.homecomponents.promotionv2.encore;

import com.spotify.encore.consumer.components.promo.api.promocard.PromoCardHome;
import com.spotify.music.homecomponents.promotionv2.encore.EncorePromoCardHomeComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class EncorePromoCardHomeComponent$Holder$onBind$3 extends Lambda implements nmf<PromoCardHome.Events, f> {
    final /* synthetic */ s81 $data;
    final /* synthetic */ EncorePromoCardHomeComponent.Holder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EncorePromoCardHomeComponent$Holder$onBind$3(EncorePromoCardHomeComponent.Holder holder, s81 s81) {
        super(1);
        this.this$0 = holder;
        this.$data = s81;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(PromoCardHome.Events events) {
        PromoCardHome.Events events2 = events;
        h.e(events2, "it");
        int ordinal = events2.ordinal();
        if (ordinal == 0) {
            EncorePromoCardHomeComponent.Holder.D(this.this$0).a(this.$data);
        } else if (ordinal == 1) {
            EncorePromoCardHomeComponent.Holder.D(this.this$0).b(this.$data);
        }
        return f.a;
    }
}
